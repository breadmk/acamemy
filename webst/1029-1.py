a=[1,5,3,1,2,3,4,5]
print(a)
print(len(a))       #a전체 세기
print(a.count(5))   #갯수세기
a.append('seven')   #삽입
print(a)
a.append([1,2,3,'four'])   #a.append(값) / 맨뒤에 들어감.
print(a)
a.insert(3,'*') #a.insert(인덱스,값)
print(a)
print(a[9])
a[3]='!'        #값을 변경
print(a)
a.remove(5)     #리스트의 처음나타나는 5 삭제.
print(a)
a.remove(5)
print(a)
del a[:3]   #a 리스트의 처음부터 인덱스0번째부터 2번째까지 삭제.
print(a)
del a # 객체 삭제
a=[1,2,3,4,5,6,7,8,9]
b=["zero","one","two","three","four","five"]
# for 변수 in 반복가능객체:
#     내용

for i in a:         #i=1,2,...
    print(i)
    print('*')      #들여쓰기가 끝나면 break;

for i in b:
    print(i)

for i in range(6):  #i=0,1,2,3,4,5 (6|미포함)
    print(i,b[i])   #b의 인덱스 순서대로 출력

for i in range(len(b)):
    print(b[i])

for i in range(5): #종료값, 시작값생략시 0, 증감 생략시 1
    print(i)


for i in range(1,101):
    print(i,end=' ')    #가로로 출력
print()

for i in range(3,1000,3):
    print(i, end=' ')

for i in range(101):
    print(i)

#컴프리핸션
a=[i for i in range(101)]
print(a)

a=[i for i in range(1,10)]
print(a)

# b=[7,7,7,7,...] 100개

for i in range(100):
    print(7)

b=[7 for i in range(100)]
print(b)
print(len(b))

c=[]
for i in range(100):
    c.append(7)
print(c)

print('-'*50)
# c=[1,3,5,7,9,...99]
# b=["good","good",...] 5개

c=[i for i in range(1,100,2)]
b=["good" for _ in range(5)]   #
# i가 사용이 안 될 경우는 _ 그어도 됌.
print(c)
print(b)
e=["good"+str(i) for i in range(1,6)]   #타입변환해줘야함.
print(e)


# range(시작,종료(<),증감)
# print(list(range(1,10,2)))
# print(tuple(range(1,10,2)))     #괄호를 동그랗게 변경;;

# c="3"
# print(type(c))
# print(int(c),type(int(c)))  # 타입변환을 위에 적용해서 list로 변환해서 출력

















