create table school (
sno number constraint school_sno_p primary key,
loc varchar2(10),
hp varchar2(20),
grade varchar2(20)
);

insert into school values(1,'구로구','01012341234','A+');
insert into school values(2,'양천구','01023452345','B+');
insert into school values(3,'금천구','01034563456','C+');
insert into school values(4,'동작구','01045674567','D+');

select * from school;

