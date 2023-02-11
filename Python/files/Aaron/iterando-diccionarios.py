diccionario = {
    "Aron":23,
    "Ale": 17,
    "Cami": 15,
    "Yo":18,
}

#iterando por llaves
#keys()

""" for llave in diccionario.keys():
    valor = diccionario[llave]
    print(f"{llave}:{valor}") """


# iterar valores
# values()
""" for valor in diccionario.values():
    print(valor)
 """

# iterar por llave y valor, al mismo tiempo
# items()
for llave,valor in diccionario.items():
    print(f"{llave}:{valor}")
