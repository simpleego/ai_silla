# if 문 : True 처리, if ~ esle: True,False 처리, if ~elseif .... else : 다중조건
exam = int(input('성적입력 : '))

# 성적을 4개의 등급으로 표시
# A: 90이상, B:80이상  C:70이상, 그외의 점수는 F

grade = ''

if exam >= 90:
    grade = 'A'
elif exam >= 80:
    grade = 'B'
elif exam >= 70:
    grade = 'C'
else:
    grade = 'F'

print(exam, ' 등급: ', grade)







    
