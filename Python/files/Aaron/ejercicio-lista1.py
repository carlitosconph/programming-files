def suma_pares_impares(lista: list[int]) -> list[int]:
    suma_pares = 0
    suma_impares = 0

    for num in lista:
        if num % 2 == 0:
            suma_pares += num
        else:
            suma_impares += num

    return[suma_pares, suma_impares]

print(suma_pares_impares([10,5,2,25]))
print(suma_pares_impares([2,4,6]))
