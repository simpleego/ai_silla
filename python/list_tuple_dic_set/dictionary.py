dic = {
        'name': 'pey', 
       'phone': '010-9999-1234', 
       'birth': '1118',
       }
print(dic)
print(dic['name'])
print(dic['birth'])
key = 'phone'
print(dic[key])
#print(dic['xx'])
name=11
a={name:'홍길동'}
print(type(a))

# 딕셔너리 추가
a={1:'a'}
a[2] = 'b'
print(a)
a[3] = [1,2,3]
print(a)

del a[2]
print(a)

a={1:'a',1:'b'}
print(a)
b={(1,2):'hi'}
print(b[(1,2)])
# b={[1,2]:'hi'}
# print(b[[1,2]])

# key 추출
my_info = {
    'name': 'pey', 
    'phone': '010-9999-1234', 
    'birth': '1118'
    }
print(my_info.keys())

for k in my_info.keys():
    print(k)

for k in my_info.keys():
    print(k,': ',my_info[k])

for v in my_info.values():
    print(v)

for item in my_info.items():
    print(item[0],' : ',item[1])

#my_info.clear()
print(my_info)

# get()으로 값 얻기
print(my_info['name'])
print(my_info.get('name1'))

print('name' in my_info)


