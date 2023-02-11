

""" #! principal function

def split_array(array:list, num:int) -> list:

  final_array = []
  numero_ayuda = len(array)
  item = 0
  iterando = True

  #! creating list in the list

  for i in range(num):
    final_array.append([])


  #! adding items to the final list

  while iterando:

    for j in range(numero_ayuda):     #! equivale a los items de la array principal (4)
      for k in range(len(final_array)):    #! equivale a la cantidad de listas que hay en la lista final

        if item <= (numero_ayuda -1):         #! comprueba si existe el index en la lista para agregar, si no existe, termina el while
          final_array[k].append(array[item])
          item += 1
        else:
          iterando = False


  return final_array




#! call function

print(split_array( [7,8,9,10], 2 ))

#? expected result = [[7,8], [9,10]] """





#todo SEGUNDO METODO XD









def split_array(array:list, num:list) -> list:
  final_array = []
  array_append = []
  iterando = True
  numero_ayuda = 0


  


  return final_array








print(split_array( [7,8,9,10], 2))