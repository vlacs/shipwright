(defproject shipwright "0.1.0"
  :description "Provides a basic shared template mechanism to provide consistant top-level
               look and feel to the web appliction without duplicating too much code and
               markup."
  :url "https://www.github.com/vlacs/shipwright"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.vlacs/helmsman "0.1.9"]
                 [enlive "1.1.5"]
                 [ring "1.2.2"]]
  :pedantic? :warn
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :source-paths ["dev"]}})
