
def multiplos(num:int):
  
  for i in range(1,(num + 1)):
    if i % 3 == 0 and i % 5 == 0:
      print('Buzzlightyear')
    elif i % 3 == 0:
      print('buzz')
    elif i % 5 == 0:
      print('lightyear')
    else:
      print(i)





multiplos(5)