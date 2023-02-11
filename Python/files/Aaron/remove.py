import random
tantos = ["A", "2", "3", "4", "5", "6", "7", "S", "C", "R"]
palos = ["oros", "copas", "espadas", "bastos"]
baraja = []

player_1 = []
player_2 = []
player_3 = []
player_4 = []

for t in tantos:
  for p in palos:
    carta = f"{t} de {p}"
    baraja.append(carta)

random.shuffle(baraja)

for i in range(5):
  