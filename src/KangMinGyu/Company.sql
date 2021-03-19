create table company(
cno number constraint company_cno_p primary key,
cname varchar2(30) not null,
ceo varchar2(30) not null,
tel varchar2(20),
dam varchar2(30)
);

select * from tab;

insert into COMPANY values(1,'홍','강','010','길동');
insert into COMPANY values(2,'강','홍','101','동길');

select * from company;