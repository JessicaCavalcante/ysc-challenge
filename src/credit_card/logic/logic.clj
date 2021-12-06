(ns credit_card.logic.logic
  (:require [credit_card.db.order :as db.order])
  (:require [schema.core :as s]))


(defn sum-total
  [details]
  (->> details
       (map :price)
       (reduce +)
       ))

(defn total-expenses-by-category
  [[category expenses]]
  {:category       category
   :total-expenses (sum-total expenses)})

(defn expenses-by-category
  [expenses]
  (->> expenses
       (map :info)
       (group-by :category)
       (map total-expenses-by-category)))


(defn total-category-by-card-id
  [[card-id expenses]]
  {:card_id              card-id
   :expenses-by-category (expenses-by-category expenses)})


(->> (db.order/all-orders)
     (group-by :card-id)
     (map total-category-by-card-id)
     println
     )

(defn list-orders-by-card-id
  [orders]
  (->> orders
      (group-by :card-id))
  )

(println (list-orders-by-card-id (db.order/all-orders)))











































