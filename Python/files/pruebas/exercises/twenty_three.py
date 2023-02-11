
from importlib.util import find_spec


def mayusculas(string:str) -> str:
  final_str = ''
  string = string.split()

  for i in string:
    final_str += i.capitalize() + ' '

  return final_str

print(mayusculas('carlos arturo hernandez vazquez'))