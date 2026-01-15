create database kfc;

use ufcfighter;
create table numEvent (
    id int primary key auto_increment,
    num varchar(20) not null,
    date varchar(20) not null,
    location varchar(50)
);

create table eventFighter (
    eventId int,
    fighterId int,
    card_type varchar(10)
);


insert into numEvent (num, date, location) values ( 'UFC324', '25.01.26 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location) values ( 'UFC325', '01.02.26 / 11:00', '호주, 시드니 올림픽 공원');
insert into numEvent (num, date, location) values ( 'UFC326', '08.03.26 / 11:00', '미국, 라스베가스');


drop table numEvent;
drop database kfc;