weight = 90

while weight > 70:
    today_weight = input('오늘 몸무게 ?')
    weight = int(today_weight)
    print('다이어트 중....')

print('다이어트 성공')
print('현재체중',weight)
print('체중감량',90-weight)
