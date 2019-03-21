myLast :: [a] -> a
myLast (x:[]) = x
myLast (x:xs) = myLast(xs)

secondToLast :: [a] -> a
secondToLast (x:z:[]) = x
secondToLast (x:xs) = secondToLast(xs)

elementAt :: [a] -> Int -> a
elementAt (x:xs) 0 = x
elementAt (x:xs) n = elementAt xs (n-1)

encode :: [a] -> [(Int, a)]
encode [] = []
encode x:xs = foldr (\acc x -> )

