(ns helloworld.core
  (:use compojure.core, ring.adapter.jetty)
  (:require [compojure.route :as route]))
(defn install-m3o []
  (doseq [a (range 0 100)] 
    (println "a"))
  "this is down")

(defroutes main-routes
  (GET "/install" [] (install-m3o))
  (route/not-found "<h1>no found</h1>"))

(run-jetty main-routes {:port 8088})


