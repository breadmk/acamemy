people={"name":"둘리","age":"1억살","addr":"쌍문동"}
print(people)
print(type(people))
print(people["age"])

people["성격"]="yes" #추가
print(people)

del people["age"]   #삭제
print(people)

people["성격"]="no"
print(people)

for i in people:        #키만 출력
    print(i)

for i in people.items():    #키랑 값 출력 (튜플로 전환)
    print(i)

for i,v in people.items():  # 그냥 출력
    print(i,v)

print(people.keys())
print(people.values())
people.clear()      #완전 삭제
print(people)

print("="*50)


#집합
# set {}

a={2,5,3,5,8,2}    #중복제거
print(a)
print(type(a))

b=[1,2,5,1,3,1,3,2,1,5,3,2,4,5,1,2,3]
print(b)
print(set(b))       # 중복값 제거하는 편한 방법.
a.add(11)           # 집합의 추가
print(a)
a.update([13,5,17]) # 추가
print(a)
a.remove(2)     # 제거
print(a)

# 정규 표현식

# ? : 0번 또는 1차례까지의 발생 의미. 이를테면 colou?r는 "color"와 "colour"를 둘 다 일치시킨다.
# *	: 0번 이상의 발생 의미 이를테면 ab*c는 "ac", "abc", "abbc", "abbbc" 등을 일치시킨다.
# + : 1번 이상의 발생을 의미한다. 이를테면 ab+c는 "abc", "abbc", "abbbc" 등을 일치시키지만 "ac"는 일치시키지 않는다.
# {n} :	정확히 n 번만큼 일치시킨다.
# {min,} :	"min"번 이상만큼 일치시킨다.
# {min,max} : 적어도 "min"번만큼 일치시키지만 "max"번을 초과하여 일치시키지는 않는다.
# | : 선택의 의미
# [] : [a-zA-Z]
# . : 글자1개, 줄바꿈 제외
# \s : 공백의 의미

a="""3412    Bob 123
3834  Jonny 333
1248   Kate 634
1423   Tony 567
2567  Peter 435
3567  Alice 535
1548  Kerry 534"""

print(a)
import re   # 정규식 사용 하겠다.
# re.findall (r"정규식",문자열)
# 숫자만 찾겠다.
r1 = re.findall(r"[0-9]",a)
print(r1)
r1 = re.findall(r"[0-9]+",a)
print(r1)
r1 = re.findall(r"[A-Za-z]",a)
print(r1)
r1 = re.findall(r"[A-Za-z]+",a)
print(r1)
r1 = re.findall(r"[A-SU-Z][a-z]+",a)
print(r1)


