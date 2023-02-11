
def alCuadrado(array:list) -> list:

  finalArray = []
  
  for i in array:
    finalArray.append((i**2))

  return finalArray

print(alCuadrado([5,6,7]))
print(alCuadrado([2,4,6]))