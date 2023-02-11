# Manera Manual

#matriz = [[1,2,3], [4,5,6], [7,8,9]]
#matriz2 = [[1,2,3],
         # [4,5,6],
        #  [7,8,9]]

# Manera Automatica

#tamaño_filas = 3
#tamaño_columnas = 3
#matriz = []

#for i in range(tamaño_filas):
    #lista = [0] * tamaño_columnas    # lista => [0,0,0]
    #matriz.append(lista)   #Append: [[0,0,0]]

#print(matriz)

#Iteracion de matrices
matriz = [[1,2,3],  #0  [1,2,3]
          [4,5,6],  #1  [3,4,5]
          [7,8,9]]  #2  [7,8,9]
# for loop
#for i in range(len(matriz)):
 #   print(f"Entrando a fila: {i}")
  #  for j in range(len(matriz[i])):
   #     print(matriz[i][j])



#while loop
#i = 0
#while i < len(matriz):
 #   j = 0
  #  print(f"Entrando en fila: {i}")
   # while j < len(matriz[i]):
    #    print(matriz[i][j])
     #   j += 1
    #i += 1

# for loop sencilla (solo para leer)
#for fila in matriz:
#    for ele in fila:
 #       print(ele)


# Prueba

def reset_valores(matriz: list[list[int]]) -> None:
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            matriz[i][j] = 0
            print(f"({i},{j})=> {matriz[i][j]}")



reset_valores(matriz)
print(matriz)