from logging.config import dictConfig


def llave_existe (diccionario:dict[str,int], llave: str) -> bool:
    return diccionario.get(llave) != None


diccionario = {
    "a": 1, "b":2, "c": 3,
}

print(llave_existe(diccionario, "llave"))
print(llave_existe(diccionario, "a"))