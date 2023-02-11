
def calcularDias(num):

  year = 0
  month = 0
  day = 0

  helpp = 0

  year = num // 365
  helpp = num % 365

  month = helpp // 30
  helpp = helpp % 12

  day = helpp 


  print(f' Equivale a {year} anios, {month} meses y {day} dias. ')

calcularDias(920)
