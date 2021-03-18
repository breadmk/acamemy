#1)
#기술통계:데이터를 요약 묘사, 설명하는 통계기법,평균,분산등
#추론통계:표본데이터 통계량을 토대로 모집단의 특성을 추론
#2)
#귀무가설:연구에서 검증하는 가설
#대립가설:귀무가설과 반대되는 가설, 연구자가 연구를 통해 입증되기를 기대하는 가설
#3)
library(ggplot2)
mpg
mpg$total<-(mpg$cty+mpg$hwy)/2
mpg
#4-1)
str(iris)
dim(iris)
summary(iris)
#4-2)
plot(iris$Petal.Length,iris$Petal.Width)
#4-3)
cor.test(iris$Petal.Length,iris$Petal.Width)




