# vartest.py
a = 10

def vartest(b):
    global a
    a = b + 1
    print('in function:',a)

vartest(a)
print('in program: ',a)

sub = lambda a, b: a-b
result = sub(3, 4)
print(result)

for i in range(1,10):        # 1번 for문
     for j in range(2, 10):   # 2번 for문
         print("{0:<2}x{1:>2} ={2:3}".format(j,i,i*j), end="  |  ") 
     print('') 
