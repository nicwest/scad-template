(ns {{sanitized}}.thing
  (:require [scad-clj.model :refer [difference sphere cube translate union 
                                    rotate]]
            [{{sanitized}}.utils :refer [render!]]))

(def thing
  (difference
    (cube 100 100 100)
    (union
      (->> (sphere 50)
           (translate [50 0 0])
           (rotate (/ Math/PI 4) [0 1 0]))
      (->> (sphere 50)
           (translate [-50 0 0])
           (rotate (/ Math/PI 4) [0 1 0])))))

(defn render-things!
  []
  (render! "thing" thing))

;(render-things!)
