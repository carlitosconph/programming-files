print("############### TABLERO ###############")

def imprime_bonit(matriz:list[list[int]]) -> None:
    for renglon in matriz:
        for num in renglon:
            print(num, end =" ")
        print()

imprime_bonit([["",1,2,3],[0,1,2,3,4],[1,5,6,7,8],[2,9,10,11,12],[3,13,14,0,15]])
