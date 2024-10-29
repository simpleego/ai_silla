# if 문 : True 처리, if ~ esle: True,False 처리, if ~elseif .... else : 다중조건
exam = int(input('성적입력 : '))

# 처리기준 : 60점이상 합격
#           60점미만 불합격

exam_result = "불합격"

if exam >= 60:
    exam_result = "합격"

print(exam_result)

# if exam < 60:
#     exam_result = "합격"


    
