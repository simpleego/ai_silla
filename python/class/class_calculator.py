# class calculator

class Calculator:
    result=0

    def add(self, num):
        self.result += num
        return self.result

calc1 = Calculator()
print(calc1.add(3))
print(calc1.add(5))

calc2 = Calculator()
a = calc2.add(9)
b = calc2.add(5)
print(a)
print(b)