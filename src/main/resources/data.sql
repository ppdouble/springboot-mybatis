drop table if exists city;

create table if not exists city
(
    id int primary key auto_increment,
    name varchar(128) charset utf8,
    state varchar(128) charset utf8,
    country varchar(128) charset utf8
) engine=InnoDB default charset latin1;

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');