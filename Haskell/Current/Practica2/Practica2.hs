-- ------------------ INTRODUCCIÓN A HASKELL ------------------------

-- ------------------------------------------------------------------
-- ---------------------- SEGUNDA PARTE -----------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- ----------------- Tipos Compuestos: Pares ------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 1: Escribe tres ejemplos de pares compuestos por tipos
--              básicos distintos. 
-- ------------------------------------------------------------------


{-Podemos utilizarlos dentro de una funcion como patrones con los
cuales se encuentren correspondencias: -}

parUno :: (Int, Int)
parUno = (1, 2)

parDos :: (String, Int)
parDos = ("La cascada", 3)

parTres :: (Bool, Char)
parTres = (True, 'c')



-- ------------------------------------------------------------------
-- Ejercicio 2: Escribe una función que tome un par de números reales 
--              y suponiendo que son las coordenadas de un punto,  
--              devuelva el cuadrante al que dicho punto pertenecería. 
--              Utiliza guardas en tu definición.
-- ------------------------------------------------------------------

cuadrante :: (Double, Double) -> Int 
cuadrante (x, y) 
    | x > 0 && y > 0 = 1
    | x < 0 && y > 0 = 2
    | x < 0 && y < 0 = 3
    | x > 0 && y < 0 = 4
    | otherwise = 0


-- ------------------------------------------------------------------
-- !Ejercicio 3: Escribe una función llamada modulo que calcule el
--              módulo de un vector en R2.
--
--              En esta ocasión te toca escribir la función sin ayuda.
-- ------------------------------------------------------------------
modulo :: (Double, Double) -> Double
modulo (x, y) = sqrt (x^2 + y^2)

-- ------------------------------------------------------------------
-- Ejercicio 4: Escribe una función que tome tres enteros y devuelva 
--              su suma. Recuerda comenzar escribiendo la firma de 
--              tipo de la función seguida de su definición.
-- ------------------------------------------------------------------
suma :: Int -> Int -> Int -> Int
suma x y z = x + y + z


-- ------------------------------------------------------------------
-- Ejercicio 5: Escribe una función que calcule la media de cinco 
--              números reales dados.
-- ------------------------------------------------------------------
media :: Double -> Double -> Double -> Double -> Double -> Double
media x y z w v = (x + y + z + w + v) / 5

-- ------------------------------------------------------------------
-- ---------------- Tipos Compuestos: Listas ------------------------
-- ------------------------------------------------------------------


-- ------------------------------------------------------------------
-- Ejercicio 6: Transcribe del documento PDF el código con las listas
--              propuestas, ejecútalo en términal y guarda una captura.
--               
--              Responde en un archivo de texto plano las siguientes 
--              preguntas observando el código que escribiste:}
--
--              - ¿Para qué sirven los dos puntos .. al definir una 
--                lista? 
--
--              - Si quiero escribir una lista de Double's ¿Cómo 
--                especifico su tipo sintácticamente?
-- ------------------------------------------------------------------
nums, range, range2 :: [Int]
nums = [1, 2, 3, 19]
range = [1..10]
range2 = [2, 4..100]


-- ------------------------------------------------------------------
-- Ejercicio 7: Escribe cuatro cadenas (listas de caracteres) 
--              utilizando la sintaxis de los corchetes [] para dos 
--              de ellas y la sintaxis de las comillas "" para las 
--              otras dos.
-- ------------------------------------------------------------------
cadenaUno :: [Char]
cadenaUno = ['h', 'o', 'l', 'a']

cadenaDos :: [Char]
cadenaDos = ['c', 'a', 's', 'i', 't', 'a']

cadenaTres :: String
cadenaTres = "hola"

cadenaCuatro :: String
cadenaCuatro = "casita"



-- ------------------------------------------------------------------
-- ------------------- Construyendo listas --------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 8: Escribe tres listas de mas de tres elementos 
--              utilizando el operador cons y el tipo de dato que 
--              gustes.
-- ------------------------------------------------------------------
listaUno :: [Int]
listaUno = 10 : 52 : 213 : 34 : 65 : []

listaDos :: [Bool]
listaDos = True : False : True : True : False : []

listaTres :: [Double]
listaTres = 5.2 : 53.4 : 57.86 : 798.85 : 859.50 : []

-- ------------------------------------------------------------------
-- Ejercicio 9: Escribe la versión de las listas definidas en el 
--              ejercicio anterior pero ahora sin utilizar el 
--              operador cons los dos puntitos ":". 
--
--              Utiliza identificadores distintos para que no haya 
--              error al compilar.}
-- ------------------------------------------------------------------
listaUnoDos :: [Int]
listaUnoDos = [10, 52, 213, 34, 65]

listaDosDos :: [Bool]
listaDosDos = [True, False, True, True, False]

listaTresDos :: [Double]
listaTresDos = [5.2, 53.4, 57.86, 798.85, 859.50]

-- ------------------------------------------------------------------
-- ------------ Funciones recursivas con listas ---------------------
-- ------------------------------------------------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 10: Transcribe la función del secuencia y ejecútala con 
--               tres valores distintos, guarda una captura de 
--               pantalla con tus ejecuciones. Además escribe en el 
--               archivo de texto plano el procedimiento que sigue la 
--               función si se aplica al 5.
-- ------------------------------------------------------------------
secuencia :: Integer -> [Integer]
secuencia 1 = [1]
secuencia n = n : secuencia (n-1)


-- ------------------------------------------------------------------
-- Ejercicio 11:  Transcribe la función longitudLista que aparece en el 
--                PDF y ejecútala con tres listas distintas de longitud 
--                0, 3 y 100. No olvides tomar captura de pantalla a tu 
--                trabajo.
-- ------------------------------------------------------------------
longitudLista :: [Integer] -> Integer
longitudLista [] = 0
longitudLista (x:xs) = 1 + longitudLista xs

-- ------------------------------------------------------------------
-- Ejercicio 12: Escribe una función que reciba una lista de enteros y 
--               los sume de dos en dos.
-- ------------------------------------------------------------------
sumaCadaDos :: [Int] -> [Int]
sumaCadaDos [] = []
sumaCadaDos [x] = [x] 
sumaCadaDos (x:y:xs) = (x + y) : sumaCadaDos xs
