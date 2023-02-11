#def modifica_num(b: int) -> None:
 #   b = 5
  #  print(f"Adentro: {b}")

#a = 10
#modifica_num(a)
#print(f"Afuera: {a}")


def modifica_lista(lista: list) ->None:
    copia = lista.copy()
    copia[0] = 99
    print(f"Adentro: {copia}")

lista_orginal = [10,20,30,40,50]
modifica_lista(lista_orginal)
print(f"Afuera: {lista_orginal}")

