# VARIABLES GLOBALES
k_vacio = 0
k_tablero_final = [[1,2,3,4],
                 [5,6,7,8],
                 [9,10,11,12],
                 [13,14,15,k_vacio]]

tablero = []
turno = 0
row_vacio = -1
col_vacio = -1
juegos = 0

# Aqui puedes especificar el tablero con el que quieres empezar.
# Recuerda siempre usar la variable k_vacio y que sea un tablero
# valido si es que quieres poder terminar el juego.
def get_tablero() -> list[list[int]]:
  return [[1,2,3,4],
          [5,6,7,8],
          [9,10,k_vacio,12],
          [13,14,11,15]]

def init_juego() -> None:
  global tablero
  global turno
  global row_vacio
  global col_vacio
  tablero = get_tablero()
  turno = 0
  coords_vacio = encuentra_coords_vacio()
  row_vacio = coords_vacio[0]
  col_vacio = coords_vacio[1]


def encuentra_coords_vacio() -> list[int]:
  for i in range(len(tablero)):
    for j in range(len(tablero[i])):
      num = tablero[i][j]
      if num == k_vacio:
        return [i, j]
  print("ERROR: Tiene que haber una casilla vacia para poder jugar.")
  exit()


def jugar_otra_vez() -> bool:
  if juegos == 0:
    return True
  
  respuesta = input("Quieres volver a jugar? (si/no): ")
  return respuesta[0].lower() == 's'

# Aqui vas a imprimir el tablero
def imprime_bonito() -> None:
  gatos_numero = 15
  print(f"{'#' * gatos_numero} TABLERO {'#' * gatos_numero}")
  
  print(end="\t")
  for i in range(len(tablero[0])):
    print(i,end="\t")
  print()

  for i in range(len(tablero)):
    print(i,end="\t")
    for num in tablero[i]:
      print(f"{num}", end="\t")
    print()

  print()
  print(f"Vacio: {row_vacio},{col_vacio}")
  print(f"Turno: {turno}")
  print("Haz tu movimiento. \n")


# Aqui vas a imprimir lo que le quieras mostrar al usuario cuando gane el juego
def imprimir_resultado() -> None:
  gatos_numeros = 15
  print(f"#" * gatos_numeros)
  print(f"Ganaste.")
  print(f"Te tardaste {turno} turnos.")
  print("Felicidades")
  pass


# Aqui vas a regresar True si el usuario ya gano el juego, de lo contrario False
def ya_gano() -> bool:
  
  pass


# Aqui vas a verificar si el movimiento que te paso (row, col) es valido.
# Un movimiento es valido si ese numero se puede intercambiar con el
# lugar vacio sin romper las reglas.
def movimiento_valido(row: int, col: int) -> bool:
  pass


# Aqui le vas a preguntar al usuario cual numero quiere mover, le vas a 
# preguntar la fila y columna, posteriormente vas a verificar que sea 
# valido utilizando la funcion movimiento_valido(row, col), vas a volver
# a preguntar hasta que sea valido. Y vas a regresar la fila y columna
# en una lista de tamaño 2 donde la posicion 0 es la fila y la posicion 
# 1 es la columna. 
def pide_movimiento() -> list[int]:
  pass
  

# Aqui vas a intercambiar el vacio con el movimiento (row, col) que
# ingreso el usuario.
def intercambia(row: int, col: int) -> None:
  pass


# Aqui vas a actualizar la nueva posicion del usuario despues de haber
# hecho el intercambio.
def actualiza_vacio(row: int, col: int) -> None:
  pass


def has_movimiento(row: int, col: int) -> None:
  intercambia(row, col)
  actualiza_vacio(row, col)


while jugar_otra_vez():
  init_juego()
  while not ya_gano():
    imprime_bonito()
    movimiento = pide_movimiento()
    has_movimiento(movimiento[0], movimiento[1])
    turno += 1
  imprime_bonito()
  imprimir_resultado()
  juegos += 1