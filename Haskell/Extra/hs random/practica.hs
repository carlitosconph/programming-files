-- Longitud de lista

lon :: [a] -> Int
lon [] = 0
lon (c:cl) = 1 + lon cl

-- Funcion par

par :: Int -> Bool
par n = (mod n 2) == 0

-- Funcion impar

impar :: Int -> Bool
impar n = (mod n 2) == 1

-- Funcion minimo

minimo :: Int -> Int -> Int
minimo n m = if ( n > m )
then m
else n

-- Funcion maximo

maximo :: Int -> Int -> Int
maximo n m = if ( n > m )
then n
else m

-- Funcion absoluto

absoluto n = if (n > 0)
then n
else (n * (-1))

-- Funcion divE




-- Funcion head

cabeza :: [Int] -> [Int]
cabeza (c:cl) = [c]

-- Funcion tail

cola :: [Int] -> [Int]
cola (c:cl) = cl

-- Funcion quita n lst

quita :: Int -> [Int] -> [Int]
quita 0 (c:cl) = c:cl
quita 1 (c:cl) = cola (c:cl)
quita n (c:cl) = ((c:cl) - cabeza (c:cl)) --restar uno a n

-- Funcion enesimo n lst



