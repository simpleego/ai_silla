def say():
    return '안녕하세요.'

def say2(day):
    if day == 1:
        print( '아침인사')
    if day == 2:
        print('저녁인사')

def showMenu():
    print('1. 커피')
    print('2. 모카커피')
    print('3. 라떼커피')

print(say())
print(showMenu())

print(say2(1))
