def vocal(letra: str) -> bool:
    return letra in "aeiou"

def quita_vocales(palabra: str) -> str:
    palabra_nueva = ""

    for i in range(len(palabra)):
        letra = palabra[i]
        if vocal(letra):
            continue
        palabra_nueva += letra
    return palabra_nueva

print(quita_vocales("hola"))
print(quita_vocales("aeiou"))
print(quita_vocales("abc"))
print(quita_vocales("holaaa"))