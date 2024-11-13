# try_finally.py
f = open('null.txt','w')
try:
    f = open('foo2.txt', 'r')
    # 무언가를 수행한다.
except FileNotFoundError as e:
    print(e)

# else:
#     original_lines = f.readlines() #파일 내용 기억해두기
#     print(*original_lines, sep='\n') #파일 내용 출력하기
#     f.close()

finally:
    f.close()  # 중간에 오류가 발생하더라도 무조건 실행된다.
    print('파일은 반드시 닫는다...')