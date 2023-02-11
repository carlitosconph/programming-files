import re

def censura(texto:str, search:str):

  
  texto_copia = re.split('[,\s]', texto)

  for i in range(len(texto_copia)): 
    if texto_copia[i] == search:
      texto_copia[i] = '[CENSURADO]'

  final_text = ' '.join(texto_copia)

  return final_text


print()

try:
  print(censura('hola, carlos, hola'))
except TypeError:
  print('Uno de los parametros de la funcion no fue ingresado')

print()

try:
  print(censura('hola, carlos, hola', 'hola'))
except TypeError:
  print('Uno de los parametros de la funcion no fue ingresado')

print()