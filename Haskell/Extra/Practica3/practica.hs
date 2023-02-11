-- Elist
type EList a = [(a,a)]

-- Te quiero mucho, princesita <3


-- pendejos si se nos va el commentario xd

-- FUNCION longP
longP :: EList a -> Int
longP [] = 0
longP ls = longL $ aplanaP ls

-- funcion auxiliar tamano
longL :: [a] -> Int
longL [] = 0
longL (c:cl) = 1 + longL(cl)



-- FUNCION elemP
elemP ::Eq a => a -> EList a -> Bool
elemP d [] = False
elemP d ls = pertenece d $ aplanaP ls

--funcion auxiliar pertenece
pertenece :: Eq a => a -> [a] -> Bool
pertenece n [] = False
pertenece n (c:cl)
                | (n == c) = True
                | otherwise = pertenece n cl



-- FUNCION consP
consP :: (a,a) -> EList a -> EList a
consP (c,d) ls = toEL $ (c:(d:(aplanaP(ls))))



-- FUNCION appendP
appendP :: EList a -> EList a -> EList a
appendP [] [] = []
appendP ls1 ls2 = ls1 ++ ls2



-- FUNCION snocP
snocP :: (a,a) -> EList a -> EList a
snocP (c,d) ls = toEL $ reversa $ (d:(c:(reversa $ aplanaP(ls))))



-- FUNCION atP
atP :: EList Int -> Int -> Int
atP [] n = error "Lista vacia"
atP ls n = enesimo n (aplanaP ls)

-- Funcion auxiliar enesimo n lst

enesimo :: Int -> [Int] -> Int
enesimo n (c:cl)
              | (n > 1) = quitaAux n (c:cl)
              | otherwise = c

-- Funciones auxiliares para enesimo
quitaAux :: Int -> [Int] -> Int
quitaAux 1 (c:cl) = c
quitaAux n (c:cl) = quitaAux (n-1) cl



-- FUNCION updateP
updateP :: EList a -> Int -> a -> EList a
updateP ls n w = updatePAux ls (aplanaP ls) n w 0 []

-- funcion auxiliar update
updatePAux :: EList a -> [a] -> Int -> a -> Int -> [a] -> EList a
updatePAux ls [] n w cc void = toEL $ reversa (void)
updatePAux ls (x:xs) n w cc void
                              | (cc < (longL $ aplanaP(ls))) = if (cc == (n-1))
  then updatePAux ls (xs) n w (cc + 1) (w:void)
  else updatePAux ls (xs) n w (cc + 1) (x:void)
                              | otherwise = toEL $ reversa (void)



-- FUNCION aplanaP
aplanaP :: EList a -> [a]
aplanaP [] = []
aplanaP (x:xs) = fst x : snd x : aplanaP xs



-- FUNCION toEL

toEL :: [a] -> EList a
toEL [] = []
toEL (c:cl)
          | (mod (longL (c:cl)) 2 == 0) = (c,cabeza(cl)) : toEL (cola(cl))
          | otherwise = toEL $ reversa $ quita 1 $ (reversa(c:cl))

-- funcion auxiliar cabeza
cabeza :: [a] -> a
cabeza (c:cl) = c

-- FUNCION dropP
dropP :: Int -> EList a -> EList a 
dropP n [] = error "La lista no puede ser vacia"
dropP 0 ls = ls
dropP n ls
        | (mod n 2) == 0 = toEL $ quita n $ aplanaP ls
        | otherwise = error "No es un numero par"

-- FUNCION dropN
dropN :: Int -> EList a -> [a]
dropN 0 ls = aplanaP(ls)
dropN d ls = quita d $ aplanaP ls

-- funcion quita n lst

quita :: Int -> [a] -> [a]
quita 1 (c:cl) = cola (c:cl)
quita d (c:cl) = quita (d-1) cl

-- funcion auxiliar cola

cola :: [a] -> [a]
cola (c:cl) = cl



-- FUNCION takeP
takeP :: Int -> EList a -> EList a
takeP 0 ls = []
takeP d ls
        | (mod d 2) == 0 = if (d == (longL(aplanaP ls)))
  then toEL $ aplanaP (ls)
  else toEL $ reversa (takeNAux [] d (aplanaP(ls)) 0)
        | otherwise = error "El numero no es par"



-- FUNCION takeN
takeN :: Int -> EList a -> [a]
takeN 0 ls = []
takeN d ls
        | (d == (longL $ aplanaP ls)) = aplanaP (ls)
        | otherwise = reversa $ takeNAux [] d (aplanaP(ls)) 0

-- funcion auxiliar take
takeNAux :: [a] -> Int -> [a] -> Int -> [a]
takeNAux void d (c:cl) cc
                        | (cc < d) = takeNAux (c:void) (d) (cl) (cc+1)
                        | otherwise = void



-- FUNCION reversaP
reversaP :: EList a -> EList a
reversaP [] = []
reversaP ls = toEL $ reversa $ aplanaP(ls)

-- funcion reversa auxiliar 

reversa :: [a] -> [a]
reversa [] = []
reversa (c:cl) = reversa(cl) ++ [c]
