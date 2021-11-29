(ns credit_card.logic.logic
  (:require [credit_card.db.order :as db.order]))


;(println (db.order/all-orders))

(println (group-by :card_id (db.order/all-orders)))

(->> (db.order/all-orders)
     (group-by :card_id)
     vals
     (map count)
     println)
;
;(defn total-card
;  [[_ card-id]]
;  (count card-id))
;
;(->> (db.order/all-orders)
;     (group-by :id)
;     (map total-card)
;     println)
;
;(println  "teste" (map count (vals (group-by :card_id (db.order/all-orders)))))

;(defn total-do-item
;  [[_ detalhes]]
;  (* (get detalhes :quantidade 0) (get detalhes :preco-unitario 0)))
;
;(defn total-do-pedido
;  [pedido]
;  (reduce + (map total-do-item pedido)))
;
;(defn total-dos-pedidos
;  [pedidos]
;  (->> pedidos
;       (map :itens)
;       (map total-do-pedido)
;       (reduce +)))
;
;(defn quantia-de-pedidos-e-gasto-total-por-usuario
;  [[usuario pedidos]]
;  {:usuario-id usuario
;   :total-de-pedidos (count pedidos)
;   :preco-total (total-dos-pedidos pedidos)})
;
;(defn resumo-por-usuario [pedidos]
;  (->> pedidos
;       (group-by :usuario)
;       (map quantia-de-pedidos-e-gasto-total-por-usuario)))
;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;(defn minha-funcao-de-agrupamento
;  [elemento]
;  (println "elemento" elemento)
;  (:card_id elemento)
;  )

;(println (group-by minha-funcao-de-agrupamento (db.order/all-orders)))

(println "PEDIDOS")

;(defn total-purchase-card
;  [[card-id orders]]
;  [card-id (count orders)])
;
;(->> (db.order/all-orders)
;     (group-by :card_id)
;     (map total-purchase-card)
;     println)
;
;(defn total-purchase-card
;  [[card-id orders]]
;  {
;   :card-id card-id
;   :total-purchase-card (count orders)})
;
;(->> (db.order/all-orders)
;     (group-by :card_id)
;     (map total-purchase-card)
;     println)

;(defn price-order
;  [[chave valor]]
;  (:price valor))

(defn sum-prices
  [pedido]
  (->> pedido
       ;(map :info)
       ;(map price-order)
       (map :price)
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







