lista = []


for num in range(6):
    agregar = int(input("dime un numero: "))
    lista.append(agregar)



def cuadrados(lista:list[int])->list[int]:
    for i in lista:
        exponente = i **2
        print(exponente)

cuadrados(lista)