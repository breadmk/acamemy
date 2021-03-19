select * from DEPT;
-- 90부서 삭제
delete from dept where deptno=90;

--90부서의 지역을 독도로 수정.
update dept set loc='독도' where deptno=90;
select * from dept where deptno=90;

--dept테이블에 90,IT, 서울 입력

insert into dept 
values(90,'IT','서울');

select * from dept;

*delete 문법
delete from 테이블명
[where 조건];

*update 문법
update 테이블명 
set 컬럼명=새값, 컬럼명=새값....
[where 조건];

*insert 문법
insert into 테이블명
values(값);

*select 문법
select {*|컬럼명 [as]별칭} 
from 테이블명;
[where 조건]
[group by 컬럼명]
[having 조건]
[order by 정렬기준 오름차순]

정렬방식
- 오름차순(기본값,ASC) : 숫자 작->큰 문자 A->Z,ㄱ->ㅎ, 날짜 예전->최근
- 내림차순(DESC)

select * from emp;

* sequence 생성
create sequence 시퀀스명
start with 시작값
increment by 증감값
maxvalue 최대값
minvalue 최소값
cycle | nocycle

create sequence eno_seq
start with 8000
increment by 1
maxvalue 9999
nocycle;

--- sequence 사용법  // 시퀀스명,nextval()
insert into emp(empno,ename,sal,hiredate) 
values(eno_seq.nextval,'홍1',3000,sysdate);

select empno,ename,sal,hiredate from emp where empno>=7900;
order by empno desc;

update emp 
set sal=sal+100
where empno=8001;

delete from emp where empno=8000;

insert into emp(empno,ename,sal,hiredate) 
values(9000,'홍2',3000,sysdate);

select * from emp;
commit

desc emp

** table 생성

create table 테이블명 (
컬럼명 타입(크기) [제약조건],
컬럼명 타입(크기) [제약조건],
컬럼명 타입(크기) constraint 제약조건명 [제약조건],
컬럼명 타입(크기) constraint 제약조건명 [제약조건] default 기본값,
);

