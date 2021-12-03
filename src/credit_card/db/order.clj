(ns credit_card.db.order)
(require '[clj-time.core :as t])
(require '[clj-time.format :as f])

(def custom-formatter (f/formatter "YYYY/MM/dd"))


(def order1 {:card-id 1
             :info {:price 20
                    :establishment "Ifood"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 3))
                    :category "food"
                    }})

(def order2 {:card-id 2
             :info {:price 80
                    :establishment "Uber"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 24))
                    :category "transport"
                    }})

(def order3 {:card-id 3
             :info {:price 200
                    :establishment "Marisa"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 23))
                    :category "clothes"
                    }})

(def order4 {:card-id 4
             :info {:price 150
                    :establishment "Dafiti"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 22))
                    :category "clothes"
                    }})

(def order5 {:card-id 1
             :info {:price 40
                    :establishment "99"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 20))
                    :category "transport"
                    }})

(def order6 {:card-id 2
             :info {:price 20
                    :establishment "Uber"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 10))
                    :category "transport"
                    }})

(def order7 {:card-id 3
             :info {:price 20
                    :establishment "UberEats"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 10))
                    :category "food"
                    }})

(def order8 {:card-id 4
             :info {:price 20
                    :establishment "CEA"
                    :date (f/unparse custom-formatter (t/date-time 2021 11 10))
                    :category "clothes"
                    }})

(defn all-orders []
  [order1, order2, order3, order4, order5, order6, order7, order8])

;(println (:date (:info order1)))
;(println order1)