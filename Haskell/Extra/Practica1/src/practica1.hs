-- 1.-

-- Funcion par

par :: Int -> Bool
par n = (mod n 2) == 0

-- Funcion impar

impar :: Int -> Bool
impar n = (mod n 2) == 1

-- 2.-

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

-- 3.-

-- Funcion absoluto
absoluto ::Int -> Int
absoluto n = if (n > 0)
then n
else (n * (-1))

-- 4.-

-- Funcion divE

divE :: Int -> Int -> Int

-- para manejar las entradas invalidas

divE n 0 = error "No"
divE n m =divEAux n m 0

-- Funcion divEAux para la funcion anterior

divEAux :: Int -> Int -> Int -> Int
divEAux n m acc = if ( n < m )
then acc
else divEAux (n-m) m (acc+1)

-- 5.-

-- Funcion head

cabeza :: [Int] -> Int
cabeza (c:cl) = c

-- Funcion tail

cola :: [Int] -> [Int]
cola (c:cl) = cl

-- 6.-

-- Funcion quita n lst

quita :: Int -> [Int] -> [Int]
quita 0 (c:cl) = c:cl
quita 1 (c:cl) = cola (c:cl)
quita n (c:cl) = quita (n-1) cl

-- 7 .-

-- Funcion enesimo n lst

enesimo :: Int -> [Int] -> Int
enesimo n (c:cl) = if (n > 0)
then quitaAux n (c:cl)
else c

-- Funciones auxiliares para enesimo
quitaAux :: Int -> [Int] -> Int
quitaAux 0 (c:cl) = c
quitaAux n (c:cl) = quitaAux (n-1) cl


