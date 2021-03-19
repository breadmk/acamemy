a="    blue   red   green    "
print(len(a)) # 길이
print("["+a+"]")
print("["+a.lstrip()+"]")   #왼쪽 공백 삭제
print("["+a.rstrip()+"]")   #오른쪽 공백 삭제
print("["+a.strip()+"]")    #양쪽 공백 삭제


#print(a.replace("찾는문자열","바꿀문자열"))
print(a.replace(" ","")) #따닥따닥 붙임.

print(a.upper()) # 대문자 변경
print(a.lower()) # 소문자 변경


print(type(a))

print("-"*30)
a="1-2-3 4-5 6"
print(a.split("-")) #하이픈 단위로 자르기
print(a.split(" ")) #공백 단위로 자르기
print(type(a.split(" "))) #split의 타입 <class 'list'>
b=a.split(" ")
print(b)
print("%".join(b)) # % 넣어서 붙여라. split랑 반대 개념
print("!!".join(b))
print(type(b))
print("------------입력받기-------------")
# line=input()  #입력받은 내용은 str 처리
# print(line)
# print(line,type(line))
# print(line.split())
print("--------collection-------------")
# collection : index는 0부터 시작한다 (java랑 동일)
# [] : 리스트
# () : 튜플 : 변경X,사용법은 리스트와 같다.
#           파이썬이 사용한다. 매개변수 전달시,
# {} : 딕션어리,set
# <> : not used

a=[1,56,"가나다","AAA",["one","two","three"],1111,1,True,False]
print(a)
print(len(a)) #[ ] 묶은건 하나로 처리.
print(a[0])
print(a[0:3])
print(a[4:])
print(a[3:-2])
print(a[4])
print(a[4][1]) #[]  묶은건 그냥 변수라고 생각하고 출력.
b=["토마토","감","포도"]
print(b[1])
b[2]="캠밸"
print(b)
b.append("샤인머스킷") #문자열 추가
print(b)
print(sorted(b)) # 정렬
print(list(reversed(b)))

a=[3,78,12,33,4]
print("합계",sum(a))
print("평균",sum(a)/len(a))
a.append(99)
print(a)
print("합계",sum(a))
print("평균",sum(a)/len(a)) # avg 함수가 없다.
print(dir(a)) #사용 가능한 함수 조회
#컴프리핸션
