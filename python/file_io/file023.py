# write_data.py
f = open("addr_book.txt", 'w')

name ="홍길동"
f.write(name)
addr = "부산시 사상구 백양로 111"
f.write(addr)
tel = "010-123-4567"
f.write(tel)

f.close()
