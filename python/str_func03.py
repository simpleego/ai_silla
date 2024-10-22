a = "hobby"
num = a.count('b')
print(num)
num = a.count('o')
print(num)
num = a.count('x')
print(num)

# 문자열 검색 find
#      0123456789012345678901234
str = "Python is the best choice"
pos = str.find('b')
print('b:',pos)

pos = str.find('t')
print('t:',pos)

pos = str.find('x')
print('x:',pos)

a = "Life is too short"
index = a.index('t')
print('t:', index)

# index = a.index('x')
# print('x:', index)

# 문자열 삽입
print(",".join('abcd'))

sep='/'
str1 = "student"
print(sep.join(str1))

sep='-'
year = ["1900","09","25"]
year_ = sep.join(year)
print(year_,':',len(year_))

# 문자열 빈 공백 제거
str1 = "  strip  "
print(str1)
str2 = str1.lstrip()
print(str2)


#

