#벡터의 연산
a<-c(1,2,3,4)
b<-c(5,6,7,8)
c<-a+b
c
c<-a*b
c
#1)길이가 다른 벡터연산-두 벡터의 길이가 서로배수인경우
a<-c(1,2,3,4)
b<-c(5,6)
c<-a+b
c
c<-a*b
c
#2)길이가 다른 벡터연산--두 벡터의 길이가 서로 배수가 아닌경우
a<-c(1,2,3,4)
b<-c(5,6,7)
c<-a+b
c
c<-a*b
c
# 데이터프레임:벡터들을 조합한 형태 
id<-c('f1','f2','f3','f4')
name<-c('둘리','희동','고길동','홍길동')
age<-c(10,20,30,16)
is1004<-c(T,T,F,F)
# 데이터프레임 생성함수
df<-data.frame(id,name,age,is1004)
df
str(df)
df<-data.frame(id,name,age,is1004,stringsAsFactors =T )
str(df)
df
#데이터 접근
df[2,3]    #2행3열
df[c(2,3),]  #2행3행 전체열
df[c(2,3),c(2,4)]   #2행3행중 2,4열
df[,c(2,4)] # 2,4열의 모든행 
df[,c('name','age')]
#열에 접근
df$age
df$name
df$name[3:4]
#예제데이터
data()
iris
#데이터 저장
write.csv(iris,file='iris.csv')
write.csv(iris,file='iris.csv',row.names = F)
write.csv(df,file='df.csv')
write.csv(df,file='df.csv',fileEncoding = )
#데이터 읽기
data<-read.csv('iris.csv')
data
#엑셀 데이터 읽기
install.packages("readxl")
library(readxl)
a<-read_excel('test.xlsx')
a
a1<-read_excel('test.xlsx',sheet=2)   #두번째 시트
a1
a2<-read_excel('test.xlsx',sheet="Sheet2")  #시트이름이 Sheet2인것
a2
#클립보드에 있는 내용 가져오기
a3<-read.table("clipboard")    
a3
a3<-read.table("clipboard",header=T)  
a3
iris
str(iris)
nrow(iris)   #행수
ncol(iris)   #열수
head(iris)
head(iris,3)
tail(iris)
min(iris$Sepal.Length)
quantile(iris$Sepal.Length)   #4분위수
summary(iris)
View(iris)
#subset(데이터프레임,조건,조회하고 싶은열)
subset(iris,Sepal.Length>6)
subset(iris,Sepal.Length>6,c(1,5))
subset(iris,Sepal.Length>6,c('Sepal.Length','Species'))
subset(iris,Sepal.Length>6 |Sepal.Width>=4,
       c('Sepal.Length','Sepal.Width','Species'))
subset(iris,Sepal.Length>6 & Sepal.Width>=3,
       c('Sepal.Length','Sepal.Width','Species'))
#꽃의 종류가 세토사인것의 정보를 요약하세요
summary(subset(iris,Species=='setosa'))

iris
summary(iris[iris$Species=='setosa',])
str(iris[iris$Species=='setosa',c('Sepal.Length','Species')]) #데이터프레임
str(iris[iris$Species=='setosa',c('Sepal.Length')]) #벡터
#
install.packages("dplyr")
library(dplyr)
data<-iris
data
#컬럼명변경
#rename(데이터프레임,새변수명1=변수명1,.....)
data<-rename(data,len1=Sepal.Length,wid1=Sepal.Width)
data
#새 컬럼 생성
data$length<-data$len1+data$Petal.Length
head(data)
#ifelse(조건,참인경우,거짓인경우)
data$new<-ifelse(data$len1>5,'good','low')
head(data)
#data$len1>5 --good
#4.5<data$len1<=5  low 
#data<4.5 fail
data$new2<-ifelse(data$len1>5,'good',
             ifelse(data$len1>4.5,'low','fail'))
head(data)
View(data)
#dplyr 패키지의 함수들
# %>% 파이프라인 앞명령어의 출력이 뒷명령어의 입력으로 처리
#rename :컬럼명 변경
#filter(조건) :조건에 맞는 데이터 추출
#select(열이름1,열이름2,...) :보고싶은열 선택
#arrange(컬럼명) :정렬
#mutate(변수1=수식1,변수2=수식2,.... ) 변수추가
#summarise()요약
#group_by(컬럼명)
data8<-head(data,10) %>% filter(new!='good')
data8 %>% select(Petal.Length, Petal.Width )
head(iris,10) %>%filter(Sepal.Length>=5) %>%
  select(Sepal.Length,Species) %>%
  arrange(Sepal.Length)

head(iris,10) %>%filter(Sepal.Length>=5) %>%
  select(Sepal.Length,Species) %>%
  arrange(desc(Sepal.Length))

head(iris) %>% mutate(hap=Sepal.Length+Petal.Length,
                      avg=(Sepal.Width+Petal.Width)/2,
                      grade=ifelse(Sepal.Width>=3.5,'good','poor')
                      )
head(iris) %>% summarise(avg=mean(Sepal.Length))

iris %>% group_by(Species) %>%
  summarise(avg=mean(Sepal.Length),
            hap=sum(Sepal.Length),
            med=median(Sepal.Length))
install.packages("ggplot2")  
library(ggplot2)
View(mpg)
#disp 배기량, cyl 실린더갯수 drv 구동방식, hwy 고속도로연비
#class 자동차종류 model 모델명,year 생산년도, trans 변속기종류
#cty 도시년비, fl 연료종류
#과제
#1)자동차제조회사에 따라 도시연비의 평균출력
#2) cty, hwy의 평균연비변수를 추가
#3) 2번에서 구해진 변수에서 평균연비가 높은 데이터 3개 출력


mpg %>% arrange(desc(avg))
head(mpg,3) %>% arrange(desc(avg))







