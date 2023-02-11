def point(data) -> bool:
    return type(data) == float

print(point('ABCDEFGHIJKLIMNOQRSTUVWXYZ'))
print(point(4))
print(point(4.5))