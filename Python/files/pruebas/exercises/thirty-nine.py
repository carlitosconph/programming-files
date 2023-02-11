import re

def email_valid(email: str) -> bool:
  regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
  return True if (re.fullmatch(regex,email)) else False

print(email_valid('carlos256800@gmail.com'))