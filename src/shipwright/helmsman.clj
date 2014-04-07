(ns shipwright.helmsman
  (:require [ring.util.response :refer [resource-response]]
            [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.file-info :refer [wrap-file-info]]
            [ring.middleware.head :refer [wrap-head]]))

(def bootstrap-css "bootstrap/css/bootstrap.css")
(def bootstrap-css-theme "bootstrap/css/bootstrap-theme.css")
(def bootstrap-js "bootstrap/js/bootstrap.js")

(defn css-handler
  [request]
  (resource-response bootstrap-css))

(defn css-theme-handler
  (resource-response bootstrap-css-theme))

(defn js-handler
  (resource-response bootstrap-js))

(defn add-bootstrap
  [helmsman-definition]
  (into helmsman-definition
        [:context "bootstrap"
         ^{:id :bootstrap/css}
         [:get "css"]
         ^{:id :bootstrap/css-theme}
         [:get "css-theme"]
         ^{:id :bootstrap/js}
         [:get "js"]
         [wrap-file-info]
         [wrap-content-type]
         [wrap-head]]))
