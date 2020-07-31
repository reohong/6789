create table List_F(

name varchar(50),
day_start date,
day_last date,
loc varchar(50), 
theme varchar(50),
num number,
n_num number,
reply varchar(1000),
money number
);

insert into List_F values('Welcome','2020-08-02','2020-08-04','아시아문화전당','플리마켓',5,1,'상품이 다양하면 좋겠어요',0);
insert into List_F values('Jazz Festival','2020-08-01','2020-08-07','대인시장','축제',10,4,'',0); 

select * from List_F 
drop table List_F
