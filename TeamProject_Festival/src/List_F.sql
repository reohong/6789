create table List_F(

name varchar(50),
day varchar(20),
loc varchar(50), 
theme varchar(50),
num number,
n_num number,
reply varchar(1000),
money number
);

insert into List_F values('Welcome','2020-08-02','�ƽþƹ�ȭ����','�ø�����',5,1,'��ǰ�� �پ��ϸ� ���ھ��',0);
insert into List_F values('Jazz Festival','2020-08-01','���ν���','����',10,4,'',0); 

select * from List_F 
drop table List_F
