lista_compra = []
comprando = True

while comprando:
  print(f"\n{'*' * 15} LISTA DE LA COMPRA {'*' * 15}\n")

  print("\t\tMenú de opciones:\n")
  print("\t\t1. Añadir producto")
  print("\t\t2. Eliminar producto")
  print("\t\t3. Mostrar lista.")
  print("\t\t4. Salir\n")

  opcion = int(input("Dime el número de la opcion que deseas llevar a cabo: "))

  if opcion == 1:
    print(f"\n{'*' * 17} Añadir producto {'*' * 17}\n")
    producto_añadir = input("Dime el nombre del producto a añadir: ")
    if producto_añadir in lista_compra:
      print("Ese producto ya está en la lista de compras.")
    else:
      lista_compra.append(producto_añadir)
      print(f"Listo, se ha añadido {producto_añadir} a la lista de la compra.")

  elif opcion == 2:
    print(f"\n{'*' * 17 }Eliminar producto{'*' * 17}\n")
    producto_eliminar = input("Dime el nombre del producto a eliminar: ")
    if producto_eliminar not in lista_compra:
      print("Ese producto no está en la lista de la compra.")
    else:
      lista_compra.remove(producto_eliminar)
      print(f"Se ha eliminado {producto_eliminar} de la lista de la compra.")

  elif opcion == 3:
    print(f"\n{'*' * 18 } Mostrar lista {'*' * 18}\n")
    print("Esta es la lista de la compra que tienes actualmente: \n")
    print(lista_compra)

  elif opcion == 4:
    print(f"\n{'*' * 22} Salir {'*' * 22}\n")
    print("Ok, decidiste salir del programa. ")
    comprando = False

  else:
    print("Opcion incorrecta")

print("Hasta luego.\n")