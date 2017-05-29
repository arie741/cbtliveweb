(ns cbtliveweb.routes.home
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [net.cgrand.enlive-html :refer [deftemplate defsnippet]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(deftemplate home "public/index.html" [])

(defroutes app-routes
  (GET "/" [] (home))
  (route/not-found "Not Found"))
