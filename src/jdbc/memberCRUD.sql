select * from tab;

--create table 테이블명 (
--컬럼명 타입(크기) [제약조건],
--컬럼명 타입(크기) [제약조건],
--컬럼명 타입(크기) constraint 제약조건명 [제약조건],
--컬럼명 타입(크기) constraint 제약조건명 [제약조건] default 기본값,
--);

이름,전화번호,아이디,비밀번호,age,email,nikname
-- 회원 테이블 생성
create table member(
mno number(5) constraint member_mno_pk primary key, 
mname varchar2(30), 
mid varchar2(50), 
mpwd varchar2(20),
mdate date default sysdate
);

insert into MEMBER values(eno_seq.nextval,'홍1','hid','1234',sysdate);
insert into MEMBER values(eno_seq.nextval,'홍2','kid','1234',sysdate);
insert into MEMBER values(eno_seq.nextval,'홍3','qid','1234',sysdate);

update MEMBER 
set mname='홍new1',mpwd='111'
where mno=8003;

delete from member where mno=8002;

select * from member;

--회원테이블삭제
-- drop table member;


select mno,mname,mpwd,mid,mdate from member;





