def sustituye(n:int, lista:list[int]) ->list[int]:
    copia = lista.copy()

    for i in range(len(copia)):
        if copia[i] == n:
            copia[i] = -1
    return copia


print(sustituye(2, [2,1,3,2,4]))
print(sustituye(2,[2,2,2,2,]))





