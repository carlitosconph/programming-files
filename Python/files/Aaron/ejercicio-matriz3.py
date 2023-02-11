def imprime_bonit(matriz:list[list[int]]) -> None:
    for renglon in matriz:
        for num in renglon:
            print(num, end =" ")
        print()

imprime_bonit([[1,2,3],[1,2,3],[1,2,3]])

