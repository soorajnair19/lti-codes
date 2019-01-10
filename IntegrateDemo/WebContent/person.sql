create table MYPERSON (id number primary key,
name varchar2(30),country varchar2(30));

insert into MYPERSON values(1,'Smita','India');
insert into MYPERSON values(2,'Jim','USA');

select * from MYPERSON;
delete  from MYPERSON;