

def carater_repetido(string:str):
  dic_str = {}
  contador = 0


  #! convirtieno el string en una string sin espacios y minuscula

  string_split = string.split()
  string_split = ''.join(string_split)
  string_split = string_split.lower()
  
  #! for para agreagar cada letra y contador en el diccionario 

  for i in string_split:
    if i not in dic_str:
      dic_str[i] = 1
    elif i in dic_str:
      dic_str[i] += 1

  #! sacar el valor mas alto de toda la string

  for j in dic_str:
    if dic_str[j] > contador:
      contador = dic_str[j]

  #! sacar key con el contador

  for key, value in dic_str.items():
    if contador == value:
      return f'El caracter mas repedito es -{key}-, con una cantidad de {contador} veces en el texto ingresado ({string}). '

print(carater_repetido('Carlos Arturo'))
print(carater_repetido('AACC'))
