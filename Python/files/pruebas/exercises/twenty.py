

def anagrama(string1:str, string2:str):

  for i in string1.lower():
    if i not in string2.lower():
      return False

  if (len(string1.lower())) == (len(string2.lower())):
    return True
  else:
    return False



print(anagrama('Riesgo', 'sergio'))
print(anagrama('Riesga', 'Sergio'))
print(anagrama('ergios', 'Sergio'))
print(anagrama('hola', 'alih'))
print(anagrama('hola', 'aloh'))
