(ns credit_card.db.client)

(def client1 {:id 1
              :info {:name "Mari Doe"
                     :cpf "111.111.111-11"
                     :email "mari.doe@test.com"}})

(def client2 {:id 2
              :info {:name "John Doe"
                     :cpf "222.222.222-22"
                     :email "john.doe@test.com"}})

(def client3 {:id 3
              :info {:name "Hermione Granger"
                     :cpf "333.333.333-33"
                     :email "hermione@test.com"}})

(def client4 {:id 4
              :info {:name "Ronald Weasley"
                     :cpf "444.444.444-44"
                     :email "rony.weasley@test.com"}})

(defn all-clients []
  [client1, client2, client3, client4])