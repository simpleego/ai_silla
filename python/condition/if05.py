# if 문 : True 처리, if ~ esle: True,False 처리, if ~elseif .... else : 다중조건
exam = int(input('성적입력 : '))

# 처리기준 : 60점이상 합격
#           60점미만 불합격

#exam_result = "불합격"89

diff = exam - 60
exam_fail ="X"
exam_success ="보통"

if exam >= 60:
    exam_result = "합격"
    if exam >= 90:
        exam_success = "우수"
    # diff = exam - 60
else:
    exam_result = "불합격"
    if exam < 40:
        exam_fail ="O"
    if exam >= 40:
        exam_success="미흡"

    # diff = exam - 60

print(exam,'이고,',exam_result, diff, 
      '평점:', exam_success, '과락:',exam_fail)




    
