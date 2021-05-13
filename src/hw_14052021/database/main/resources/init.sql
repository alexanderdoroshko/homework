CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS students;
CREATE TABLE students(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100),surname VARCHAR(100),course_name VARCHAR(100));

INSERT INTO students(name, surname, course_name) VALUES ('Andrei','Zaharenko','Java SE course');
INSERT INTO students(name, surname, course_name) VALUES ('Kristina','Stechko','Java SE course');
INSERT INTO students(name, surname, course_name) VALUES ('Nika','Zarinskaya','Java SE course');
INSERT INTO students(name, surname, course_name) VALUES ('Alexey','Kornilov','Java SE course');
INSERT INTO students(name, surname, course_name) VALUES ('Sergey','Nesterenok','Java SE course');