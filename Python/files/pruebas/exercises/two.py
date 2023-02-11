def palindromo(word:str):
  prueba = word[::-1]
  if prueba == word:
    return 'Es palindromo.'
  else:
    return 'No es palindromo.'



print(palindromo('casa'))
print(palindromo('ana'))