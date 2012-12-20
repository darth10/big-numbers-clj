(ns big-numbers.fibonacci)

(def fibo-seq
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))

(defn fibo-lazy [n]
  (take n fibo-seq))

(defn fibo-lazy-last [n]
  (last (fibo-lazy n)))
