import re
def inphase(phase:str, word:str):
  contador = 0

  phase_str = phase.lower()
  phase_split = re.split('[,\s]', phase_str)


  for i in phase_split:
    if word.lower() == i:
      contador += 1
  
  return f'la palabra -{word}- esta {contador} veces en la frase. '


print(inphase('Hola Carlos carlos que gusto','carlos'))
print(inphase('Hola Carlos, carlos que gusto','carlos'))