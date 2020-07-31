create table place(
gegu varchar2(30),
name varchar2(80),
address varchar2(80),
tel varchar2(50),
homepage varchar2(80))

select * from place


insert into place values('동구','금남로연습실 저스트스튜디오','광주 동구 금남로 162-4 3층','0504-1380-5376','https://www.spacecloud.kr/space/26548');
insert into place values('동구','지산낙원','광주 동구 지호로 127번길 17 지산낙원','0504-0905-2877','https://www.spacecloud.kr/space/15207');
insert into place values('동구','라이크 스튜디오','광주 동구 장동 80-4 2층','0504-0905-9172','https://www.spacecloud.kr/space/8513');
insert into place values('동구','루프탑 파티룸 어라운드더문','광주 동구 계림동 1037 3층,4층','0504-1381-2419','https://www.spacecloud.kr/space/25648');
insert into place values('동구','SIXBOX','광주 동구 동명로 9 3층','0504-1381-0605','https://www.spacecloud.kr/space/23746');
insert into place values('서구','efe2','ee','010123777','wwww.efe57.com');
insert into place values('남구','efe3','ee','010456777','wwww.efe65w.com');
insert into place values('북구','efe4','ee','010789777','wwww.efe56w.com');
insert into place values('동구','efe5','ee','010222777','wwww.efeffe.com');
insert into place values('광산구','efe6','ee','010555777','wwww.e23efw.com');


select address,tel,homepage from place where name='efe1'

drop table place
