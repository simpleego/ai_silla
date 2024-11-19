# attrgetter1.py
from operator import attrgetter

class Student:
    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade

students = [
    Student('jane', 22, 'A'),
    Student('dave', 32, 'B'),
    Student('sally', 17, 'B'),
]

print(students[0])

std1 = Student('jane', 22, 'A')

print(std1.age)

result = sorted(students, key=attrgetter('age'))
for i in result:
    print(i.name, i.age, i.grade)
