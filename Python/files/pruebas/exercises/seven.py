
from traceback import print_tb


def numeros_impares(num1:int, num2:int):
  contador = 0
  numeros_impares = []
  for i in range(num1, num2):

    if i % 2 == 1:
      contador += 1
      numeros_impares.append(i)
  
  print(f'Hay {contador} numeros impares: {numeros_impares}. ')


numeros_impares(1,100)