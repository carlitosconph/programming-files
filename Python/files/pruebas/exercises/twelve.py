


def eightxeight(num:int) -> list:
  numbers = ''

  for i in range(num, 0, -8):
    numbers += (f'n-{i}' + '\n')

  return numbers

print(eightxeight(100))