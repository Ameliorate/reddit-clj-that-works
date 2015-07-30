(defproject reddit-clj-that-works "0.01"
  :description "A reddit api wrapper designed to work with the recent api changes."
  :url "https://github.com/Ameliorate/reddit-clj-that-works"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cheshire "5.5.0"]
                 [http-kit "2.1.18"]]
  :main ^:skip-aot reddit-clj-that-works.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
