create table place(
gegu varchar2(30),
name varchar2(80),
address varchar2(80),
tel varchar2(50),
homepage varchar2(80))

select * from place


insert into place values('����','�ݳ��ο����� ����Ʈ��Ʃ���','���� ���� �ݳ��� 162-4 3��','0504-1380-5376','https://www.spacecloud.kr/space/26548');
insert into place values('����','���곫��','���� ���� ��ȣ�� 127���� 17 ���곫��','0504-0905-2877','https://www.spacecloud.kr/space/15207');
insert into place values('����','����ũ ��Ʃ���','���� ���� �嵿 80-4 2��','0504-0905-9172','https://www.spacecloud.kr/space/8513');
insert into place values('����','����ž ��Ƽ�� ��������','���� ���� �踲�� 1037 3��,4��','0504-1381-2419','https://www.spacecloud.kr/space/25648');
insert into place values('����','SIXBOX','���� ���� ����� 9 3��','0504-1381-0605','https://www.spacecloud.kr/space/23746');
insert into place values('����','efe2','ee','010123777','wwww.efe57.com');
insert into place values('����','efe3','ee','010456777','wwww.efe65w.com');
insert into place values('�ϱ�','efe4','ee','010789777','wwww.efe56w.com');
insert into place values('����','efe5','ee','010222777','wwww.efeffe.com');
insert into place values('���걸','efe6','ee','010555777','wwww.e23efw.com');


select address,tel,homepage from place where name='efe1'

drop table place
