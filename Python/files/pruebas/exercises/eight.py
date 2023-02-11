

def reverse_number(num:int):
  num_str = str(num)

  new_word_list = list(num_str)
  new_word_str = ''

  for i in range(len(num_str)):
    j = i + 1
    new_word_str += new_word_list[-j]

  return new_word_str


print(reverse_number(120))