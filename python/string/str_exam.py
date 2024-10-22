# 주민번호에서 나이 계산하기
jumin="020625-4403619"
year = jumin[0:2]
this_year = 2024
year_ = 2000
year = int(year) + year_
age = this_year - year
print('태어난 년도 : ', year)
print('나이: ',age)