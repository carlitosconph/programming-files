# get(llave): accesar diccionario de manera segura
""" diccionario = {
    "llave1": "valor1"
} """
""" valor = diccionario["llave2"] """
# NONE
""" valor = diccionario.get("llave2")
if valor == None:
    print("No existe esta lalve") """

# get(llave, valor_default)
""" valor = diccionario.get("llave2", -1)
if valor == -1:
    print("La llave no existe")

 """


#copy(): te regresa una copia
""" copia = diccionario.copy()
copia["llave2"] = "valor2"
print(diccionario)
print(copia)
 """

#items(): ´por valor y llave al mismo tiempo

""" for llave, valor in diccionario.items():
    print(f"{llave}:{valor}")


#key(): iterar por llave
for llave in diccionario.keys():
    print(llave)
     """

#values(): por valores 
""" for valor in diccionario.values():
    print(valor)
     """

# pop(llave): elimina el par llave:valor que está asociado  con esa llave y regresa el valor

diccionario = {
    "llave1":"valor1",
    "llave2":"valor2",
    "llave3":"valor3",
}
""" print(f"antes {diccionario}")
valor_borrado = diccionario.pop("llave2")
print(valor_borrado)
print(f"Despues {diccionario}") """

#popitem(): elimina el ultimo par llave:valor que se agregó al diccionario y lo regresa
""" print(diccionario)
diccionario["llave4"] = "valor4"
print(diccionario)
llave,valor = diccionario.popitem()
print(f"{llave}:{valor}")
print(diccionario) """

#se puede modificar un valor existente


diccionario["llave2"] = "Aaron"
print(diccionario)