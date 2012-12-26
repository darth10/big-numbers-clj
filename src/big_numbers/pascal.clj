(ns big-numbers.pascal)

(def pascal
  (iterate
   (fn [prev-row]
     (->>
      (concat [[(first prev-row)]] (partition 2 1 prev-row) [[(last prev-row)]])
      (map (partial apply +))))
   [1N]))

(defn pascal-lazy [n]
  (last (take n pascal)))

(defn pascal-lazy-max [n]
  (reduce max (pascal-lazy n)))
