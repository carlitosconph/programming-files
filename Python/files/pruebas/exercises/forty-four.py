
def dos_palabras(array: list[str]) -> list[str]:
  return [string for string in array if ' ' in string]

print(dos_palabras(['hola', 'san francisco', 'ciudad real', 'carlos']))