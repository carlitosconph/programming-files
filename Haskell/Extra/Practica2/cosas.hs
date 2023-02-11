-- variables de tipo

id [[ a -> a
id algo = algo

reversa :: [a] -> a


elemento :: a -> [a] -> Bool

factores 10 = 5, 2, 1  -- los factores de un numero son los numeros que dividen al numero n


-- para el programa de los años de tierra, en la parte de data (donde estan todos los planetas, al final de la definicion) 

--shoe para imprimir las cosas, Eq para saber si algo es igual a otro

-- ... Neptuno deriving show
-- se puede hacer que se instacia de varias clases, se coloca (Show

-- instaciar
-- intance Eq Planeta where
-- 	   Tierra == Tierra = True

:r --para cargar de nuevo el archivo

-- mapeo
map :: (a -> b) -> [a] -> [b]
-- map funcion lista ([1,2,3,4]

-- \ para lamda

map (\x -> x+2*3) [1,2,3]


--filter
:t --para ver la firma de la funcion

--filter even [1,2,3,4,5,6,78]



