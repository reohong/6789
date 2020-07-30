create table place(
gegu varchar2(30),
name varchar2(30),
address varchar2(30),
tel varchar2(30),
homepage varchar2(30))

select * from place

insert into place values('悼备','efe1','ee','010333777','wwww.efefw.com');
insert into place values('辑备','efe2','ee','010123777','wwww.efe57.com');
insert into place values('巢备','efe3','ee','010456777','wwww.efe65w.com');
insert into place values('合备','efe4','ee','010789777','wwww.efe56w.com');
insert into place values('悼备','efe5','ee','010222777','wwww.efeffe.com');
insert into place values('堡魂备','efe6','ee','010555777','wwww.e23efw.com');


select address,tel,homepage from place where name='efe1'

drop table place
