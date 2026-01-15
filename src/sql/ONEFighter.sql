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


insert into fighter (name, weight_class, height, weight, win, lose, finishes, AVG_Duration, fighter_RANK)
values (),
       (),