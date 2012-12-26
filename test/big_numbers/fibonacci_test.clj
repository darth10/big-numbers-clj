(ns big-numbers.fibonacci-test
  (:use clojure.test
        big-numbers.fibonacci))

(deftest fibo-lazy-length-test
  (testing ""
    (is (= (count (fibo-lazy 10)) 10))))

(deftest fibo-last-1-test
  (testing "First Fibonacci number"
    (is (= (fibo-lazy-last 1) 0))))

(deftest fibo-last-2-test
  (testing "Second Fibonacci number"
    (is (= (fibo-lazy-last 2) 1))))

(deftest fibo-last-1000-test
  (testing "1000th Fibonacci number"
    (is (= (fibo-lazy-last 1000) 26863810024485359386146727202142923967616609318986952340123175997617981700247881689338369654483356564191827856161443356312976673642210350324634850410377680367334151172899169723197082763985615764450078474174626))))
