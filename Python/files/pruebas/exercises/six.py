
#! Dibujar un cuadrado, hueco, con asteriscos

#* solucion 1

""" #! Lado superior e inferior


def top_bot(num:int):
  top_bot = ''
  for i in range(num):
    top_bot += '*'

  return top_bot



#! Lado derecho, izquierdo y centro
def right_left(num:int):
  right_left = ''
  for i in range(2):
    right_left += '*'
  
  lista = list(right_left)

  for i in range(num - 2):
    lista.insert(1, ' ')
  final_list = ''.join(lista)

  return final_list

def main(num:int):

  print(top_bot(num))
  for i in range(num - 2):
    print(right_left(num))
  print(top_bot(num))

main(5) """

#* solucion 2

#? Top and bot
from traceback import print_tb


def top_bot(num:int):
  top_bot = ''
  for i in range(num):
    top_bot += '*'

  return top_bot

def main(num:int):
  draw = top_bot(num) + '\n'

  for i in range(num-2):
    draw += '*' + (' ' * (num -2) + '*' + '\n')

  draw += top_bot(num)

  return draw

print(main(4))
print(main(5))
print(main(6))