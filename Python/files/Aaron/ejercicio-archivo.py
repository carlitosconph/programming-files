from turtle import pensize


def remplaza_vocales(palabra:str) -> str:
    palabra_nueva = ""
    for letra in palabra:
        if letra in "aeiou":
            palabra_nueva = "x"
        else:
            palabra_nueva += letra
    return palabra_nueva



def escribe():
    with open("ejercicio.txt", "w") as archivo:
        for i in range(5):
            archivo.write(f" palabra{i}\n")


def lee():
    with open("ejercicio.txt", "r") as archivo:
        for linea in archivo:
            linea_sin_enter = linea.strip()
            palabra = remplaza_vocales (linea_sin_enter)
            print(palabra)



escribe()
lee()

