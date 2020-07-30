create table List_F(

name varchar(50),
day varchar(20),
loc varchar(50), 
theme varchar(50),
num number,
n_num number);

insert into List_F values('Welcome','2020-08-02','아시아문화전당','플리마켓',5,1);
insert into List_F values('Jazz Festival','2020-08-01','대인시장','축제',10,4); 

select * from List_F 
drop table List_F
