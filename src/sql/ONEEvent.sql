create database oneevent;

use oneevent;

create table numEvent
(
    id       int primary key auto_increment,
    num      varchar(30) not null,
    date     varchar(30) not null,
    location varchar(50)
);


insert into numEvent (num, date, location)
values ('ONE Friday Fights 138', '26.1.16 / 20:30', '태국, 방콕 룸피니 스타디움');
insert into numEvent (num, date, location)
values ('ONE Fight Night 39', '26.1.23 / 11:00', '태국, 방콕 룸피니 스타디움');
insert into numEvent (num, date, location)
values ('ONE Fight Night 40', '26.02.13 / 11:00', '태국, 방콕 룸피니 스타디움');



CREATE TABLE eventFighter
(
    id        INT AUTO_INCREMENT PRIMARY KEY, -- 데이터 정렬용
    eventId   INT,
    fight_no  INT,                            -- 경기 순서 (1번 경기, 2번 경기...)
    fighterId INT,                            -- 선수 ID (ufcfighter.fighter 테이블의 id)
    fight_type VARCHAR(20)                     -- 'MAIN', 'PRELIM' 등
);

-- 데이터 입력 (같은 fight_no를 가진 두 선수가 한 경기가 됨)
INSERT INTO eventFighter (eventId, fight_no, fighterId, fight_type)
VALUES (1, 1, 7, '플라이급 무에타이'),
       (1, 1, 8, '플라이급 무에타이'), -- 1번 경기: 9번 vs 10번
       (1, 2, 9, '스트로급 무에타이'),
       (1, 2, 10, '스트로급 무에타이'), -- 2번 경기: 3번 vs 4번
       (1, 3, 11, '스트로급 무에타이'), -- 2번 경기: 3번 vs 4번
       (1, 3, 12, '스트로급 무에타이'), -- 2번 경기: 3번 vs 4번
       (1, 4, 13, '밴텀급 킥복싱'), -- 2번 경기: 3번 vs 4번
       (1, 4, 14, '밴텀급 킥복싱'); -- 2번 경기: 3번 vs 4번


drop table eventFighter;



