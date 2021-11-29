(ns credit_card.logic.logic
  (:require [credit_card.db.order :as db.order]))

(defn price-order
  [[chave valor]]
  (:price valor))

(defn sum-prices
  [pedido]
  (->> pedido
       (map :info)
       :price
       (reduce +)
       ;(map price-order)
       ;(map :price)
       println))

(defn total-purchase-card
  [[card-id orders]]
  {
   :card-id card-id
   :total-purchase-card (count orders)
   :total-price (sum-prices orders)})

(->> (db.order/all-orders)
     (group-by :card_id)
     (map total-purchase-card)
     println)

(->> (db.order/all-orders)
     (group-by :card_id)
     vals
     println)








