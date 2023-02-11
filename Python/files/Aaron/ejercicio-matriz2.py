def aplana(matriz: list[list[int]]) -> list[int]:
    lista = []
    for renglon in matriz:
        for num in renglon:
            lista.append(num)

    lista.sort()
    return lista



print(aplana(([[5,3], [2,1]])))
