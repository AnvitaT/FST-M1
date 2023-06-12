REM   Script: SQL-Activity4
REM   Creation of Salesman table

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman  
VALUES (5001,'James Hoog','New York',15);

INSERT INTO salesman  
VALUES (5002,'Nail Knite','Paris ',13);

INSERT INTO salesman  
VALUES (5005,'Pit Alex','London',11);

INSERT INTO salesman  
VALUES (5006,'McLyon','Paris',14);

INSERT INTO salesman  
VALUES (5007,'Paul Adam','Rome',13);

INSERT INTO salesman  
VALUES (5003,'Lauson Hen','San Jose',12);

select * from salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

