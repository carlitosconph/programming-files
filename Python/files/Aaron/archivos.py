# open(): Siempre cerra el archivo al final

# archivo = open(nombre_del_archivo)
# archivo = open(nombre_del_archivo, modo)


# 4 modos de archivos
# r : solo quiero leer el archivo
#  - : si no existe el archivo, marca error
# w : cuando quiero escribir. si ya existe un archivo, lo borra y sobreescribe
# - : si no existe, lo crea
# a:cuando lo quiero abrir y agregar texto al final
# -: si no existe lo crea
# r+: para leer y escribir, no borra ni sobreescribe el exsistente
# - : si no existe, marca error


#escribir archivo

#metodo 
# write(texto):


""" archivo = open("pruebaaaa.txt", "w")
archivo.write("Hola, esta es la linea 0\n")
archivo.write("Hola, esta es la linea 1\n")
archivo.write("Hola, esta es la linea 2\n")
archivo.close()   #* Siempre cerrar el archivo """

#! lectura de archivos
#metodos de lectura :
# - read(): lee todo el archivo de gole (peligroso)
# - readline(): lee el archivo de linea en linea. se llega a la ultima linea cunado hay espacio vacio
# -in: itera linea por linea el archivo

#enter : \n, todas las lineas de un archivo tienen un enter al final

#red()
""" archivo = open("pruebaaaa.txt", "r")
todo = archivo.read()
print(todo)
archivo.close """

#readline()
""" archivo = open("pruebaaaa.txt", "r")
linea1 = archivo.readline()
linea2 = archivo.readline()
linea3 = archivo.readline()
print(linea1, end="")
print(linea2, end="")
print(linea3, end="")
archivo.close """

#in

archivo = open("pruebaaaa.txt", "r")
for linea in archivo:
    print(linea, end="")
archivo.close

#with
# escritura
with open("pruebaaaa.txt", "w") as archivo:
    archivo.write("linea0\n")

#lectura
with open("pruebaaaa.txt", "r") as archivo:
    for line in archivo:
        print(line, end="")

