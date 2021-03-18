#주석
#실행 ctrl+enter
#콘솔지우기 ctrl+l
a<-100
b=20
print(a)
b
c<-'spring'
c<-"winter"
A
#벡터함수 c(),모두 같은 데이터 타입
v1<-c(1,2,3,4,5)
v1  
str(v1) #정보확인 숫자,인덱스가 1-5
v2<-c('one','two','three')
str(v2)
length(v1)  #벡터 길이 확인
length(v2)  
v1<-seq(1,100,by=2)
v1<-c(1,'hi',3.14,TRUE)
v1
v2<-c(T,F,TRUE,FALSE)
v1<-c(1,3.14,5.0,-999)
min(v1)
max(v1)  
mean(v1)  
median(v1)
sum(v1)
#NaN:숫자로 표현될수 없는 값, Inf(무한대)
v1<-c(2/2,-2/2,1/0,0/0,5/0)
str(v1)
mode(v1)   #데이터타입
v1<-c(-1,3,3.14,0,100,-100)
#데이터형변환 as.xxxx()
v1<-as.logical(v1)
v1<-as.numeric(v1)
v1<-as.character(v1)

v1<-c('spring','summer','autumn','winter','one')
nchar(v1)   #문자개수 출력
#문자열추출
substr('123456789',2,5)  #2번째부터 5번째까지 추출
substr(v1,1,2)
#문자열자르기 지정된 문자를 기준으로 나누어 벡터로 변환
s<-'2021-01-28'
v1<-strsplit(s,'-')
v1
#문자열합치기
paste("one","two","third","four")
paste("one","two","third","four",sep="-")
#대소문자변환
toupper("AbcdeFgHi")
tolower("AbcdeFgHi")
f<-c('사과','딸기','사과','포도','복숭아','딸기')
f
#팩터 생성,팩터:범주형데이터 factor()
fruit<-factor(f)
f
fruit
mode(f)
mode(fruit)  #numeric,내부적으로 숫자로된 코드값 벡터가 구성
str(f)
str(fruit)
#levels 순서변경- 그래프,분석결과 출력시 영향
fruit2<-factor(f,levels=c('복숭아','포도','딸기','사과'))
fruit2
str(fruit2)
#항목간에 서열이 존재하는 경우
grade<-c('수','우','수','양','가','우','가','미','양','미')
g2<-factor(grade,ordered=T)
g2
g3<-factor(grade,levels=c('가','양','미','우','수'),ordered=TRUE)
g3
#숫자벡터를 팩터로 변환
n<-c(30,10,10,20,20,30,10)
n1<-factor(n)
n1
n
#요소접근
v1<-c(1,2,3,4,5,6,7,8,9,10)
v1   #v1 전체내용출력
v1[3]
v1[c(1,3,7,9)]   #v1벡터의 1,3,7,9번째 요소 선택
v1[c(9,1,7,3)]   #v1벡터의 1,3,7,9번째 요소 출력순서변경
#연속된 숫자벡터생성
v1<-31:40
v1
v1<-51:100
v1
v1[15:35]  #15~35 요소출력
#seq(from=시작값,to=종료값,by=증감값)
v1<-seq(10,20,2)
v1
v1<-seq(100,0,-20)
v1
#불린추출
v1[3]
idx<-c(T,F,T,F,T,F)
v1[idx]
v1>50 #TRUE  TRUE  TRUE FALSE FALSE FALSE
v1[v1>50]
v1[3]<-67
v1[v1>50]<-  -1    #v1벡터중 50보다 큰값을 -1로 변경
v1[2:4]<-999  #v1벡터의 2번째부터 4번째 까지값을 999로 변경 
#v1벡터의 모든 값을 1로 변경
v1<-1    #X
v1
v1<-c(9,8,7,6,5)
length(v1)
v1[1:length(v1)]<-1   
v1
#----------------------
v1<-c(1,2,3,4,5)
v1<-c(0,v1)   #v1앞에 0 추가
v1<-c(c(-2,-1), v1)  #v1앞에 -2,-1 추가
#v1뒤에 6 추가
v1<-c(v1,6)
v1
#v1뒤에 7,8 추가
v1<-c(v1,7,8)
v1
#벡터합치기----------------------
v1<-c(1,2,3)
v2<-c(4,5,6)
v3<-c(7,8,9)
v<-c(v1,v2,v3)
v
v1<-c('a','b','c','f','g')
v2<-c('d','e')
#append(원본벡터,추가벡터,추가할위치)
v1<-append(v1,v2,3)
v1
#v1의 1,3,5,7번째 데이터 출력
v1[c(1,3,5,7)]
#v1의 1,3,5,7번째를 제외한 데이터 출력
v1[-c(1,3,5,7)]
#v1의 마지막 데이터 출력
length(v1)
v1[length(v1)]
#v1의 마지막 데이터 제외한 데이터 출력
v1[-length(v1)]
lidx<-c(T,T,F,F,F,F,F)
v1[lidx]  #불린추출,참인데이터 출력 
#논리벡터에는 ! 사용
v1[!lidx] #불린추출 참이아닌데이터 출력
#-과제--------------------------------
#1)10명의 학생이 수학 시험을 쳤습니다. 변수에 데이터를 저장하세요
#2) 전체의 평균,최소값,최대값,중간값을 출력하세요
#소스를 제출하세요(이름.txt 또는 이름.R)





