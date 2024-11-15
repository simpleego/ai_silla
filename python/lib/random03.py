# itertools_zip.py
import itertools

students = ['한민서', '황지민', '이영철', '이광수', '김승민']
snacks = ['사탕', '초컬릿', '젤리']

result = itertools.zip_longest(students, snacks,fillvalue='새우')
print(list(result))

it = itertools.combinations(range(1, 46), 6)
for num in it:
    print(num)
