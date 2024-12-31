REM   Script: SQL Activities1-5
REM   create table
insert data
fetch data
update table
alter table

create table salesman( 
salesman_id int PRIMARY KEY, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

describe salesman


insert all 
into salesman values (5001,'James Hoog','New York',15) 
into salesman values (5002,'Nail Knite','Paris',13) 
into salesman values (5005,'Pit Alex','London',11) 
into salesman values (5006,'Mc Lyon','Paris',14) 
into salesman values (5007,'Paul Adam','Rome',13) 
into salesman values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

select * from salesman;

select salesman_id,salesman_city from  salesman;

select salesman_id from  salesman where salesman_city= 'Paris';

select salesman_id,commission from  salesman where salesman_name = 'Paul Adam';

UPDATE salesman SET grade=100;

ALTER TABLE salesman ADD grade int;

SELECT * FROM salesman;

UPDATE salesman 
SET grade = 200 where salesman_city= 'Rome';

    UPDATE salesman 
SET grade = 300 where salesman_name= 'James Hoog';

    UPDATE salesman 
SET salesman_name = 'Pierre' where salesman_name= 'Mc Lyon';

SELECT * FROM salesman;

