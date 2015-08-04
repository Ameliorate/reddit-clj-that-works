(ns reddit-clj-that-works.internal.util
  "Simple utilities that reduce boilerplate.")

(defmacro forever
  "Executes the body functions forever or untill the program is fourcefully ended."
  [& body]
  `(while true ~@body))

(defmacro forever-thread
  "Executes the body functions forever in a new thread."
  [& body]
  `(future (forever ~@body)))(ns reddit-clj-that-works.internal.util)
