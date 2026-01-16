create database ONEfighter;

use ONEfighter;
drop table fighter;

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
    fighter_RANK     VARCHAR(4),
    striking varchar(10)
);


insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK, striking)
values ('조나단 디 벨라', '스트로급',175, 56, 5,1,0,'20분 40초','C','킥복싱'),
       ('슈퍼렉', '플라이급', 171,61,15,3,5,'9분 43초','C','킥복싱'),
       ('조나단 해거티', '밴텀급', 170,65,9,3,3,'9분 19초','C','킥복싱'),
       ('슈퍼본', '페더급', 177,70,7,3,3,'12분 30초','C','킥복싱'),
       ('로만 크리클리아', '라이트헤비급', 200,105,7,1,6,'8분 23초','C','킥복싱'),
       ('사메트 아그데베', '헤비급', 190,109,1,0,0,'23분 00초','C','킥복싱');

select * from fighter;