(def project-version (if-let [build-num (System/getenv "CIRCLE_BUILD_NUM")]
                       (str "0.2." build-num)
                       "0.2.0-SNAPSHOT"))

(defproject circleci/tentacles project-version
  :description "A library for working with the Github API."
  :url "https://github.com/Raynes/tentacles"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "1.0.1"]
                 [cheshire "5.4.0"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/data.codec "0.1.0"]
                 [environ "1.0.0"]]

  :profiles {:dev {:plugins [[test2junit "1.4.2"]]}}

  :repositories [["releases" {:url "https://clojars.org/repo"
                              :username :env/clojars_username
                              :password :env/clojars_password
                              :sign-releases false}]
                 ["snapshots" {:url "https://clojars.org/repo"
                               :username :env/clojars_username
                               :password :env/clojars_password
                               :sign-releases false}]])
