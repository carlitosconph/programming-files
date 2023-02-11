


def firstALast(array:list) -> list:

  finalArray = []

  finalArray.append(array[0])
  finalArray.append(array[-1])
  
  return finalArray

print(firstALast([100,200,300,700,1000]))