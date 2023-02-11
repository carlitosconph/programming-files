def es_digito(letra: str) -> bool:
    return letra in "0123456789"
        
def quita_digitos(palabra: str) -> str:
    palabra_nueva = ""
    for letra in palabra:
        if es_digito(letra):
            continue
        palabra_nueva += letra
    return palabra_nueva


print(quita_digitos("H0l4"))
print(quita_digitos("w00t"))
print(quita_digitos("0123456789"))
print(quita_digitos("bye"))
