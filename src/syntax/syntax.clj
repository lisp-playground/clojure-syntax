;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(+ 3 9)
(* 5 3)

(defn fc
  [n]
  (if (= n 1)
    1
    (* n (fc (- n 1)))))

(fc 3)

(+ 1 2 3 4 5)
(/ 1 2 3 4 5)
(* 1 2 3 4 5)

