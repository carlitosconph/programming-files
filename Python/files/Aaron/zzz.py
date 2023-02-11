""" print(f"{'#' * 10} MODULO PARA VALIDACION DE NOMBRE {'#' * 10}\n")
print("Recuerda que debe tener las siguientes caracterisiticas: ")
print("\t -El nombre de usuario debe tener un minimo de 6 caracteres y un maximo de 12. ")
print("\t -El nombre de usuario debe ser alfanumerico")
username = input("Dime tu nombre de usuario: ")

    
if len(username) < 6:
    print("El nombre de usuario debe contener al menos 6 carecteres.")
elif len(username) > 12:
    print("El nombre de usuario debe contener con maximo 12 caracteres.")
elif len(username) >= 6 and len(username) <= 12:
    if username.isalnum():
        print("El nombre de usuario es valido")
    else:    
        print("El nombre de usuario debe ser alfanumerico, es decir, debe contener solo numeros y letras.")
             """
         


print(f"{'#' * 10} MODULO PARA VALIDACION DE CONTRASEÑA {'#' * 10}\n")
print("Recuerda que debe tener las siguientes caracterisiticas: ")
print("\t -La contraseña debe tener un minimo de 8 caracteres. ")
print("\t -La contraseña debe contener letras minusculas, mayusculas, numeros y al menos 1 caracter no alfanumerico.")
print("\t -La contraseña no puede contener espacios en blanco")
password = input("Dime tu contraseña: ")

espacios = []
    
if len(password) < 8:
    print("La cotraseña debe contener al menos 8 carecteres.")
else:
    any()
    