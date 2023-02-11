Hernandez Vazquez Carlos Arturo

1.-
Para el numero 1 no hice algo muy distinto a lo que hicimos en clase. Hago uso de la funcion 'mod' para calcular el resto de la division del numero n entre 2, y de esta forma, si es == 0, es par.
Esto lo hice tanto para la funcion par como para la funcion impar.

2.
En el punto numero dos es algo parecido, solo que hice uso de un un if, solo comparé el numero n con m y, dependiendo si hablo de la funcion minimo o maximo, devolví el numero correcto en la parte de then y else

3.-
En la funcion 'absoluto' lleva un cuerpo muy similar a la anterior. Hago uso de un if y en el caso de que el numero n ingresado sea negativo, lo multiplico por -1 para convertirlo en positivo y poder devolver el resultado correcto

4.-
Esta funcion la resolvimos en el laboratorio. Creamos una funcion auxiliar llamada 'divEAux'. No se me había ocurrido usar una tercer variable, la cual contabilizara la cantidad de veces que un numero cabe en otro.

5.-
Fueron de las funciones más sencillas a mi parecer, solo devolví la cabeza (en mi caso 'c'). Para el caso de la cola, devolví 'cl'

6.-
'quita n' fue una de las dos funciones que se me complicó. Mi problema fue en la parte de la recursividad, pues el caso base lo ya lo tenía implementado antes de la clase en el laboratorio. Entendí que para llevarla acabo necesitaba disminuir mi n en cada llamada a la funcion y pasar como argumento la cola de mi lista, no la lista entera. Esta parte de la recurvidad igual la vimos en el laboratorio.

7.-
Esta funcion fue la que mas se me dificultó, al principio no sabía como hacerla, de hecho, intercambié ideas con un par de compañeros hasta que entre ideas llegamos a una posible solución. Ya solo era implementarla en codigo, hice uso de una funcion auxiliar (como en divE), que es practicamente la funcion 'quita n' pero en lugar de regresar una lista, en mi funcion auxiliar 'quitaAux' devuelvo un int, este entero es la cabeza de mi lista.
Basicamente hice que se vaya quitando elemento a elemento hasta que mi n sea 0, y ahi es cuando regreso la cabeza de la lista, ese elemento es el que esta en el numero o indice que se proporcionó en un comienzo

(una disculpa si llegan a faltar acentos, mi teclado no tiene la posibilidad de usarlos, y en forma de codigo se me dificulta ponerlos, aun asi, trato de hacerlo)

