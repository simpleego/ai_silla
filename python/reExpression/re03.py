import re

p = re.compile('Crow|Servo')
m = p.match('CrowHello123Servo')
m = p.findall('CrowHello123Servo')
print(m)

print(re.search('^Life', 'Life is too short'))
print(re.search('^Life', 'My Life'))

print(re.search('short$', 'Life is too short'))

