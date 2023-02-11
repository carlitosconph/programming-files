
#! operaciones aritmeticas
(( c = a + b ))
#! imprimir
echo
#! usar variables($)
$nombre_de_la_variable
#! para obtener parametros del usuario (-n -> para no haga un salto de linea)
echo -n 'Mensaje para el user: '
read message
#! igual que
-eq
#! no es igual
-ne
#! mayor que
-gt
#! menor que
-lt
#! mayor o igual que
-ge
#! menor o igual que
-le
#! and
-a
#! or
-o
#! para saber el numero de parametros ingresados
$#
#! ingresar a cada parametro dependiendo de su lugar
$1, $2, $3, $4 ..... $n
#! testear si existe un fichero
-f -> if [ -f $1 ]; then
#! testear si un directorio existe
-d -> if [ -d $1 ]; then
#! negar
!