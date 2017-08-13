(ns leiningen.new.scad
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "scad"))

(defn scad
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' scad project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/{{sanitized}}/thing.clj" (render "thing.clj" data)]
             ["src/{{sanitized}}/utils.clj" (render "utils.clj" data)]
             ["project.clj" (render "project.clj" data)]
             )))
