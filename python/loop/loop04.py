# 홀수 짝수 출력 
# 1~10까지의 홀수/짝수 출력

num=0
even_list=[]

while True:
    num += 1
    # print(num, end=' ')

    # 짝수인지 비교
    if num % 2 != 0:
        continue
    else:
        print(num, end=' ')

    # 프로그램 종료
    if num >= 10:
        break

print()
# 리스트에 저장된 짝수 값을 출력
for i in even_list:
    print(i,end=' ')

print()
print('프로그램 종료')