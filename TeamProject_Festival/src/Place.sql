create table place(
num number(5),
gegu varchar2(30),
name varchar2(30),
address varchar2(30),
tel varchar2(30),
homepage varchar2(30))

select * from place

insert into place values(1,'동구','efe1','ee','010333777','wwww.efefw.com');
insert into place values(1,'서구','efe2','ee','010123777','wwww.efe57.com');
insert into place values(1,'남구','efe3','ee','010456777','wwww.efe65w.com');
insert into place values(1,'북구','efe4','ee','010789777','wwww.efe56w.com');
insert into place values(1,'동구','efe5','ee','010222777','wwww.efeffe.com');
insert into place values(1,'광산구','efe6','ee','010555777','wwww.e23efw.com');
insert into place values(1,'동구','레이디벅스파티룸','ee','010555777','wwww.e23efw.com');
insert into place values(1,'동구','지산낙원','12','01055455777','wwww.e23efw.com');


select name,address,tel,homepage from place where name='efe1'

drop table place
