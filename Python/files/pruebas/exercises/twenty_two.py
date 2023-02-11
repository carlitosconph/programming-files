
def mayoromenor(num1:int, num2:int):
  if num1 > num2:
    return f'El numero mayor es: {num1}'
  elif num2 > num1:
    return f'El numero mayor es: {num2}'
  else:
    return 'Ambos numeros son iguales'

print(mayoromenor(2,3))
print(mayoromenor(13,2))
print(mayoromenor(2,2))
