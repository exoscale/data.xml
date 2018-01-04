(defproject exoscale/data.xml "0.0.8.1"
  :description "Functions to parse XML into lazy sequences and lazy trees and emit these as text"
  :url "https://github.com/exoscale/data.xml"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
   :plugins [[lein-codox   "0.10.2"]
             [lein-ancient "0.6.15"]]
  :source-paths ["src/main/clojure/"]
  :test-paths ["src/test/clojure/"]
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :global-vars {*warn-on-reflection* true})
