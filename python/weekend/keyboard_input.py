# 데이터 입력 처리
num1 = input("숫자를 입력하세요 :")
num2 = input("숫자를 입력하세요 :")
num1 = int(num1)
num2 = int(num2)

# 처리할 내용
tot = num1 + num2
print(tot)
avg = tot / 2

# 출력화면 
print('숫자1:',num1, end=",")
print('숫자2:',num2)
print('합: ',tot)
print('평균: %.2f' % avg)