# if 문 : True 처리, if ~ esle: True,False 처리, if ~elseif .... else : 다중조건
exam = int(input('성적입력 : '))

# 성적을 4개의 등급으로 표시
# A: 90이상, B:80이상  C:70이상, 그외의 점수는 F

grade = ''

if exam >= 90:
    grade = 'A'

if exam < 90 and exam >= 80:    
    grade = 'B'

if exam < 80 and exam >= 70:
    grade = 'C'

if exam < 70:
    grade = 'F'

print(exam, ' 등급: ', grade)

result = "합격" if exam >= 60 else "불합격"

print(result)







    
