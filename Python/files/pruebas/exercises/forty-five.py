
def aprobados_reprobados(array: list[list[str,int]]) -> str:
  final_list = [student for student in array if student[1] >= 6]
  return f'Aprobados: {len(final_list)} \nReprobados: {len(array) - len(final_list)}'

print(aprobados_reprobados([['Victor', 10], ['carlos', 10], ['Monica', 6], ['pepe', 2]]))