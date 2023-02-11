
def divisores(num:int):
  for i in range(1, (num + 1)):
    if num % i == 0:
      print(i)

divisores(5)
print()
divisores(6)