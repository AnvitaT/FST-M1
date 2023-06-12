REM   Script: SQL-Activity2
REM   Insertion the data in Salesman table

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

