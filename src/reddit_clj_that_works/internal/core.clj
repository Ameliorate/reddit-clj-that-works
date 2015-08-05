(ns reddit-clj-that-works.internal.core
  "Core functionality for reddit api wrapper"
  (:require [cheshire.core :as json]
            [reddit-clj-that-works.internal.util :as util]))

;; --- Auth and login ---

(defn auth
  "Creates an auth object"
  [username password client-id client-secret options]
  (json/parse-string (http/post (conj options {:url "https://www.reddit.com/api/v1/access_token"
                                               :query-params {"grant_type=password" (str "username=" username) (str "password=" password)}
                                               :basic-auth [client-id client-secret]})) true))

(defn auto-auth
  "Automatically refreshes an auth atom every 50 minutes."
  [username password client-id client-secret options]
  (let [auth (atom (auth username password client-id client-secret options))]
    (util/forever-thread
      (Thread/sleep (* 1000 (* 60 50)))
      (swap! auth (fn [_] (auth username password client-id client-secret options))))
    auth))
