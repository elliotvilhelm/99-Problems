myLast :: [a] -> a
myLast (x:[]) = x
myLast (x:xs) = myLast(xs)

secondToLast :: [a] -> a
secondToLast (x:z:[]) = x
secondToLast (x:xs) = secondToLast(xs)

elementAt :: [a] -> Int -> a
elementAt (x:xs) 0 = x
elementAt (x:xs) n = elementAt xs (n-1)


isPalindrome :: Eq a => [a] -> Bool
isPalindrome xs = xs == reverse xs