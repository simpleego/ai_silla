class FourCal:
    def setdata(self, first, second):
         self.first = first
         self.second = second

    def setdata2(self, first, second, third):
         self.first = first
         self.second = second
         self.third = third

    def add(self):
         result = self.first + self.second
         return result

calc1 = FourCal()
print(calc1)

calc1.setdata2(10,20,40)
print(calc1.first)
print(calc1.second)
print(calc1.third)

sum = calc1.add()
print(sum)


