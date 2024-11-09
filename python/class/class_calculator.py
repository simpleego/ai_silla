# class calculator

class Calculator:

    def __init__(self):
        self.result = 0
        print('init~~')


    def __init__(self, num):
        self.result = num
        print('init~~')
    
    
    def add(self, num):
        self.result += num
        return self.result
    
    def sub(self,num):
        self.result -= num
        return self.result
    
    def mul(self,num):
        self.result *= num
        return self.result
    
    def div(self,num):
        if num != 0:
            self.result /= num
        else:
            return 0
        return self.result
    

calc1 = Calculator(10)
#calc1 = Calculator()
print(calc1.add(3))
print(calc1.add(5))
print(calc1.sub(5))
