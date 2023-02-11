

def word_reverse(word:str):

  
  #return word[::-1]


  new_word_list = list(word)
  new_word_str = ''

  for i in range(len(word)):
    j = i + 1
    new_word_str += new_word_list[-j]

  return new_word_str

print(word_reverse('carlos'))