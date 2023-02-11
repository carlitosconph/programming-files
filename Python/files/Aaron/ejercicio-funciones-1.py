
def cuenta_vocales(palabra: str) -> int:
    vocales = 0
    for letra in palabra:
        if letra in "aeiou":
            vocales += + 1
    return vocales

print(cuenta_vocales("Hola"))
print(cuenta_vocales("BB"))
print(cuenta_vocales("aaeiou"))
print(cuenta_vocales(""))



