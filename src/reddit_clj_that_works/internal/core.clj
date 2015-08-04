(ns reddit-clj-that-works.reddit
  (:require [org.httpkit.client :as http]
            [reddit-clj-that-works.internal.core :as core]))

;; --- Auth and login --

(defn login
  "Log in to a reddit account and initalise certan network functionality."
  [username password client-id client-secret user-agent]
  (let [options-unauth {:user-agent user-agent}]
    (let [auth (core/auto-auth username password client-id client-secret options-unauth)]
      {:username username
       :password password
       :client-id client-id
       :client-seceret client-secret
       :user-agent user-agent
       :auth auth})))

(defn user-agent
  "Forms a user agent in the reddit reccomended way."
  [platform app-id version creator-username]
  (str platform ":" app-id ":" version " (by /u/" creator-username ")"))(ns reddit-clj-that-works.internal.core
  "Core functionality for reddit api wrapper")

(defmacro reddit
  "For internal use in generating urls."
  [& rest]
  (str "http://www.reddit.com/" (clojure.string/join "/" rest)))
