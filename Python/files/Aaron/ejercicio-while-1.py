seguir = "si"
total = 0
cantidad_obj= 0

while seguir == "si":
    precio = float(input("precio: "))
    cant = int(input("Cantidad: "))
    cantidad_obj += cant 
    total += (cant * precio)
    seguir = input('¿Quieres seguir comprando? (si/no): ')

print(f"Precio total: {total}")
print(f"cantidad total: {cantidad_obj}")

