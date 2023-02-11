""" def combina_diccionario(dicc_1:dict[str,int], dicc_2:dict[str,int])->dict[str,int]:
    diccionario = {}
    for llave, valor in dicc_1.items():
        diccionario[llave] = valor + dicc_2[llave]
    return diccionario
 """

dicc_1 = {
    "hola":1
}
dicc_2 = {
    "hola": 1
}
""" print(combina_diccionario(dicc_1, dicc_2)) """


def combina_diccionarios_v2(dicc_1:dict[str,int], dicc_2: dicc_2:dict[str, int])->dict[str, int]:
    diccionario = {}
    for llave, valor in dicc_1.items():
        diccionario[llave] = valor + dicc_2.get(llave, 0)

