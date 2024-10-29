#s1 = set([1,2,3])
#print(s1)
s1 = set([1,2,3,3,3,4,4,1,2,3])
print(s1)

s2 = set("Hello")
print(s2)

l1 = list(s2)
print(l1[0:3])

# 교집합, 합집합, 차집합
s1 = set([1, 2, 3, 4, 5, 6])
s2 = set([4, 5, 6, 7, 8, 9])

intersection = s1 & s2
print(intersection)

union = s1 | s2
print(union)

difference = s1 - s2
print(difference)

set1 = set([1,2,3])
set1.add(4)
print(set1)

set1.update([1,6,7,8])
print(set1)

set1.remove(3)
print(set1)

set1.remove(7)
print(set1)






