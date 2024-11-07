# 입출력 데이터 준비
# 입력 : 이름,학과코드,국어,영어,수학
# 출력 : 입력정보, 총점, 평균, 학점
# 입력변수 : name, code

# 처리과정 
# - 총점 : tot = kor+eng+mat
# - 평균 : avg = tot / 3
# - 학점 : grade : A~F 등급

# 성적을 저장할 자료구조 결정
#  리스트가 딕셔너리를 n개 저장
sungjuk = []


# 데이터 입력 
def input_data():

    global sungjuk

    # 딕셔너리 준비
    data={}

    name = input('이름 :')
    code = input('학번(입학년도(4), 학과코드(2), 순번(2)) :')
    kor = int(input('국어점수 :'))
    eng = int(input('영어점수 :'))
    mat = int(input('수학점수 :'))
    
    # 딕셔너리도 변환
    data['name'] = name
    data['code'] = code
    data['kor'] = kor
    data['eng'] = eng
    data['mat'] = mat

    sungjuk.append(data)
    

def show_sungjuk():
    global sungjuk
    
    # print(sungjuk)

    for i in range(len(sungjuk)):
        print('이름 : ', sungjuk[i]['name'], end=' ' )
        print('학번 : ', sungjuk[i]['code'], end=' ' )
        print('국어 : ', sungjuk[i]['kor'], end=' ' )
        print('영어 : ', sungjuk[i]['eng'], end=' ' )
        print('수학 : ', sungjuk[i]['mat'], end=' ' )

        if len(sungjuk[i]) > 5:
            print('총점 : ', sungjuk[i]['tot'], end=' ' )
            print('평균 : ', sungjuk[i]['avg'], end=' ' )
            print('학점 : ', sungjuk[i]['grade'] )
        else:
            print('')

def sunjuk_process():
    global sungjuk

    for i in range(len(sungjuk)):
        kor = sungjuk[i]['kor']
        eng = sungjuk[i]['eng']
        mat = sungjuk[i]['mat']

        tot = sungjuk_tot(kor,eng,mat) 
        avg = sungjuk_avg(tot) 
        grade = sungjuk_grade(avg)

        sungjuk[i]['tot'] = tot
        sungjuk[i]['avg'] = avg
        sungjuk[i]['grade'] = grade

    print(sungjuk)

def sungjuk_tot(kor,eng,mat):
    return kor+eng+mat

def sungjuk_avg(tot):
    return tot/ 3

def sungjuk_grade(avg):
    if avg >= 90:
        grade = 'A'
    elif avg >= 80:
        grade = 'B'
    elif avg >= 70:
        grade = 'C'
    elif avg >= 60:
        grade = 'D'
    else:
        grade = 'F'

    return grade

# 프로그램 메인
list1 = [
            {'name': '홍길동', 'code': '2020', 'kor': 20, 'eng': 80, 'mat': 90, 'tot': 190, 'avg': 63.333333333333336, 'grade': 'D'},
            {'name': '박지성', 'code': '2021', 'kor': 80, 'eng': 90, 'mat': 90, 'tot': 260, 'avg': 86.66666666666667, 'grade': 'B'}
        ]

if list1[1]['code'] == '2021':
    print(list1[1]['name'])
    print('있어요')

exit()    

while True:
    print('데이터 입력 : 1 ')
    print('데이터 조회 : 2 ')
    print('데이터 처리 : 3 ')
    print('프로그램 종료 : 4  ')

    menu = input('메뉴선택 : ')
    match menu:
        case '1':
            input_data()
        case '2':
            show_sungjuk()
        case '3':
            sunjuk_process()
        case '4':
            break
        case default:
            print('메뉴 선택 에러~~')
        