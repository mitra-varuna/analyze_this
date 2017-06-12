(defproject analyze_thesis "0.1.0-SNAPSHOT"
  :description "A project to analyze thesis project proposals"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.novemberain/pantomime "2.9.0"]
                 [io.framed/overseer "0.8.6"]
                 [clojure-opennlp "0.4.0"]]
  :main ^:skip-aot analyze-thesis.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
