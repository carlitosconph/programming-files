def mayor(lista:list[int]) -> int:
    if len(lista) <= 0:
        return -1
    mayor = lista[0]

    for num in lista:
        if num > mayor:
            mayor = num

    return mayor


print(mayor([2,3,1]))
print(mayor([2,3,4,1,6,234]))
print(mayor([10]))
