#if-else

#operador ternario
#imprime hola si es mayor o igual a 21 años, de lo contrario imprime bye
""" 
def dame_palabra(edad:int):
    texto_imprimir = ""

    if edad >= 21:
        texto_imprimir = "hola"
    else:
        texto_imprimir = "bye"


print(dame_palabra(21))
print(dame_palabra(2135))
print(dame_palabra(56))
print(dame_palabra(99))
print(dame_palabra(15))
 """

def dame_palabra_v2(edad:int):
    return  "hola" if edad >= 21 else "bye"
    

print(dame_palabra_v2(22))
print(dame_palabra_v2(12))
print(dame_palabra_v2(456))
print(dame_palabra_v2(20))
