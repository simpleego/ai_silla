print("%10s" % "hi")
print("%-10ssjane" % "hi")
print("%.2f" % 3.146592)
print("%5d" % 3.146592)
print("%5d , %d" % (3.146592,45))
print("%c" % "h")

# format 함수
print("i eat {0} apples".format(3))
print("i eat {0} apples".format(3.1415))
print("i eat {0} apples".format("three"))
print("i eat {0} apples {1}".format("three",30))
print("i eat {1} apples {0}".format("three",30))
number=9
day=31
print("i eat {0} apples {1}".format(number,day))
print("i eat {number} apples {day}".format(number=19,day=32))
print("i eat {0} apples {day}".format(number,day=32))

number=3.141592
num=10
print("{0} {1:^10} eat{1:<7.3f} apples {day}".format("i",num, number,day=32))
# 정렬 및 empty placeholder
print("{:>5} am {:^20}, {:<6.1f}".format("i","python", 123.45678))