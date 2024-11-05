# write_data.py
f = open("addr_book.txt", 'r')
line = f.readline()

name = line.split(',')[0]
addr = line.split(',')[1]
tel = line.split(',')[2]

print(name,addr,tel)
# name ="홍길동,"
# f.write(name)
# addr = "부산시 사상구 백양로 111,"
# f.write(addr)
# tel = "010-123-4567"
# f.write(tel)

f.close()