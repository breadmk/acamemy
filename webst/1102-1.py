# n=int(input("숫자(1-4)"))
# if n==1:
#     print("안녕")
# elif n==2:
#     print("안녕")
#     print("안녕")
# elif n==3:
#     print("안녕")
#     print("안녕")
#     print("안녕")
# else:
#     print("안녕")
#     print("안녕")
#     print("안녕")
#     print("안녕")

# a=["안녕","안녕",..."안녕"]

# n=int(input("숫자="))
# a=[]
# for i in range(n):
#     a.append("안녕")
# print(a)

# n=int(input("숫자="))
# a=["안녕" for i in range(n)]
# print(a)
#
# b=[]
# 1~20홀수중 3의 배수인것만 b에 넣으세요
# for i in range(1,21,2):
#     if i%3==0:
#         b.append(i)
# print(b)

# -------->컴프리핸션 : 컬렉션을 만드는 한줄짜리 반복문
# b=[i for i in range(1,100,2) if i%3==0]
# print(b)


# --------> 튜플
# a=("감","사과","대추")
# print(type(a))
# for i in a:
    # print(i)
# print(a[2])
# a[2]="수박"     //튜플은 내용 삽입이 안된다.
# print(a)


# a=("빨강","노랑","초록","파랑")
# 인덱스와 같이 출력
# for i in enumerate(a):
#     print(i)
# print("-"*30)
# for i,v in enumerate(a):
#     print(i,v)

# a,b,c=1,"two","셋"
# print(a,b,c)
# a=1,"two","셋"
# print(a)

# a,b=3
# print(a,b)  오류류

# a=range(10)
# print(a)
# print(list(a))
# print(tuple(a))

#-----------> 딕션어리{}
# 순서X, 키와 값 셋트, 키는 중복X,
# 값은 중복가능

# friend={"name":"kim","age":20,"성격":1004}
# print(friend)
# print(type(friend))
# print(friend["age"])
# print(friend["성격"])
# print("-"*30)
# for i in friend:
#     # print(i)
#     print(i,friend[i])
#
# print(friend.keys())    #리스트로 반환
# print(friend.values())
#
# for i in friend.items():    # 키와 값 반환
#     print(i)


# a="javascript"
# for i in a:
#     print(i)
# r=[i for i in a]
# print(r)

# for i in enumerate(a):
#     print(i)
# r={}
# for i in enumerate(a):
#     # r[i[0]]=i[1]
#     r[i[1]]=i[0]
# print(r)
#
# r={i[1]:i[0] for i in enumerate(a)}
# print(r)


