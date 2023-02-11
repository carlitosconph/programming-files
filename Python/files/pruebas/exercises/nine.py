
def arrays_comunes(lista1:list, lista2:list) -> list:
  final_array = []
  
  for i in range(len(lista1)):
    if lista1[i] in lista2 and lista1[i] not in final_array:
      final_array.append(lista1[i])

  return final_array


print(arrays_comunes([4,5,6,9,7,7], [7,8,9,7,5]))