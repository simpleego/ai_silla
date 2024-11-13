a = 4
b = 0
c = 0
try:
    c = a/b
except ZeroDivisionError as e:
    print(e)
    c = -1

print(c)

c = a / b
print(c)