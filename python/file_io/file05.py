# write_data.py
f = open("addr_book.txt", 'r')
line = f.readline()
f.close()


name = line.split(',')[0]
addr = line.split(',')[1]
tel = line.split(',')[2]

print(name,addr,tel)

# 전화번호 수정
tel = "010-2533-0129"

# 파일을 쓰기로 설정
f1 = open("addr_book.txt", 'w')
f1.write(name)
f1.write(addr)
f1.write(tel)
f1.close()