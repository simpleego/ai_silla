# 함수를 이용한 사칙연산 기능 구현

# 덧셈기능 함수
def adder(a,b):
    sum = a + b
    return sum

def sub(a,b):
    return a-b

def mul(a,b):
    return a*b

def div(a,b):
    if b == 0:
        return 0
    return a/b

sum = adder(10,20)
print(sum)
print(adder(30,40))
print(sub(30,40))
print(mul(30,40))
print(div(30,40))

print(adder('a','b'))
print(div(10,0))

