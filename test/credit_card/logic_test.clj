(ns credit_card.logic-test
  (:use clojure.pprint)
  (:require [clojure.test :refer :all]
            [credit_card.logic-test :refer :all]
            [credit_card.logic.logic :refer :all]
            [schema.core :as s]))

(s/set-fn-validation! true)

(deftest sum-total-test

  (testing "Testing sum function"
    (let [prices [{:price 10}, {:price 15}]]
      (is (= 25
             (sum-total prices))))))

(deftest total-expenses-by-category-test

  (testing "Testing total expenses byn category"
    (let [expenses ["food" [{:price 20, :category "food"}, {:price 40, :category "food"}]]]
    (is (= {:category "food", :total-expenses 60}
           (total-expenses-by-category expenses))))))
