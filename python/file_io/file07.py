# readline_all.py
f = open("C:\Windows\windows.txt", 'r')
lines = f.readlines()
print(lines)

for line in lines:
    print(line)

f.close()