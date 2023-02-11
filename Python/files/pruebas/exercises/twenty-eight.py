


def factorial(num):
  
  fac = 1

  for i in range (num):
    fac *= i+1

  return fac 

print(factorial(3))