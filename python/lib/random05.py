# itemgetter1.py
from operator import itemgetter

students = [
    ("jane", 22, 'A'),
    ("sally", 17, 'B'),
    ("dave", 72, 'B'),
    ("dave", 32, 'B'),
]

print(students[0][0])

result = sorted(students, key=itemgetter(2))
print(result)
