



def cut(string:str, num:int) -> str:
  final_str = ''
  string = string.split()
  string = ''.join(string)

  for i in range(num):
    final_str += string[i]
  return final_str


print(cut('Carlos Arturo', 8))