(ns credit_card.db.card)

(def card1 {:id 1
            :info {:number "1010 1010 1010 1010"
                   :cvv "111"
                   :validate "2024-10"
                   :limit 2000.00}
            :client_id 6 })

(def card2 {:id 2
            :info {:number "2020 2020 2020 2020"
                   :cvv "222"
                   :validate "2024-08"
                   :limit 2000.00}
            :client_id 5 })

(def card3 {:id 3
            :info {:number "3030 3030 3030 3030"
                   :cvv "333"
                   :validate "2024-06"
                   :limit 2000.00}
            :client_id 4 })

(def card4 {:id 4
            :info {:number "4040 4040 4040 4040"
                   :cvv "444"
                   :validate "2024-04"
                   :limit 2000.00}
            :client_id 6 })

(defn all-cards []
  [card1, card2, card3, card4])