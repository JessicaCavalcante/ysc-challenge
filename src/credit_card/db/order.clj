(ns credit_card.db.order)

;(def order1 {:id 1
;             :info {:price 20
;                    :establishment "Ifood"
;                    :date "25/11/2021"
;                    :category "food"
;                    :card_id 1}})
;
;(def order2 {:id 2
;             :info {:price 80
;                    :establishment "Uber"
;                    :date "24/11/2021"
;                    :category "transport"
;                    :card_id 2}})
;
;(def order3 {:id 3
;             :info {:price 200
;                    :establishment "Marisa"
;                    :date "20/11/2021"
;                    :category "clothes"
;                    :card_id 3}})
;
;(def order4 {:id 4
;             :info {:price 150
;                    :establishment "Dafiti"
;                    :date "22/11/2021"
;                    :category "clothes"
;                    :card_id 4}})
;
;(def order5 {:id 5
;             :info {:price 40
;                    :establishment "99"
;                    :date "20/11/2021"
;                    :category "transport"
;                    :card_id 1}})
;
;(def order6 {:id 6
;             :info {:price 20
;                    :establishment "Uber"
;                    :date "10/11/2021"
;                    :category "transport"
;                    :card_id 2}})
;
;(def order7 {:id 7
;             :info {:price 20
;                    :establishment "UberEats"
;                    :date "10/11/2021"
;                    :category "food"
;                    :card_id 3}})
;
;(def order8 {:id 8
;             :info {:price 20
;                    :establishment "CEA"
;                    :date "10/11/2021"
;                    :category "clothes"
;                    :card_id 4}})

(def order1 {:card_id 1
             :info {:price 20
                    :establishment "Ifood"
                    :date "25/11/2021"
                    :category "food"
                    }})

(def order2 {:card_id 2
             :info {:price 80
                    :establishment "Uber"
                    :date "24/11/2021"
                    :category "transport"
                    }})

(def order3 {:card_id 3
             :info {:price 200
                    :establishment "Marisa"
                    :date "20/11/2021"
                    :category "clothes"
                    }})

(def order4 {:card_id 4
             :info {:price 150
                    :establishment "Dafiti"
                    :date "22/11/2021"
                    :category "clothes"
                    }})

(def order5 {:card_id 1
             :info {:price 40
                    :establishment "99"
                    :date "20/11/2021"
                    :category "transport"
                    }})

(def order6 {:card_id 2
             :info {:price 20
                    :establishment "Uber"
                    :date "10/11/2021"
                    :category "transport"
                    }})

(def order7 {:card_id 3
             :info {:price 20
                    :establishment "UberEats"
                    :date "10/11/2021"
                    :category "food"
                    }})

(def order8 {:card_id 4
             :info {:price 20
                    :establishment "CEA"
                    :date "10/11/2021"
                    :category "clothes"
                    }})

(defn all-orders []
  [order1, order2, order3, order4, order5, order6, order7, order8])