(ns mathemagician-test
  (:use [clojure.test]
        [mathemagician]))

(deftest testing-big-picture
  (testing "at a high level that this library does something useful."
    (is (= 3 (abs -3)))))

(deftest testing-clojurize
  (testing "that the way we munge camelcase is correct"
    (is (= "next-thing-blah" (@#'mathemagician/clojurize "nextThingBlah")))
    ;; FIXME: the following fails and needs to be fixed
    (is (= "ieee-remainder" (@#'mathemagician/clojurize "IEEEremainder")))))