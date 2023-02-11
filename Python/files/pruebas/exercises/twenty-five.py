


def mayusMinus(string:str) -> str:

  contMAyus = 0
  contMinus = 0

  for i in string:
    if i >= 'A' and i <= 'Z':
      contMAyus += 1
    elif i >= 'a' and i <= 'z':
      contMinus += 1

  if contMAyus > contMinus:
    return string.upper()
  else:
    return string.lower()

print(mayusMinus('CarlOs'))
print(mayusMinus('CARlOs'))