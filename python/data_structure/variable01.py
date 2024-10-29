from copy import copy

a=[1,2,3]

# 변수의 주소
print(id(a))

b = a  # a의 주소를 알려준다.
print('a:',a)
print('b:',b)
print(id(a))
print(id(b))

b.pop()
print(a)

c=[4,5,6]
#d=c[:]
d=copy(c)
print(d)
print(id(c))
print(id(d))

a, b = ('python', 'java')
a, b = 'python', 'java'
print(a)
print(b)

a=b='python'
print(a)
print(b)

a=10
b=20 
# swapping 교환
t = b
b = a
a = t
#값을 교환 
print(a)
print(b)

a,b = b,a
print(a)
print(b)




