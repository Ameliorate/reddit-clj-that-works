(defproject reddit-clj-that-works "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cheshire "5.5.0"]
                 [http-kit "2.1.18"]]
  :main ^:skip-aot reddit-clj-that-works.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
