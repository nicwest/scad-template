(ns {{sanitized}}.core
  (:require [{{sanitized}}.thing :refer [render-things!]]
  (:gen-class)))


(defn -main
  "render all of the parts and sub parts"
  [& args]
  (render-things!))

