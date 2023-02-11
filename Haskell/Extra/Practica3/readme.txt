INTEGRANTES:
-Hernández Vázquez Carlos Arturo.
-Rivera Soto Aline Daniela.

--FUNCIÓN LONGP
Definimos que si la lista es vacia automáticamente el tamaño de la lisat será igual a 0.
Para cualquier otra caso, se aplanara la lista y se le aplicara la función longL.
--función auxiliar longP.
Recibe la lista, si esta es vacia nos regresará 0, en caso contrario se sumara 1 a la cola podemos decir que de esta manera estamos reccorriendo la lista y sumando la cantidad de dijitos que tiene la lista aplanada.


--FUNCIÓN ELEMP
Primero definimos que si tenemos una lista vacia y un elemento 'd' la respuesta siempre será 'false'.
Para cualquier otro caso y para simplificar de alguna manera la función, vamos a aplaicar la función 'aplanar' a la lista dada. A esta lista aplanada le aplicaremos la función auxiliar de 'pertenece'.
--función auxiliar de pertenece.
Primero utilizaremos 'Eq' en la firma de la función para saber si dos elementos 'a' son iguales.
Establecemos que si la lista es vacia sea cual sea el elemento que se ingrese por el usuario la respuesta automática será 'False'.
Para el caso recursivo utilizamos un if en el que si el valor de 'n' es igual a la cabeza de la lista se regresara 'true', en caso contrario se vuelve a llamar a pertenece pero esta vez la cola y al volver entrar al ciclo ahora el primer elemento de la cola será tomado como el valor de la cabeza.

--FUNCIÓN CONSP
Tomará el primer elemento del par dado por el usario y le pegará el segundo elemento del par, que a su vez se pegará con la lista aplanada que el usuario ingreso, posteriormente a esta 'nueva' lista que se creo se le aplicará la función 'toEL' que hará que la lista 'nueva' y aplanada se convierta de nuevo en una EList.

--FUNCIÓN APPENDP
Definimos que si se recibe dos listas vacias se regresará una lista vacia. Por otro lado dadas dos EList lo único que ocurrirá será que concatenaremos ambas con ayuda de '++' y nos regresará las dos listas unidas en una sola.

--FUNCIÓN SNOCP
Se explicará esta función de derecha a izquierda para más fácil redacción y comprensión. Pegaremos el segundo elemento del par dado por el usuario con el primero y posteriormente con la reversa de la lista aplanada que el usuario ingreso. A esta 'nueva' lista que se creo le aplicaremos de nuevo reversa para que vuelva a tener su orden original. Por último le aplicaremos la función auxiliar toEL para volver a formar y devolver al usuario una EList.

--FUNCIÓN ATP
Cuando la lista sea vacia marcaremos un error acompañado con la leyenda "Lista Vacia". En cualquier otro caso la función auxiliar de énesimo n' se va a aplicar a la lista dada por el usuario pero  aplanada.
--función auxiliar enesimo n
Usamos de base la función 'quitaAux' para extraer el número que este en la posición que el usuario indique.
--función auxiliar quitaAux
Tomando de base la función head y tail. Definimos el caso base que nos dice que si le quitamos 1 a la lista nos devolverá el valor de la cabeza de la misma.Después por definicón recursiva establecemos que se le quitara n-1  elementos a la cola.

--FUNCIÓN UPDATEP
Regresaremos la función auxiliar de updatePAux con la lista introducida por el usuario, la misma lista aplanada, el número de la posición del elemento que se quiere intercambiar, el elemento con el que se quiere reemplazar, un 0 (que será en donde queremos que el contador inicie) y una lista vacia.

--función auxiliar updatePAUX
Recibe una EList, una lista, un entero que corresponde a la posición del elemento que queremos remplazar, un carácter que será elemento que remplazara al de la posción dada, un segundo entero que tendrá la función de contador y una lista vacia. Si la lista que el usuatio nos dio es vacia entonces se regresará una lista vacia.
En otro caso la función va a recibir la lista dada por el usuario, la misma lista aplanada y los demás valores en 0 o vacios. Para ver en que caso se entrara verificamos que el contador sea menor que la longitud de la lista aplanada, pues así nos aseguraremos de recorrerla toda.
Mientras el contador sea menor se entrara a un if que para determinar a que caso se manda compara el contador con el valor de n-1. Así que mientras el contador no llegue a la posición en la que el usuario quiere actualizar el elemento se aplicará la misma función solo que la cabeza de la lista se pasará a la lista que al inicio definimos como vacia y se le aumentará uno al contador. Cuando se vuelva a entrar a la función y el contador sea igual a n-1 querrá decir que ya llegamos a la posición del elemento que queremos actualizar entonces en lugar de agregar la cabeza de la lista a la lista 'vacia' se agregara el elemento dado por el usuario.
Esta acción se repetira hasta que, por la condición dada al inicio, se haya recorrido toda la lista y la elementos de la misma, a excepción del que se quería actualizar, ahora esten la lista definida al inicio como vacia.
Como el contador ya es igual a la longitud de la lista aplanada entonces se entra al caso en el que se devuelve la aplicación de la función 'toEL' a la  reversa de la lista 'vacia'.


--FUNCIÓN APLANAP
Si se nos da una lista vacia se nos regresará la misma lista vacia.
Para cualquier otro caso le aplicaremos a la cabeza de la lista  'fst' para que nos regrese el valor del primer  elemento del primer par de la Elist, este valor se pegará con la aplicación de 'snd',de nuevo a la cabeza la lista, que nos dará el valor del segundo elemento del primer par de la Elista, a su vez esto estará pegado con la aplicación de la misma función pero esta vez a la cola de la lista dada. Esto se repetirá hasta que la cabeza de la cola sea vacia.

--FUNCIÓN TOEL
Si recibimos una lista vacia devolvemos una vacia. En otro caso le aplicamos la función auxiliar de 'longL' para obtener el tamaño de la lista, a este valor le aplicamos la función mod con 2 (esto para ver si el tamaño de la lista es par) si el resultado es 0 entonces se tomara la cebeza de la lista y la cabeza de la cola de lista y se enserraran en un paréntesis, esto se pegará con aplicarle la misma función 'toEL' a la cola de la cola de la lista.
En caso de que el mod del tamaño de la lista no nos de 0 entonces esto quiere decir que lista es impar y se debe remover el último elemento para no tener en la EList un para que tenga como elemento el vacio. De nuevo para mayor facilidad de escritura y compresión se explicara de derecha a izquierda el como funciona.
Se le aplicará 'reversa' a la lista dada y a esta 'nueva' lista se le aplicará la función 'quita 1' lo que removerá la cabeza,a continuación se le vuelve a aplicar reversa a la lista a la cual ya se le quito un elemento para que quede en el orden original. Por último se aplica toEL de nuevo a esta 'nueva' lista, por lo que entra al ciclo anteriormente descrito.
--función auxiliar cabeza.
Para poder tomar la cabeza de la cola de la lista se utilizoó esta función que los que hace es tomar una lista y devolver el primer elemento de la misma.

--FUNCIÓN DROPP
Si se nos da una lista vacia entonces se devolverá "Error La lista no puede ser vacia". Cuando se quieran borrar 0 elementos entonces se regreserá la lista completa. Para borrar más elementos lo primero que comprobaremos es que el cantidad de elementos a borrar sea par, para esto le aplicaremos mod  de n con 2, en caso de que el resultado no sea igual a 0 se regresara "Exception: 'No es un número par". En caso contrario se aplanar la lista dada por el usuario, a esta lista aplanada se le aplicará la función auxliar de 'quita n' y al resultado de eso se le aplicará  la gfunción 'toEL' para regresarla al usuario una EList con los n elementos borrados.


--FUNCIÓN DROPN
Si le quitan 0 elementos a la lista dada entonces únicamente devolveremos la lista aplanada.
En caso de que se quiten más elementos entonces aplanaremos la lista y le aplicamos la función auxiliar de 'quita n'. Lo que nos devolverá la lista planada sin los primeros n elementos.
--función auxiliar quita n
Si se le quiere quitar un elemento a la lista entonces de la aplicara la función cola a la lista, lo que nos devolverá lista sin la cabeza.
Para quitar más de un elemento recurrimos a la recursión que hará que la función se repita hasta que el número de elementos a quitar sea 0, por cada ocasión que se entre a la función este le quitara un elemento a la lista.
--función auxiliar cola.
Dada una lista nos la devolverá sin la cabeza.

--FUNCIÓN TAKEP
Definimos que si el número ingresado por el usuario es o se devulve una lista vacia, independientemente de si la lista dada por el usuario era vacia o no.
Dado que hablamos de una EList el número que el usuario introduzca debe de ser par, para asegurarnos de que esto ocurra lo primero que haremos será aplicarle mod a n con 2, si el resultado no es 0 entonces se marca un error. En caso de que si sea 0 entonces entra a un if el cual comparara el número dado por el usuario con la longitud de la lista aplanada, en caso de que no sean iguales se le aplicará la función auxiliar  'takeNAux' a una lista vacia, el número dado por el usuario,la lista aplanda y un contador iniciado en 0. Al resultado de lo anterior se le aplicará la función 'reversa' y por último se le aplicará 'toEL'.
En caso de que el valor del número dado y la longitud de la lista aplanada sea el mismo entonces se aplica la función 'toEL' a la lista aplanada.

--FUNCIÓN TAKEN
Cuando queramos queramos regresar 0 elementos se nos devolverá una lista vacia.
En caso de querer extraer más elementos de la lista lo primero que ocurrirá será que verificaremos que el número de elementos que queremos extraer sea igual a la longitud de la lista aplanada, si esto sucede se regresa la lista aplanada. En otro caso se regresara la reversa del resultado de aplicar la función auxliar 'takeNAux' a una lista vacia, el número dado por el usuario, la lista aplanda y 0.

--FUNCIÓN AUXILIAR TAKENAux
Con ayuda de una lista vacia y un contador lo que hará esta función es verificar si el contador es menor que el número de elementos que se quiere regresar, siempre que sea menor entonce entrara en un caso recursivo en el que se aplicará la misma función pero por cad vez que se entre al caso recursivo la cabeza se agregará a la lista vacia y el contador aumentará uno. Cuando el contador sea igual al número de elementos que se quiere regresar entonces regresaremos la lista 'vacia' que para este punto ya no será vacia.

--FUNCIÓN REVERSAP
Si se tiene una lista vacia se regresa igualmente una lista vacia. En caso contrario se le aplicará la función 'toEL' a la reversa de la lista aplanada.

--función auxiliar de reversa
Toma la cebza de la lista dada y la concatena al final de lista, siendo esa cabeza ahora el rabo de esta 'nueva' lista y el nodo siguiente de la cabeza ahora se actualiza a la cabeza, este proceso se repite hasta que el valor de la cabeza sea el valor del rabo de la lista inicial.

--Lee todo el readme y asegurate de que no tenga errores, si se va uno te voy a dar un pumaputazo.

   --    --
  -   --   -
   -      -     Atentantamente, la computóloga de tu corazón:)
     -  -
       -
