(ns reddit-clj-that-works.internal.core
  "Core functionality for reddit api wrapper")

(defmacro reddit
  "For internal use in generating urls."
  [& rest]
  (str "http://www.reddit.com/" (clojure.string/join "/" rest)))