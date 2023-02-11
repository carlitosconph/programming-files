# palabra.lower()
palabra = "HOLA"
minusculas = palabra.lower()
#print(minusculas)

# palabra.strip()
palabra = "     hola !"
#print(palabra)
limpia = palabra.strip(" !")
#print(limpia)


# palabra.startswith("prefijo") = empieza con 
pagina = "www.carlos.com"
#print(pagina)
empieza = pagina.startswith("www")
#print(empieza)
empieza2 = pagina.startswith("wwww")
#print(empieza2)

# palabra.endswith("postfijo") = termina con
pagina = "www.carlos.com"
#print(pagina)
termina = pagina.endswith("com")
#print(termina)
termina2 = pagina.endswith("comppp")
#print(termina2)


# palabra.upper()
palabra = "hola"
mayusculas = palabra.upper()
#print(palabra)
#print(mayusculas)


# palabra.replace(viejo,nuevo)

oracion = "La persona llega hoy"
#print(oracion)
viejo = "llega"
nuevo = "se va"
corregido = oracion.replace(viejo, nuevo)
#print(corregido)

# palabra.isalpha()
numeros = "Decaminoa2568"
alfabeto = "Decaminoacasa"
comprobacion = alfabeto.isalpha()
#print(comprobacion)
comprobacion_num = numeros.isalpha()
#print(comprobacion_num)


# palabra.isdigit()
numeros = "2568"
alfabeto = "Decaminoacasa"
comprobacion = alfabeto.isdigit()
#print(comprobacion)
comprobacion_num = numeros.isdigit()
#print(comprobacion_num)

#Buscar palabras dentro de un str
# palabra.find("palabra a buscar")

palabra_buscar = "El gato toma leche"
ver_si = palabra_buscar.find("leche")
#print(ver_si)
#print(palabra_buscar[ver_si])
ver_si2 = palabra_buscar.find("lechita")
#print(ver_si2)


# in
existe = "Mi gatito es real"
saber = "gato" in existe
print(saber)
saber2 = "gatito" in existe
print(saber2)

#palabra.title() - > para que la primera letra de las palabras sean mayusculas
#! para saber si algo es alfanumerico
#* varible.isalnum()






