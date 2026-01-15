create database kfc;

use ufcevent;

create table numEvent
(
    id       int primary key auto_increment,
    num      varchar(20) not null,
    date     varchar(20) not null,
    location varchar(50)
);

create table eventFighter
(
    eventId   int,
    fighterId int,
    card_type varchar(10)
);

insert into numEvent (num, date, location)
values ('UFC324', '26.01.26 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location)
values ('UFC325', '26.02.01 / 11:00', '호주, 시드니 올림픽 공원');
insert into numEvent (num, date, location)
values ('UFC326', '26.03.08 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.02.08 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.02.22 / 10:00', '미국, 휴스턴');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.03.01 / 11:00', '멕시코, 멕시코시티');

delete from numEvent;
select * from numEvent;


insert into eventFighter values ();
insert into eventFighter values ();
insert into eventFighter values ();
insert into eventFighter values ();
insert into eventFighter values ();
insert into eventFighter values ();


drop table numEvent;
drop database kfc;