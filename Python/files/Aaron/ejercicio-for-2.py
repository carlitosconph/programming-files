a = int(input("numero a: "))
b = int(input("numero b: "))

empieza = a

if a % 2 != 0:
    empieza = a + 1

for i in range(empieza, b+1, 2):
    print(i)

