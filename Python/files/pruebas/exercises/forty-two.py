import random
def random_num(num_one: int, num_two: int) -> int:
  return random.randint(num_one, num_two)

print(random_num(1,100))