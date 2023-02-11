-- ------------------ INTRODUCCIÓN A HASKELL ------------------------

-- ------------------------------------------------------------------
-- ----------------------- PRIMER PARTE -----------------------------
-- ------------------------------------------------------------------

{-Soy un comentario-}
--Yo también
-- :p

-- ------------------------------------------------------------------
-- ------------------ Tipos Básicos: Enteros ------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 1: Declara tres variables de tipo entero, asegúrate de
--              incluir números positivos y negativos. Puedes usar
--              los nombres que gustes.
-- ------------------------------------------------------------------
x :: Int        -- Ejemplo de declaración de variable
x = 3

-- !3 variables de tipo entero
varUno :: Int
varUno = 65

varDos :: Int
varDos = -35

varTres :: Int
varTres = 5421


-- ------------------------------------------------------------------
-- Ejercicio 2: Ejecuta las siguientes líneas de código en la consola
--              para saber cuál es el máximo y el mínimo valor que 
--              puede tener un dato del tipo Int en tu computadora. 
--              
--              Captura la pantalla con la ejecución.
-- ------------------------------------------------------------------
minimo, maximo :: Int
minimo = minBound
maximo = maxBound


-- ------------------------------------------------------------------
-- Ejercicio 3: Declara una variable de tipo Integer y defínela como
--              un valor de 30 dígitos.
--
--              Define la variable 'descomunal' como el resultado de
--              elevar dos al cuadrado cuatro veces.
--          
--              Completado el paso anterior ejecuta numDigitos en 
--              la consola. Esta es la longitud del número descomunal.
-- ------------------------------------------------------------------
varInteger :: Integer
varInteger = 123451874128546719481209123487

descomunal :: Integer
descomunal = 2 ^ (2 ^ (2 ^ (2 ^ 2)))

numDigitos :: Int
numDigitos = length (show descomunal)



-- ------------------------------------------------------------------
-- ----- Tipos Básicos: Punto flotante y doblemente preciso ---------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 4: Declara tres variables de tipo Double y tres de tipo
--              Float utilizando punto decimal y notación científica.
-- ------------------------------------------------------------------
-- !3 variables de tipo Double
varCuatro :: Double
varCuatro = 3.12340

varCinco :: Double
varCinco = 5.2340e-2

varSeis :: Double
varSeis = 1.2340e2

-- !3 variables de tipo Float
varSiete :: Float
varSiete = 53.340

varOcho :: Float
varOcho = 59.1451e-2

varNueve :: Float
varNueve = 98.31257e2


-- ------------------------------------------------------------------
-- ------------------ Tipos Básicos: Booleanos ----------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 5: Declara un par de variables de tipo Bool, definiendo 
--              una como False y otra como True. 
-- ------------------------------------------------------------------
-- !2 variables de tipo Bool
varDiez :: Bool
varDiez = False

varOnce :: Bool
varOnce = True


-- ------------------------------------------------------------------
-- -------------- Tipos Básicos: Carácteres Unicode -----------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 6: Declara tres variables del tipo Char. Los valores de
--              estas variables se escriben entre apóstrofes: ' '. 
-- ------------------------------------------------------------------
-- 'Ø' 'ダ'
-- !3 variables de tipo Char
varDoce :: Char
varDoce = 'a'

varTrece :: Char
varTrece = 'z'

varCatorce :: Char
varCatorce = 'd'


-- ------------------------------------------------------------------
-- ----- Cadenas (listas de carácteres con azucar sintáctica) -------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 7: Define un par de variables cuyos valores sean cadenas
--              con enunciados ingeniosos. 
-- ------------------------------------------------------------------
-- !2 variables de tipo String
varQuince :: String
varQuince = "Estoy cursando la carrera de Ciencias de la Computación"

varDieciseis :: String
varDieciseis = "Mi lenguaje de programación favorito es python"


-- ------------------------------------------------------------------
-- -------------------------- Operaciones ---------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- --------------------------- Aritmética ---------------------------
-- ------------------------------------------------------------------
--alt 96 para el acento grave

-- ------------------------------------------------------------------
-- Ejercicio 8: Define seis variables cuyo valor sea el resultado de
--              utilizar cada operador infijo en un par de valores. 
-- ------------------------------------------------------------------
-- !6 variables cuyo valor sea el resultado de utilizar cada operador infijo

e1 :: Int 
e1 = 3 + 4

e2 :: Int
e2 = 65 * 23

e3 :: Int
e3 = 54 - 39

e4 :: Float
e4 = 25 / 5

e5 :: Double
e5 = 184 ** 45

e6 :: Int
e6 = 10 `mod` 4


-- ------------------------------------------------------------------
-- Ejercicio 9: Declara dos variables cuyo valor sea el cociente de 
--              números enteros. 
-- ------------------------------------------------------------------
-- !2 variables cuyo valor sea el cociente de números enteros
primeraVar :: Int
primeraVar = 10 `div` 3

segundaVar :: Int
segundaVar = 54 `div` 8


-- ------------------------------------------------------------------
-- ---------------------- Lógica Booleana ---------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 10: Realiza tres operaciones con los operadores lógicos
--              y define con ellas tres variables. 
-- ------------------------------------------------------------------
-- !3 operaciones con operadores logicos
varBool1 :: Bool
varBool1 = True && False && True

varBool2 :: Bool
varBool2 = True || not False

varBool3 :: Bool
varBool3 = not True || not False


-- ------------------------------------------------------------------
-- Ejercicio 11: Define tres variables de tipo Bool utilizando los
--               símbolos de comparación. 
-- ------------------------------------------------------------------
-- !3 variables de tipo Bool utilizando los símbolos de comparación
varBool4 :: Bool
varBool4 = 325 == 654

varBool5 :: Bool
varBool5 = 5 /= 23

varBool6 :: Bool
varBool6 = 5 <= 23


-- ------------------------------------------------------------------
-- -------------------------- Funciones -----------------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- ----------------- Defininendo funciones básicas ------------------
-- ------------------------------------------------------------------

-- ------------------------------------------------------------------
-- Ejercicio 12: Define una función que calcule la suma de los
--               primeros n números enteros. 
--
--               Ejecútala con tres valores distintos en terminal y
--               obten una captura de pantalla con tus resultados.
--
--               Describe de forma detallada la ejecución de la 
--               función cuando su valor de entrada es el 4, haciendo
--               explícita la participación de las cláusulas.  
-- ------------------------------------------------------------------
sumaN :: Int -> Int
sumaN 0 = 0
sumaN n = n + sumaN (n-1)


-- ------------------------------------------------------------------
-- Ejercicio 13: Copia la definición de la función foo que se
--               encuentra en el PDF de la práctica. 
--
--               Ejecútala con tres valores distintos en terminal y
--               obten una captura de pantalla con tus resultados.
--
--               Describe de forma detallada la ejecución de la 
--               función cuando su valor de entrada es el 5, haciendo
--               explícita la participación de las guardas.  
-- ------------------------------------------------------------------
foo :: Integer -> Integer
foo n
    | n `mod` 2 == 0 = n `div` 2
    | otherwise      = 3 * n


-- ------------------------------------------------------------------
-- Ejercicio 14: Copia la definición de la función foo2 que se
--               encuentra en el PDF de la práctica. 
--
--               Ejecútala con tres valores distintos en terminal y
--               obten una captura de pantalla con tus resultados.
--
--               Responde las preguntas: 
--                  ¿Qué resulta al evaluar foo2 (-3) ?
--                  ¿Qué resulta al evaluar foo2 1 ? 
--                  ¿Qué resulta al evaluar foo2 36 ?
--                  ¿Qué resulta al evaluar foo2 38 ? 
-- ------------------------------------------------------------------
foo2 :: Integer -> Integer
foo2 0 = 16
foo2 1
    | "Haskell" > "Java" = 3
    | otherwise          = 4
foo2 n
    | n < 0              = 0
    | n `mod` 17 == 2    = -43
    | otherwise          = n + 3


-- ------------------------------------------------------------------
-- Ejercicio 15: Factoriza la función isEven que aparece en el PDF de
--               la práctica. Es decir, escribe un código más sencillo
--               que funcione igual. 
-- ------------------------------------------------------------------
isEven :: Integer -> Bool
isEven n = n `mod` 2 == 0

