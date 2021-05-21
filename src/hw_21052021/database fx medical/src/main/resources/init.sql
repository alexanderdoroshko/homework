CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS emloyees;
CREATE TABLE employees(fullName VARCHAR(100),age INT ,post VARCHAR(100),specialization VARCHAR (100));

INSERT INTO employees(fullName, age, post, specialization) VALUES ('Хаус Грегори Иванович','35','врач','хирург');
INSERT INTO employees(fullName, age, post, specialization) VALUES ('Моро Александр Анатольевич','43','врач','анестезиолог');
INSERT INTO employees(fullName, age, post, specialization) VALUES ('Менделе Франц Карлович','54','врач','реанимотолог');
INSERT INTO employees(fullName, age, post, specialization) VALUES ('Василевская Галина Вольфовна','27','врач','окулист');
INSERT INTO employees(fullName, age, post, specialization) VALUES ('Разумовский Олег Васильевич','62','врач','невропотолог');