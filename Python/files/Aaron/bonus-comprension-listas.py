# regresa lista de numeros del 1 al 10 elevados 2}}

""" lista = [1,2,3,4,5,6,7,8,9,10]
lista_cuadrados = []
for i in lista:
    lista_cuadrados.append(i**2)
print(lista_cuadrados)

 """

""" lista = [1,2,3,4,5,6,7,8,9,10]
lista_cuadrados = [i**2 for i in lista]
print(lista_cuadrados)
 """
# solo numeros pares

""" lista = [1,2,3,4,5,6,7,8,9,10]
lista_cuadrados = []
for i in lista:
    if i % 2 == 0:
        lista_cuadrados.append(i**2)
print(lista_cuadrados) """


lista = [1,2,3,4,5,6,7,8,9,10]
lista_cuadrados = [ i ** 2 for i in lista if i % 2 == 0]
print(lista_cuadrados)

