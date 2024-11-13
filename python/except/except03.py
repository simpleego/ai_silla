# many_error.py
try:
    a = [1,2]
    print(a[0])
    c=4/4
except ZeroDivisionError:
    print("0으로 나눌 수 없습니다.")
except IndexError:
    print("인덱싱 할 수 없습니다.")
finally:
    print('여기는 무조건 수행합니다.')

print('프로그램 종료..')
