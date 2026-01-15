use ufcfighter;
CREATE TABLE fly
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)
);
CREATE TABLE Bantam
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE Feather
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE Light
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE Welter
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE Middle
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE LightHeavy
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);
CREATE TABLE Heavy
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   double,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4),
    fight_no         varchar(4)

);

drop table fly;
drop table Bantam;
drop table Feather;
drop table light;
drop table welter;
drop table middle;
drop table lightheavy;
drop table heavy;

select *
from fly;
select *
from bantam;
select *
from feather;
select *
from light;
select *
from welter;
select *
from middle;
select *
from lightheavy;
select *
from heavy;

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('조슈아 반', '플라이급', 165, 165, 56, 16, 2, 57, 64, 8, 'C');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('페트르 얀', '밴텀급', 170, 171, 61, 20, 5, 55, 49, 7, 'C');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('션 오말리', '밴텀급', 182, 177, 61, 18, 3, 61, 43, 12, '3');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('송야동', '밴텀급', 170, 172, 61, 22, 8, 44, 38, 9, '5');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('알렉산더 볼카노프스키', '페더급', 181, 167, 65, 27, 4, 57, 34, 13, 'C');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('아놀드 앨런', '페더급', 178, 65, 65, 20, 3, 42, 48, 7, '6');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('제앙 실바', '페더급', 175, 170, 65, 16, 3, 51, 50, 12, '10');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('일리아 토푸리아', '라이트급', 175, 170, 70, 17, 0, 48, 61, 7, 'C');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('저스틴 게이치', '라이트급', 180, 177, 70, 26, 5, 59, 14, 20, '4');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('패디 핌블렛', '라이트급', 185, 177, 70, 23, 3, 54, 29, 7, '5');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('이슬람 마카체프', '웰터급', 179, 177, 70, 28, 1, 58, 56, 5, 'C');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('함자트 치마예프', '미들급', 190, 187, 83, 15, 0, 61, 55, 6, 'C');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('알렉스 페레이라', '라이트 헤비급', 200, 193, 92, 13, 3, 62, 50, 11, 'C');

insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('톰 아스피날', '헤비급', 198, 195, 115, 15, 3, 68, 80, 12, 'C');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('왈도 코르테스 아코스타', '헤비급', 198, 193, 118, 16, 2, 48, 50, 8, '5');
insert into fighter (name, weight_class, rich, height, weight, win, lose, attackaccuracy, takedownaccuracy, KO_TKO,
                     fighter_RANK)
values ('데릭 루이스', '헤비급', 200, 190, 118, 29, 12, 51, 26, 24, '8');



CREATE TABLE fighter
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(20),
    weight_class     VARCHAR(20),
    rich             INT,
    height           INT,
    weight           INT,
    WIN              INT,
    LOSE             INT,
    attackaccuracy   DOUBLE,
    takedownaccuracy DOUBLE,
    KO_TKO           INT,
    fighter_RANK     VARCHAR(4)
);


select * from fighter;