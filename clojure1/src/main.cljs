(ns main)

;Maximum value
;Write a function which takes a variable number of parameters and returns the maximum value.

(defn GetMax [& numbers]  (last (sort numbers)))

(println(= (GetMax 1 8 3 4) 8 ))
(println(= (GetMax 30 20) 30 ))
(println(= (GetMax 45 67 11) 67 ))


;Palindrome Detector
;Write a function which returns true if the given sequence is a palindrome.
;Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)


(defn palindrome [givenSequence] (= (seq givenSequence) (seq (reverse givenSequence))))

(println(false? (palindrome '(1 2 3 4 5))))
(println(true? (palindrome "racecar")))
(println(true? (palindrome [:foo :bar :foo])))
(println(true? (palindrome '(1 1 3 3 1 1))))
(println(false? (palindrome '(:a :b :c))))