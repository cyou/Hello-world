(ns helloworld.core
  (:use compojure.core, ring.adapter.jetty)
  (:require [compojure.route :as route]))
(defn index []
  (doseq [a (range 0 100)] 
    (println "a"))
  :done)

(defroutes main-routes
  (GET "/index" [] (index))
  (route/not-found "<h1>no found</h1>"))

(run-jetty main-routes {:port 8088})


