# 1) 함수정의
# def 함수명(매개변수):
#     내용

# 2) 함수호출
# 함수명(매개변수)
#함수는 정의후 사용해야한다.
def f1(name):
    print('hi~'+name)
# f1('kim')
# print(f1('lee'))

def f2(name):
    return 'hi~'+name
# print(f2("LEE"))

def f3(n):
    y1=n*2
    y2=n*20
    y3=n*30
    return y1,y2,y3
# a,b,c=10,20,30
r1,r2,r3=f3(7)
# print(r1,r2,r3)
q1=f3(70) # 튜플 반환
# print(q1)
# print(list(q1)) # list로 형변환

def f4(n):
    y1=n*2
    y2=n*20
    y3=n*30
    return [y1,y2,y3]
e1=f4(8)
# print(e1)
w1,w2,w3=f4(8)
# print(w1,w2,w3)

def f5(n):
    y1=n*2
    y2=n*20
    y3=n*30
    return {'r1':y1,'r2':y2,'r3':y3}
s1=f5(8)
print(s1)
print(s1.keys())
print(s1.values())
print(s1.items())

def f6(x,y):
    print("f6실행중")
    print(x,y)
# f6(3,4,3) 매개변수다르면 오류
f6(3,4)

def f7(x=1,y=2,z=3):
    print(x,y,z)
f7()
f7(10,20,30)
f7(11,22,33)

# def f8(x=1,y=2,z): 오류
#     print(x,y,z)
def f9(x,y,z=3):
    print(x,y,z)

# f9(1,2,5)   # 매개변수에 2개를 입력하든 3개를 입력해야지 안그러면 오류.

#가변인수 *,**

def f10(*args):
    print(args)
    print(type(args))
    hap=0
    for i in args:
        hap=hap+i
    print('hap=',hap)

f10()
f10(1,2,3)
f10(1,2,3,4,5)
# f10('one') # 숫자와 문자의 합은 오류

def f11(**args):        # 딕션어리로 매개변수 받을 경우
    print(args)
    print(type(args))

# f11('a','b','c')
f11(name='kim',addr='pusan',age=10)





