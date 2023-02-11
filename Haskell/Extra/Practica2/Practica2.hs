
-- 1. Por que? porque si

-- 1. potencia
potencia :: Int -> Int -> Int
potencia b 0 = 1
potencia b p = b*(potencia b  (p-1))

-- 2 . suma_pares

suma_pares :: Int -> Int
suma_pares 0 = 0
suma_pares n = if (mod n 2) == 0
then sumAux n 0 0 (divE n 2)
else error "No"

-- auxiliar para suma_pares

sumAux :: Int -> Int -> Int -> Int -> Int
sumAux n m p q = if (p > q )
then m
else sumAux (n-2) (m+n) (p+1) q

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

-- 3. triangular

triangular :: Int -> Int
triangular n = triAux n 0 0

-- funcion aux triangular

triAux :: Int -> Int -> Int -> Int
triAux n m p = if (p > n)
then m
else triAux n (m + p) (p+1)

-- 4. fibo

fibo :: Int -> Int
fibo 0 = 0
fibo 1 = 1
fibo n = fibo(n-1) + fibo(n-2)

-- 5. ultimo

ultimo :: [a] -> [a]
ultimo [] = error "NO"
ultimo (c:cl) = cabeza (reversa (c:cl))

-- Funcion head aux ultimo

cabeza :: [a] -> [a]
cabeza (c:cl) = [c]

-- 6. reversa

reversa :: [a] -> [a]
reversa [] = []
reversa (c:cl) = reversa(cl) ++ [c]

-- cuando son caracteres de una sola comilla lo regresa como string, ejemplo: reversa ['a','b','c'] = "cba"
-- cuando son datos de doble comilla, si lo regresa como lista, ejemplo: reversa ["a","b","c"] = ["c","b","a"]

-- 7. pertenece

pertenece :: Eq a => a -> [a] -> Bool
pertenece n [] = False
pertenece n (c:cl) = if (n == c)
then True
else pertenece n cl

-- en el pdf dice "pertenece" y despues "elemento", nosotros decidimos usar "pertenece"


-- 2. Pensar correcto es lo que hago

-- Perfecto, abundadnte o deficiente

data Categoria = Perfecto | Deficiente | Abundante deriving Show

nicomaco :: Int -> Categoria
nicomaco n = if (n > 0)
then if(n < (facNicomaco n 0 0))
  then Abundante
  else if(n > (facNicomaco n 0 0))
    then Deficiente
    else Perfecto
else error "NO"

-- comprueba y hace que m sea menor que n

facNicomaco :: Int -> Int -> Int -> Int
facNicomaco n m p = if (m < n)
then facAux2 n (m+1) p 
else p

--agrega m a p si este es un factor

facAux2 :: Int -> Int -> Int -> Int
facAux2 n m p = if (mod n m) == 0
then if (n == m)
  then facNicomaco n m p
  else facNicomaco n m (m+p)
else facNicomaco n m p

-- Luhn

luhn :: [Int] -> Bool
luhn [] = error "NO"
luhn (c:cl) = if (mod (luhnMult (c:cl) [] 1) 10) == 0
then True
else False

luhnMult :: [Int] -> [Int] -> Int -> Int
luhnMult [] m p = luhnResta (m) []
luhnMult (c:cl) m p = if (p == 1)
then luhnMult (cola (c:cl)) ((c*2):m) (p-1)
else luhnMult (cola (c:cl)) (c:m) (p+1)

luhnResta :: [Int] -> [Int] -> Int
luhnResta [] m = luhnSuma (m)
luhnResta (c:cl) m = if (tama((c:cl))) /= 0
then if (c > 9)
  then luhnResta (cola (c:cl)) ((c-9):m)
  else luhnResta (cola (c:cl)) (c:m)
else luhnSuma (m)

luhnSuma :: [Int] -> Int
luhnSuma [] = 0
luhnSuma (c:cl) = c + luhnSuma(cl)

-- Funcion tail como aux

cola :: [Int] -> [Int]
cola (c:cl) = cl

-- Conjetura de Collatz

-- funcion pasosCollatz

pasosCollatz :: Int -> Int
pasosCollatz n = (tama (listaCollatz n)) -1

tama :: [Int] -> Int
tama [] = 0
tama (c:cl) = 1 + tama(cl)

-- funcion listaCollatz

listaCollatz :: Int -> [Int]
listaCollatz n = reversa (collatzAux n [])

--funcion aux

collatzAux :: Int -> [Int] -> [Int]
collatzAux n m = if (n /= 1)
then if (mod n 2) == 0
  then collatzAux (divE n 2) (n:m)
  else collatzAux ((n*3)+1) (n:m)
else (1:m)


-- 3. Expresiones aritmeticas

data EA = N Int | Positivo EA | Negativo EA | Suma EA EA | Resta EA EA | Mult EA EA | Div EA EA | Mod EA EA | Pot EA EA  --deriving Show

creaSumaEA :: Int -> Int -> EA
creaSumaEA n m = if (n < 0 && m < 0) 
then Suma (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Suma (Negativo (N (n))) (N m)
  else if (m<0)
    then Suma (N n) (Negativo (N (m)))
    else Suma (N (n)) (N (m))

creaRestaEA :: Int -> Int -> EA
creaRestaEA n m = if (n < 0 && m < 0) 
then Resta (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Resta (Negativo (N (n))) (N m)
  else if (m<0)
    then Resta (N n) (Negativo (N (m)))
    else Resta (N (n)) (N (m))

creaMultEA :: Int -> Int -> EA
creaMultEA n m = if (n < 0 && m < 0) 
then Mult (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Mult (Negativo (N (n))) (N m)
  else if (m<0)
    then Mult (N n) (Negativo (N (m)))
    else Mult (N (n)) (N (m))

creaDivEA :: Int -> Int -> EA
creaDivEA n m = if (n < 0 && m < 0) 
then Div (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Div (Negativo (N (n))) (N m)
  else if (m<0)
    then Div (N n) (Negativo (N (m)))
    else Div (N (n)) (N (m))

creaModEA :: Int -> Int -> EA
creaModEA n m = if (n < 0 && m < 0) 
then Mod (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Mod (Negativo (N (n))) (N m)
  else if (m<0)
    then Mod (N n) (Negativo (N (m)))
    else Mod (N (n)) (N (m))

creaPotEA :: Int -> Int -> EA
creaPotEA n m = if (n < 0 && m < 0) 
then Pot (Negativo (N (n))) (Negativo (N (m)))       
else if (n < 0)
  then Pot (Negativo (N (n))) (N m)
  else if (m<0)
    then Pot (N n) (Negativo (N (m)))
    else Pot (N (n)) (N (m))




-- instancia de la clase show

instance Show EA where
  show (Positivo e) = show e
  show (Negativo e) = "(" ++ show e ++ ")"
  show (N n) = show n
  show (Suma e1 e2) = show e1 ++ " + " ++ show e2
  show (Resta e1 e2) = show e1 ++ " - " ++ show e2
  show (Mult e1 e2) = show e1 ++ " * " ++ show e2
  show (Div e1 e2) = show e1 ++ " / " ++ show e2
  show (Mod e1 e2) = show e1 ++ " % " ++ show e2
  show (Pot e1 e2) = show e1 ++ " ^ " ++ show e2

  -- los negativos se ponen (-n)


-- evaluaciones de mayor y menor

menorque :: EA -> EA -> Bool
menorque (N n) (N m) = if (n<m)
then True
else False

--funciona con:
--EJEMPLO menorque (N 5) (N 2) = False

mayorque :: EA -> EA -> Bool
mayorque (N n) (N m) = if (n>m)
then True
else False

--funciona con:
--EJEMPLO mayorque (N 5) (N 2) = True




