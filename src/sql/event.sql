create table numEvent (
    num varchar(6) primary key not null,
    mainCard varchar(30) not null,
    underCard varchar(30) not null,
    date varchar(20) not null,
    location varchar(50)
);


insert into event values ('UFC324');
insert into event values ('UFC325');
insert into event values ('UFC326');


drop table event