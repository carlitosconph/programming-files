import random
import os
import readchar

end_game = False


POS_X = 0
POS_Y = 1

NUMBRES_OF_TRAINERS = 7

my_position = [0, 1]
map_trainers = []

obstacle_definition = """\
##########################
                      #####
##    ########          ###
##    #####             ###
      ####                 
###   ############      ###
####   ##                ##
#                    ######
###########                
########      ####      ###
######     ###            #
##          ##          ###
#####    ##########  ##    
#####      #########    ###
###########################\
"""

#!Create obstacle map
obstacle_definition = [list(row) for row in obstacle_definition.split('\n')]

MAP_WIDTH = len(obstacle_definition[0])
MAP_HEIGHT = 15


#!Generate random trainers on
while len(map_trainers) < NUMBRES_OF_TRAINERS:
  new_position = [random.randint(0, MAP_WIDTH - 1), random.randint(0, MAP_HEIGHT - 1)]
  if new_position not in map_trainers and new_position != my_position and obstacle_definition[new_position[POS_Y]][new_position[POS_X]] != '#':
    map_trainers.append(new_position)
    

#?Main lopp

while not end_game:
  os.system('clear')

  
  #* Draw map

  titulo = '=-----------------------POKEMON----------------------='
  print('=' * len(titulo))
  print(titulo)
  print('=' * len(titulo))
  print()
  print('+' + '-' * MAP_WIDTH * 2 + '+')

  for coordinate_y in range(MAP_HEIGHT):
    print('|', end='')

    for coordinate_x in range(MAP_WIDTH):
      
      char_to_draw = '  '
      object_in_cell = None

      for map_trainer in map_trainers:
        if map_trainer[POS_X] == coordinate_x and map_trainer[POS_Y] == coordinate_y:
          char_to_draw = ' *'
          object_in_cell = map_trainer

      if my_position[POS_X] == coordinate_x and my_position[POS_Y] == coordinate_y:
        char_to_draw = ' @' 

        if object_in_cell:
          map_trainers.remove(object_in_cell)
        
      if obstacle_definition[coordinate_y][coordinate_x] == '#':
        char_to_draw = '##'

      print(f'{char_to_draw}',end='')
    print('|')

  print('+' + '-' * MAP_WIDTH * 2 + '+')


  #! Ask user when he wants to move

  direction = readchar.readchar()
  new_position = None

  if direction == 'w':
    new_position = [my_position[POS_X], (my_position[POS_Y] - 1) % MAP_WIDTH]
  elif direction == 's':
    new_position = [my_position[POS_X], (my_position[POS_Y] + 1) % MAP_WIDTH]

  elif direction == 'a':
    new_position = [(my_position[POS_X] - 1) % MAP_WIDTH, my_position[POS_Y]]

  if direction == 'd':
    new_position = [(my_position[POS_X] + 1) % MAP_WIDTH, my_position[POS_Y]]

  elif direction == 'q':
    end_game = True

  if new_position:
    if obstacle_definition[new_position[POS_Y]][new_position[POS_X]] != '#':
      my_position = new_position

  for trainer in map_trainers:
    if my_position[POS_X] == trainer[POS_X] and my_position[POS_Y] == trainer[POS_Y]:
      os.system('clear')


      pokemon_rival = ['Charmander', 'Pidgey', 'Rattata', 'Arbok', 'Raichu']

      ataques_rival = [['mordida', 10], ['cabezaso', 15],['latigo', 20]]

      titulo = '=-------------------BATALLA POKEMON------------------='
      print('=' * len(titulo))
      print(titulo)
      print('=' * len(titulo))
      print('Acabas de retar a un entrenador pokemon, preparate para la pelea!!!')
      input('Enter para continuar... \n')

      print('Estos son los pokemon con los que cuentas:')
      print('1. Charmander')
      print('2. Pikachu')
      print('3. Bulbasaur')
      print()

      while True:
        eleccion = (input('Escribe el numero del pokemon que eligas [1/2/3]: '))
        if eleccion == '1':
          eleccion_pokemon = 'Charmander'
          break
        elif eleccion == '2':
          eleccion_pokemon = 'Pikachu'
          break
        elif eleccion == '3':
          eleccion_pokemon = 'Bulbasaur'
          break
        else:
          print('Esa no es una opcion valida.')

      eleccion_pokemon_rival = random.choice(pokemon_rival)

      print(f'\nEl pokemon que elegiste es {eleccion_pokemon}')
      print(f'El rival peleara con {eleccion_pokemon_rival}\n')

      input('Enter para comenzar la batalla... ')
      os.system('clear')

      vida_user = 100
      vida_rival = 120

      jugando = True

      while jugando:

        titulo = '=-------------------BATALLA POKEMON------------------='
        print('=' * len(titulo))
        print(titulo)
        print('=' * len(titulo))

        print()


        print(f'La vida de {eleccion_pokemon} es de {vida_user}. ',end='')
        print('['+'#' * (vida_user // 10)+']')

        print(f'La vida de {eleccion_pokemon_rival} es de {vida_rival}. ',end='')
        print('['+'#' * (vida_rival // 10)+']')

        ataque_batalla = random.choice(ataques_rival)
        dano_rival = ataque_batalla[1]

        print(f'\nEl rival inicia la batalla. {eleccion_pokemon_rival} usa {ataque_batalla[0]}.')
        vida_user -= dano_rival
        print(f'Este ataque le quito {dano_rival} a tu pokemon.\n')

        print('Ahora es tu turno.')
        input('Enter para continuar... ')

        print('\nTienes estos ataques: ')
        print('1. Rasguño')
        print('2. Bola de fuego')
        print('3. Patada')
        print()

        while True:
          eleccion_ataque_user = (input('Escribe el numero del ataque que eligas [1/2/3]: '))
          if eleccion_ataque_user == '1':
            eleccion_atacar = 'Rasguño'
            print(f'\nEl ataque {eleccion_atacar} le quito 10 puntos de vida al rival')
            vida_rival -= 10
            break
          elif eleccion_ataque_user == '2':
            eleccion_atacar = 'Bola de fuego'
            print(f'\nEl ataque {eleccion_atacar} le quito 20 puntos de vida al rival')
            vida_rival -= 20
            break
          elif eleccion_ataque_user == '3':
            eleccion_atacar = 'Patada'
            print(f'\nEl ataque {eleccion_atacar} le quito 15 puntos de vida al rival')
            vida_rival -= 15
            break
          else:
            print('Esa no es una opcion valida.')

        print(f'La vida del rival es de {vida_rival}\n')
        

        if vida_rival <= 0:
          print('Has ganado, la vida del rival llego a 0!')
          print('Ahora puedes seguir con tu aventura!\n')
          input('Enter para continuar... ')
          NUMBRES_OF_TRAINERS -= 1
          jugando = False
        elif vida_user <= 0:
          print('Has perdido, tu vida ha llegado a 0')
          print('Aqui se acaba tu aventura.')
          input('Enter para salir... ')
          jugando = False
          end_game = True
      
        os.system('clear')

  if NUMBRES_OF_TRAINERS == 0:
    end_game = True
    os.system('clear')
    print('=' * len(titulo))
    print(titulo)
    print('=' * len(titulo))
    print()
    print('+' + '-' * MAP_WIDTH * 2 + '+')

    print()
    print('Felicidades, has derrotado a todos los entrenadores')
    print('Has ganado el juego!\n')

