
def contador_vocales(string:str):
  contador = 0

  for i in string.lower():
    if i in 'aeiou':
      contador += 1

  return f'Hay {contador} vocales en el texto'

print(contador_vocales('Carlos'))
print(contador_vocales('aeiou'))