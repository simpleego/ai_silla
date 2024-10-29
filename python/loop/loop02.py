# 홀수 짝수 출력 
# 1~10까지의 홀수/짝수 출력

num=0

while True:
    num += 1
    # print(num, end=' ')

    # 짝수인지 비교
    if num % 2 == 0:
        print(num, end=',')

    # 프로그램 종료
    if num >= 10:
        break

print('프로그램 종료')