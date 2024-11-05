# readline_all.py
f = open("C:\Windows\windows.txt", 'r')
lines=0
while True:
    line = f.readline()
    lines += 1
    if not line: break
    print(line)

print('파일의 줄수 :', lines)
f.close()
