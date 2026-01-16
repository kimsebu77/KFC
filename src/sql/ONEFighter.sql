create database ONEfighter;

use ONEfighter;

CREATE TABLE fighter
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    weight_class     VARCHAR(20),
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    finishes           INT,
    AVG_Duration varchar(20),
    fighter_RANK     VARCHAR(10),
    striking varchar(10)
);


insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK, fighter.striking)
values ('조나단 디 벨라', '스트로',175, 56, 5,1,0,'20분 40초','C','킥복싱'),
       ('슈퍼렉', '플라이', 171,61,15,3,5,'9분 43초','C','킥복싱'),
       ('조나단 해거티', '밴텀', 170,65,9,3,3,'9분 19초','C','킥복싱'),
       ('슈퍼본', '페더', 177,70,7,3,3,'12분 30초','C','킥복싱'),
       ('로만 크리클리아', '라이트헤비', 200,105,7,1,6,'8분 23초','C','킥복싱'),
       ('사메트 아그데베', '헤비', 190,109,1,0,0,'23분 00초','C','킥복싱'),
       ('폼펫 퐁수판', '플라이', 170,61,7,4,4,'6분 55초','U','무에타이'),
       ('데초 포르 보리락', '플라이', 175,60,3,1,0,'9분 00초','U','무에타이'),
       ('차트파야크 삭사툰', '스트로', 168,57,8,1,5,'4분 40초','U','무에타이'),
       ('아야드 알바드르', '스트로', 172,56,3,2,2,'6분 12초','U','무에타이'),
       ('통람푼 그룹', '스트로', 165,53,7,0,3,'7분 17초','U','무에타이'),
       ('코흐타오 페초므누크', '스트로', 156,56,1,3,1,'8분 58초','U','무에타이'),
       ('조경재', '밴텀', 173,65,0,0,0,'0분 00초','U','킥복싱'),
       ('쇼타', '밴텀', 176,65,0,0,0,'0분 00초','U','킥복싱');


insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('레지안 이저셀','라이트',189,77,13,1,4,'15분 15초','C','무에타이')

insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('로만 크리클리아','헤비',200,105,7,1,6,'8분 23초','C','무에타이')

insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('나빌 아난','밴텀',195,68,8,1,3,'5분 58초','C','무에타이')

insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('프라잔차이','스트로',163,56,7,2,3,'13분 57초','C','무에타이')

insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('나다카','아톰',165,52,4,0,2,'11분 43초','C','무에타이')

insert into fighter (fighter.name, fighter.weight_class, fighter.height, fighter.weight, fighter.win, fighter.lose, fighter.finishes, fighter.AVG_Duration, fighter.fighter_RANK,fighter.striking)
values ('타완차이','페더',180,69,10,3,6,'9분 48초','C','무에타이');


drop table fighter

select * from fighter;