import re

p = re.compile('(ABC)+')
m = p.search('ABCABCABC OK?')
# m = p.match('ABCABCABC OK?')
print(m)


p = re.compile(r"(\w+)\s+(\d+[-]\d+[-]\d+)")
m = p.search("park 010-1234-1234")
print(m.group(2))
print(m.group(1))
print(m.group(0))

p = re.compile('(blue|white|red)')
print(p.sub('colour', 'blue socks and red shoes  white'))

p = re.compile(r"(?P<name>\w+)\s+(?P<phone>(\d+)[-]\d+[-]\d+)")
print(p.sub("\g<name> \g<phone>", "park 010-1234-1234"))

#010-1234-1234 park



