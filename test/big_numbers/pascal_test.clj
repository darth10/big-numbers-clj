(ns big-numbers.pascal-test
  (:use clojure.test
        big-numbers.pascal))

(deftest pascal-test-1
  (testing "First Pascal triangle row"
    (let [row (pascal-lazy 1)]
      (is (and (= (first row) 1)
               (= (count row) 1))))))

(deftest pascal-test-2
  (testing "Second Pascal triangle row"
    (let [row (pascal-lazy 2)]
      (is (and (= (first row) (second row) 1)
               (= (count row) 2))))))

(deftest pascal-test-500
  (testing "500th Pascal triangle row"
    (is
     (and
      (= (count (pascal-lazy 500)) 500)
      (= (pascal-lazy-max 500) 58372157894138841460467367381088309829615040590155723062050142478905556336804236857833208887760802688405432951354994790080018734113196950021398436128)))))
