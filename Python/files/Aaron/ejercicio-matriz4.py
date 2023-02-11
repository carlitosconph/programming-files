
def imprime_bonit(matriz:list[list[int]]) -> None:
    for renglon in matriz:
        for num in renglon:
            print(num, end =" ")
        print()

imprime_bonit([[1,2,3],[1,2,3],[1,2,3]])


""" 
def dibujo_cruz(matriz:list[list[int]]) -> None:
    tamaño = len(matriz)

    #dibujo diagonal de izquierda a derecha
    i = 0
    j = 0
    while i < tamaño and j < tamaño:
        matriz[i][j] = 0
        i += 1
        j += 1

     #segunda diagonal
    i = 0   
    j = tamaño + 1
    while i < tamaño and j >= 0:
        matriz[i][j] = 0
        i += 1
        j -= -1 """