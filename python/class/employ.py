class Employee:
   'Common base class for all employees'
   empCount = 0

   def __init__(self, name, salary):
      self.name = name
      self.salary = salary
      Employee.empCount += 1
   
   def displayCount(self):
     print("Total Employee %d" % Employee.empCount)

   def displayEmployee(self):
      print("Name : ", self.name,  ", Salary: ", self.salary)

e1 = Employee('홍길동',1000)
e2 = Employee('박지성',2000)
e3 = Employee('김현',3000)

e1.displayCount()
e2.displayCount()

e1.displayEmployee()
e2.displayEmployee()
