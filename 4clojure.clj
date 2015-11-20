(= (- 10 (* 2 3)) 4)

(= "HELLO WORLD" (.toUpperCase "hello world"))

(= (list :a :b :c) '(:a :b :c))

(= '(1 2 3 4) (conj '(2 3 4) 1))

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

(= [1 2 3 4] (conj [1 2 3] 4))

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :d :d)))

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

(= #{1 2 3 4} (conj #{1 4 3} 2))

;; 11
(= (:b {:a 10, :b 20, :c 30}) ((hash-map :a 10, :b 20, :c 30) :b))

