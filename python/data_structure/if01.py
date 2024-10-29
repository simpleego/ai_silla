# 나이를 입력 받아서 20세 이상이면 성년
# 아니면 미성년을 출력하시오

birth = input('당신이 태어난 년도?')
age = 2024-int(birth)

result = '미성년'

if age >= 20:
    result = '성년'

print(result)


