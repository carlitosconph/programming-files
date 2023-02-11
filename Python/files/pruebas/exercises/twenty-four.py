
#todo hacer que detecte cuando hay elemtos duplicados

def permutacion(array:list, num:int) -> bool:
  

  for i in range (1, num + 1):
    
    if i not in array:

      return False
  
  return True
      
  


print(permutacion([1,2,3,4,5],5)) #! true
print(permutacion([1,2,3,5],5)) #! false
