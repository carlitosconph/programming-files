



def cuenta_letras(palabra:str)->dict[str,int]:
    diccionar = {}
    for letra in palabra:
        if diccionar.get(letra) == None:
            diccionar[letra] = 1
        else:
            diccionar[letra] = diccionar[letra] + 1
    return diccionar