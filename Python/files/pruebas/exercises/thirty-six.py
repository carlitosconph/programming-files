
from re import I

#todo regex para simplificar la condicion
def cuentaLetras (string:str):
  vocales = 0
  consonantes = 0

  for i in string:
    if i.lower() in 'aeiou':
      vocales += 1
    elif i.lower() in 'bcdfghjklmnpqrstvwxyz':
      consonantes += 1
    
  return f'Consontantes: {consonantes}\n Vocales: {vocales}'


print(cuentaLetras('carlos.'))