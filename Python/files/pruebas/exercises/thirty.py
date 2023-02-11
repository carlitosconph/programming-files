import re
#todo hacer que los strings sean eliminados


def deletDup(array:list) -> list:

  finalArray = []

  for i in array:

    if i not in finalArray:
      finalArray.append(i)
      
  print(finalArray)

print(deletDup([1,2,1,1,1,3,4, '2']))