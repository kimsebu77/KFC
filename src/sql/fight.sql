USE kfc;
create table fighter (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(20),
                         rich INT,
                         height INT,
                         weight INT,
                         WIN INT,
                         LOSE INT,
                         accuracy DOUBLE,
                         KO_TKO INT
)
