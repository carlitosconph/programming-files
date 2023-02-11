def sustituye_matriz(n:int, matriz: list[list[int]]) -> None:
    for i in range(len(matriz)): #!renglones
        fila = matriz[i]
        for j in range(len(fila)):  #!columnas
            num = matriz[i][j]
            if num % n == 0:           #?es_multiplo
                matriz [i][j] = -1
    print(matriz)

sustituye_matriz(5,[[1,2,3],[5,10,15],[1,2,3]])

