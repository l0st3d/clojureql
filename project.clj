(defproject clojureql "1.0.4"
  :description      "Superior SQL integration for Clojure"
  :url              "http://clojureql.org/"
  :license          {:name "Eclipse Public License - v 1.0"
                     :url  "http://www.eclipse.org/legal/epl-v10.html"}
  
  :source-path "src"
  :dependencies     [[org.clojure/clojure         "1.5.1"]
                     [org.clojure/core.incubator  "0.1.3"]
                     [org.clojure/java.jdbc       "0.2.3"]]
  :profiles {
    :dev {
      :dependencies [[mysql/mysql-connector-java  "5.1.25"]
                     [org.xerial/sqlite-jdbc      "3.7.2"]
                     [org.postgresql/postgresql   "9.2-1003-jdbc4"]
                     [org.apache.derby/derby      "10.10.1.1"]]}} 

  :min-lein-version "2.2.0"

  :globa-vars { *warn-on-reflection* true }

  :repositories {"clojure-releases"  {:url "http://build.clojure.org/releases"}
                 "clojure-snapshots"  {:url "http://build.clojure.org/snapshots"}})
