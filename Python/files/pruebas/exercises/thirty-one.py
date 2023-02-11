
def angulo(num:int) -> str:
  
  if num > 0 and num < 90:
    return 'agudo'
  elif num == 90:
    return 'recto'
  elif num > 90 and num < 180:
    return 'obstuso'
  elif num == 180:
    return 'llano'


print(angulo(47))
print(angulo(90))
print(angulo(145))
print(angulo(180))