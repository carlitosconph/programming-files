Hernadez Vazquez Carlos Arturo

Ejercicio 8: ¿Cómo indicaríamos al compilador que realice restas de números negativos? 
--- Pondria cada numero negativo en un respectivo parentesis

Ejercicio 12: Describe de forma detallada la ejecución de la  función cuando su valor de entrada es el 4, haciendo explícita la participación de las cláusulas.  
--- Cuando n es = 4, entra a la cláusula de sumaN n (no a la de 0) y 'n + sumaN (n-1)' pasa a ser '4 + sumaN(4-1)'. En la parte que dice nuevamente 'sumaN(4-1)' lo que ocurre es que se llama de forma recurisva a la funcion y asi obtenemos dicho valor hasta que sumaN(n-1) sea 0. Esto ultimo ya que existe la cláusula 'sumaN 0 = 0' 
La primera vez que llamamos a la funcion con n = 4 => 4 + sumaN (4-1). Se llama a suma(4-1) que es igual que sumaN(3), lo que provoca que pasemos a '3 + sumaN(3-1). Lo anterior vuelve a llamar la funcion, pero ahora n = 2 => 2 + sumaN(2-1), y nuevamente se hace la llamada => 1 + sumaN(0). Este ultimo sumaN(0) entra en la primera cláusula de la funcion, lo que nos devuelve como valor 0 y ahora solo tenemos que sumar todos los enteros que fuimos consiguiendo en cada llamada a la funcion: 0 + 1 + 2 + 3 + 4 = 10

Ejercicio 13: Describe de forma detallada la ejecución de la función cuando su valor de entrada es el 5, haciendo explícita la participación de las guardas. 
--- Al tener n = 5, entra entra en el primer guard y hacer la siguiente operacion => 5 `mod` 2 == 0. Esto es falso, pues el modulo de 5 y 2 no es igual a 0, asi que pasa al siguiente guard, el cual indica que en cualquier caso, se debe regresar 3 * n, que en nuestra situacion es => 3 * 5, que nos da como resultado 15

Ejercicio 14: Responde las siguientes preguntas:
¿Qué resulta al evaluar foo2 (-3) ?
--- Da 0
¿Qué resulta al evaluar foo2 1 ? 
--- Da 4
¿Qué resulta al evaluar foo2 36 ?
--- Da -43
¿Qué resulta al evaluar foo2 38 ? 
-- Da 41

Comentario: Me gusto la practica, ya que iniciamos desde cero y asi podemos entender mejor cada aspecto c: