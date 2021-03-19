# https://wikidocs.net/book/1
# 파이썬의 모든 것은 객체
# 변수 앞에 아무것도 없음
# 문자의 끝에 ; 없음.
# 따옴표 '',""
# 문장의 세로줄을 맞추어야 한다. 들여쓰기 안됨..;
# 주석은 #
# 실행 ctrl + shift + f10
# 실행할때마다 자동 저장됨.
# 도움말 ctrl + click
# a=3
# print(a)
# a='machinlearnning'
# print(a)
# a=3.1
# print(a)
# a=True #대문자로 써야함.
# print("a의 값은 = ",a,"그럼 이만") # *args 는 갯수의 제한이 없음.
# print("a의 값은 = ",a,"그럼 이만",sep='*')# sep=' ' 자동으로 띄어쓰기인데 변경시 )
# print("a의 값은 = ",a,"그럼 이만",sep='*',end='') #자동 줄 바꿈 실행하지 않으려면 end=''
# print("새로운 줄")
# print('!'*30)
# a=30
# b=5
# print(a,b)
# print(type(a))
# a='machine'
# print(type(a))

# 형변환
# print("b의 값은 "+str(b))  #str로 데이터타입 변경
#
# a=7
# b=10
# print(a,b)
# temp=a
# a=b
# b=temp
# print(a,b)

# a,b=b,a         # 자바보다 편하게 값 변경이 가능.
# print(a,b)
#
# a,b,c,d=3,0,True,'5'
# print(a,b,c,d)
# print(type(a),type(b),type(c),type(d))
# print(bool(a))
# print(bool(b))  # 참거짓으로 나타낼때 0은 false 나머지는 true
# d=int(d)
# print(type(d))
# print(a,d)
#
# print("연산자")
# print("a+b=",a+d)
# print("a-b=",a-d)
# print("a*b=",a*d)
# print("a/b=",a/d)
# print("a//b=",a//d) # 몫
# print("a%b=",a%d)   #나머지
# print("a**b=",a**d) # 제곱 a(3)의 b(5)제곱 3*3*3*3*3
#
# print("\n")
# print("사칙연산")
# print(a>d)
# print(a<d)
# print(a==d)
# print(a!=d)
#
# print("\n")
# print("참과 거짓")
# age=21
# b1=age<10
# b2=age>20
# print(b1,b2)
# print(10<=age<=30)

# 문자열: '..',"..",'''...''',"""..."""
# a='문자열 표현방"법 @123!' # 큰,작은 따옴표는 구분이 됨
# print(a)
# a='문자열 표현방\'법 @123!'  # \써서 따옴표 활용가능.
# print(a)
#
# a='''프로그래밍 언어를 좋은 언어와 나쁜 언어로 구별할 수 있을까?
# 사실 현실에서 이런 구별은 무의미하다. 어떤 언어든지 강점과 약점이 존재하기 때문이다.
# 그러므로 어떤 프로그래밍 언어가 어떤 일에 효율적인지를 안다는 것''' #긴 문자열 작성하고 싶을땐''' """ 둘중하나
# print(a)
#
# a="python"
# b="machine"
# print(a+b)  # 문자열 합
# print(a*5)  # 해당문자 반복

# 문자열 인덱싱 : 문자열 중에서 특정 데이터를 획득 ||
# 문법 [인덱스] | [시작인덱스:끝인덱스] -> 시작인덱스<=X<끝인덱스 (끝인덱스는 포함되지 않는다)
# a='0123456789'
# print(a)
# print(a[3]) # java랑 똑같이 0 부터 시작.
# print(a[-3]) # 끝에서는 -로 특정위치 획득
# print(a[0:-3]) # 시작인덱스<=X<끝인덱스
# print(a[0:7]) # 위와 동일
# print(a[:7]) # 생략하면 처음 인덱스
# print(a[3:]) # 생략하면 끝부터
# print(a[:]) # 전부 다 가져와라

# 문자열 슬래싱
# a="pithon" #일부로 오타냄.
# a[1]="y" # 문자열은 그 요소값 변경안됨.
# print(a[0:1]+'y'+a[2:])

# 포멧팅 (많이 쓰임)
a=10
b=20
c="green"
print(a,b,c)
# %s 문자열 %d 문자 %f 실수 %o 8진수 %x 16진수 %% % 표시 python version 2때 사용하는 것.
# print("%d+%d = %d"%(a,b,c)) # 에러
# print("%s+%s = %s"%(a,b,c)) # python3부터는 그냥 s써도 다 호환됨.
print("{}+{}={}".format(a,b,c))  # python version 3 때 사용하는 방식.
a="987654356789123"
print(a.count("5")) #문자열에서 갯수 출력
print(a.count("0"))
print(a.find("5")) #문자열에서 5의 위치를 찾아라. 여러개있으면 첫번째 위치가 표시됨.
print(a.find("0")) #문자열에서 0의 위치를 찾아라. 없으면 -1
# print(a.index("5"))
# print(a.index("0")) #find랑 똑같은데 find는 없으면 -1 index는 컴파일 에러.























