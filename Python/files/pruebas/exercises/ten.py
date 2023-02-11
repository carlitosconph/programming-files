def escalera(num:int):
  escalera = ''

  for i in range(num):
    j = i + 1
    escalera += '[-]' * j + '\n'
  
  return escalera


print(escalera(4))