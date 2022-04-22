drop table person_record;
CREATE TABLE person_record
(
    id        INT NOT NULL,
    firstname VARCHAR(255),
    lastname  VARCHAR(255),
    CONSTRAINT pk_personrecord PRIMARY KEY (id)
);

insert into person_record values ( 1,'hema','latha' );
insert into person_record values ( 2,'hema','latha1' );
insert into person_record values ( 3,'hema','latha2' );