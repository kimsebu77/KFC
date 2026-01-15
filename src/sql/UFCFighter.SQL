create database ufcfighter;

use ufcfighter;
CREATE TABLE fly (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE bantam (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE feather (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE light (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE welter (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE middle (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE lightheavy (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);
CREATE TABLE heavy (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    rich INT,
    height INT,
    weight INT,
    WIN INT,
    LOSE INT,
    accuracy DOUBLE,
    KO_TKO INT,
    fighter_RANK VARCHAR(4)
);