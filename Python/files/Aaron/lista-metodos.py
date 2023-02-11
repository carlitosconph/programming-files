# append: agregar un elemento al final
""" lista = [10,20,30]

lista.append(40)
print(lista) """

# extend: agregar otras listas al final y en el mismo nivel
""" lista = [10,20,30]
lista2 = [40,50,60]
lista.extend(lista2)
print(lista) """

# insert: insertar elementos en un indice dado
#lista.insert(indice, elemento)
""" lista = [10,20,40]
lista.insert(2, 30)
print(lista) """

# remove: quita la primera aparicion del elemento que se envia, pero si no encuentra, marca error
""" lista = [10,20,30]
lista.remove(20)
print(lista) """

# sort: ordena la lista de menor a mayor
""" lista = [50,5,13,56]
lista.sort()
print(lista)
 """

#copy: regresa una copia de la lista original
lista = [1053,2,30,4]
copia = lista.copy()
copia.sort()
print(lista)
print(copia)

