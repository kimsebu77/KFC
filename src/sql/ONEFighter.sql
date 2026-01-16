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
    fighter_RANK     VARCHAR(4)
);

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("레지안 이저셀","light",189,77,13,1,4,"15분 15초","C","무에타이")

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("로만 크리클리아","heavy",200,105,7,1,6,"8분 23초","C","무에타이")

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("나빌 아난","bantam",195,68,8,1,3,"5분 58초","C","무에타이")

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("프라잔차이","straw",163,56,7,2,3,"13분 57초","C","무에타이")

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("나다카","atom",165,52,4,0,2,"11분 43초","C","무에타이")

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("타완차이","feather",180,69,10,3,6,"9분 48초","C","무에타이");

insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK,striking)
values ("조경재","bantam",173,65,0,0,0,"0분 0초","U","킥복싱");