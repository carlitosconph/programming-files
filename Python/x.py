
def palabras(sentence: str) -> dict:
    count_words = {}
    for char in sentence:
        if char in ':!?,.\n\t_-':
            sentence = sentence.replace(char, ' ')

    clean_sentence = sentence.lower()
    final_sentence =  []
    for word in clean_sentence.split():
        if word.count("'") and (word.index("'") != len(word) -2 and word.index("'") != len(word) -3):
            print([word])
            word = word.replace(word[word.index("'")], '')
            print(word)
        final_sentence.append(word)

    for word in final_sentence:
        if word != '': 
            count_words[word] = final_sentence.count(word)
    return count_words

print(palabras("can, can't, 'can't'"))