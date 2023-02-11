cal = int(input("Ingresa la calificaion: "))
if cal > 100:
    print("S")
elif cal >= 90 and cal <= 100:
    print("A")
elif cal >= 80 and cal <= 89:
    print("B")
elif cal >= 70 and cal <= 79:
    print("C")
else:
    print("F")
