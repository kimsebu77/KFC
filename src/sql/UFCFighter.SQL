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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
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
    fighter_RANK     VARCHAR(4)
);

drop table Feather;
select * from fly;
select * from bantam;
select * from feather;
select * from light;
select * from welter;
select * from middle;
select * from lightheavy;
select * from heavy;

insert into fly (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('조슈아 반', 165,165,56,16,2,57,64,8,'C');

insert into bantam (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('페트르 얀', 170,171,61,20,5,55,49,7,'C');
insert into bantam values (3, '션 오말리',182,177,61,18,3,61,43,12,'3');
insert into bantam values (5, '송야동',170,172,61,22,8,44,38,9,'5');

insert into feather (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('알렉산더 볼카노프스키',181,167,65,27,4,57,34,13,'C');
insert into feather values (6,'아놀드 앨런',178,65,65,20,3,42,48,7,'6');
insert into feather values (10,'제앙 실바',175,170,65,16,3,51,50,12,'10');


insert into light (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('일리아 토푸리아',175,170,70,17,0,48,61,7,'C');
insert into light  values (4,'저스틴 게이치',180,177,70,26,5,59,14,20,'4');
insert into light  values (5,'패디 핌블렛',185,177,70,23,3,54,29,7,'5');

insert into welter (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('이슬람 마카체프',179,177,70,28,1,58,56,5,'C');

insert into middle (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('함자트 치마예프',190,187,83,15,0,61,55,6,'C');

insert into lightheavy (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('알렉스 페레이라',200,193,92,13,3,62,50,11,'C');

insert into heavy (name,rich,height,weight,win,lose,attackaccuracy,takedownaccuracy,KO_TKO,fighter_RANK) values ('톰 아스피날',198,195,115,15,3,68,80,12,'C');
insert into heavy values (5,'왈도 코르테스 아코스타',198,193,118,16,2,48,50,8,'5');
insert into heavy values (8,'데릭 루이스',200,190,118,29,12,51,26,24,'8');


