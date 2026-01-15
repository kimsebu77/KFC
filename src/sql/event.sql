create database ufcEvent;

use ufcEvent;

create table numEvent
(
    id       int primary key auto_increment,
    num      varchar(20) not null,
    date     varchar(20) not null,
    location varchar(50)
);


insert into numEvent (num, date, location)
values ('UFC324', '26.01.26 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location)
values ('UFC325', '26.02.01 / 11:00', '호주, 시드니 올림픽 공원');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.02.08 / 11:00', '미국, 라스베가스');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.02.22 / 10:00', '미국, 휴스턴');
insert into numEvent (num, date, location)
values ('UFC Fight Night', '26.03.01 / 11:00', '멕시코, 멕시코시티');
insert into numEvent (num, date, location)
values ('UFC326', '26.03.08 / 11:00', '미국, 라스베가스');


USE ufcEvent;

CREATE TABLE eventFighter
(
    id        INT AUTO_INCREMENT PRIMARY KEY, -- 데이터 정렬용
    eventId   INT,
    fight_no  INT,                            -- 경기 순서 (1번 경기, 2번 경기...)
    fighterId INT,                            -- 선수 ID (ufcfighter.fighter 테이블의 id)
    card_type VARCHAR(20)                     -- 'MAIN', 'PRELIM' 등
);

-- 데이터 입력 (같은 fight_no를 가진 두 선수가 한 경기가 됨)
INSERT INTO eventFighter (eventId, fight_no, fighterId, card_type)
VALUES (1, 1, 9, 'MAIN Card'),
       (1, 1, 10, 'MAIN Card'), -- 1번 경기: 9번 vs 10번
       (1, 2, 3, 'MAIN Card'),
       (1, 2, 4, 'MAIN Card'), -- 2번 경기: 3번 vs 4번
       (1, 3, 15, 'MAIN Card'), -- 2번 경기: 3번 vs 4번
       (1, 3, 16, 'MAIN Card'), -- 2번 경기: 3번 vs 4번
       (1, 4, 6, 'MAIN Card'), -- 2번 경기: 3번 vs 4번
       (1, 4, 7, 'MAIN Card'); -- 2번 경기: 3번 vs 4번


drop table eventFighter;



