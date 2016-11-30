(defproject cljs-test "0.1.0-SNAPSHOT"
  :description "A simple example of how to use lein-cljsbuild"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "0.0-3211"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
              :builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :ring {:handler cljs-test.routes/app})
