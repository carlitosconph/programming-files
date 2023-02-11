a = int(input("Lado A: "))
b = int(input("Lado B: "))
c = int(input("Lado C: "))

if a == b and a == c:
    print("Es un triangulo equilatero.")
elif a == b and a != c:
    print("Es un triangulo isoceles.")
else:
    print("Es un triangulo escaleno.")

