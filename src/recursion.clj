(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

(defn singleton? [coll]
  (and
   (boolean (seq coll))
   (empty? (rest coll))))

(defn my-last [coll]
  (if (empty? coll)
    nil
    (if (empty? (rest coll))
      (first coll)
      (my-last (rest coll)))))

(defn max-element-acc [a-seq curr]
  (if (empty? a-seq)
    curr
    (if (> (first a-seq) curr)
      (max-element-acc (rest a-seq) (first a-seq))
      (max-element-acc (rest a-seq) curr))))

(defn max-element [a-seq]
  (if (empty? a-seq)
    nil
    (max-element-acc (rest a-seq) (first a-seq))))

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2))
    seq-1
    seq-2))

(defn longest-sequence [a-seq]
  (let [tail (rest a-seq)
        head (first a-seq)]
    (if (empty? tail)
      head
      (longest-sequence (conj
                         (rest tail)
                         (seq-max head (first tail)))))))

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    []
    (let [head (first a-seq)
          tail (rest a-seq)
          filtered (my-filter pred? tail)]
      (if (pred? head)
        (cons head filtered)
        filtered))))

(defn sequence-contains? [elem a-seq]
  (cond
    (empty? a-seq) false
    (= elem (first a-seq)) true
    :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond
    (empty? a-seq) []
    (pred? (first a-seq)) (cons (first a-seq) (my-take-while pred? (rest a-seq)))
    :else []))

(defn my-drop-while [pred? a-seq]
  (cond
    (empty? a-seq) []
    (pred? (first a-seq)) (my-drop-while pred? (rest a-seq))
    :else a-seq))

(defn seq= [a-seq b-seq]
  (cond
    (not (= (count a-seq) (count b-seq))) false
    (and (empty? a-seq) (empty? b-seq)) true
    (= (first a-seq) (first b-seq)) (seq= (rest a-seq) (rest b-seq))
    :else false))

(defn my-map [f seq-1 seq-2]
  (let [a (first seq-1)
        b (first seq-2)]
    (if (and a b)
      (cons (f a b) (my-map f (rest seq-1) (rest seq-2)))
      [])))

(defn power [n k]
  (if (= k 0)
    1
    (* n (power n (- k 1)))))

(defn fib [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  (cond
    (<= how-many-times 0) []
    :else (cons what-to-repeat (my-repeat (- how-many-times 1) what-to-repeat))))

(defn my-range [up-to]
  (cond
    (= up-to 0) []
    :else (cons (- up-to 1) (my-range (- up-to 1)))))

(defn tails [a-seq]
  (if (empty? a-seq)
    [a-seq]
    (cons a-seq (tails (rest a-seq)))))

(defn inits [a-seq]
  (if (empty? a-seq)
    [a-seq]
    (conj a-seq (inits (drop-last a-seq)))))

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])
