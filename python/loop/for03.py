jumsu = [90,25,67,45,80,99,93]
# 90점 이상의 인원 수 출력

tot = 0
avg = 0.0
count_90 = 0

for i in jumsu:
    tot += i

    if i >= 90:
        count_90 += 1

    # print(i, end=' ')

avg = tot / len(jumsu)

print(','.join(map(str,jumsu)))

print('\n 총점 :', tot)
print('\n 평균 : %.2f' % avg)
print('\n 90점 이상 인원 수 : %d' % count_90)



