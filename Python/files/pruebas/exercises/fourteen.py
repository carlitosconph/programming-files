

def repeat_str(string:str, num:int) -> str:

  #! forma facil y rapida

  #return string * num


  #! forma facil pero menos rapida xd
  
  final_str = ''
  for i in range(num):
    final_str += string
  
  return final_str



print(repeat_str('Hola', 3))