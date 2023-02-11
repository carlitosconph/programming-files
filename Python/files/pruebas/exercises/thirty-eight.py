
def cuadrados(number:int) -> list[int]:
  return [num**2 for num in range(number)]

print(cuadrados(20))