;; https://coldnew.github.io/pratice/4clojure/

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

(= 3 (first '(3 2 1)))

(= 3 (second [1 3 4]))
(= 3 (last (list 1 2 3)))

(= [20 30 40] (rest [10 20 30 40]))

;; function
(= 8 ((fn add-five [x] (+ x 5)) 3))

(= 8 ((fn [x] (+ x 5)) 3))

(= 8 (#(+ % 5) 3))

(= 8 ((partial + 5) 3))

(= (* 2 2) 4)
(= (* 2 3) 6)
(= (* 2 11) 22)
(= (* 2 7) 14)
(= (#(* 2 %) 7) 14)


;; hello world
(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")


(= '(6 7 8) (map #(+ % 5) '(1 2 3)))

(= (list 6 7) (filter #(> % 5) '(3 4 5 6 7)))

(= [20 30 40] (rest [10 20 30 40]))

(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x](+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))


;; 19
(= (last [1 2 3 4 5]) 5)
(= (last '(5 4 3)) 3)
(= (last ["b" "c" "d"]) "d")

;; 20

(= (#(second (reverse %)) (list 1 2 3 4 5)) 4)
(= 1 1)

(= (nth '(4 5 6 7) 2) 6)
(= (nth [:a :b :c] 0) :a)

(= (count '(1 2 3 3 1)) 5)
(= (count "Hello world") 11)
(= (count [[1 2] [2 4] [5 6]]) 3)

(= (reverse [1 2 3 4 5]) [5 4 3 2 1])

(= (reverse (sorted-set 5 7 2 7)) '(7 5 2))


;; sum
(= (reduce + [1 2 3]) 6)


(= (filter odd? #{1 2 3 4 5}) '(1 3 5))

(def fib-seq
  (lazy-cat [0 1]
            (map + fib-seq(rest fib-seq))))

(take 10 fib-seq)

(false? (#(= (reverse %) (seq %)) '(1 2 3 4 5)))


(= (flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))


;;29
;;(= (#(apply str (re-seq #"[A-Z]" %) "HeLl0, WoRlD!") "HLOWRD")


