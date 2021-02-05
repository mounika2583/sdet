REM   Script: Activity1-5
REM   All activities for salesman table


create table salesman (  
 salesman_id int,  
 salesman_name varchar(20),  
 salesman_city varchar(20),  
 commission int);

desc salesman





select * from salesman;

insert into salesman values('5001','James Hoog','New York','15') 
insert into salesman values('5002', 'Nail Knite', 'Paris', '13')  
insert into salesman values('5005', 'Pit Alex', 'London', '11')  
insert into salesman values('5006', 'McLyon', 'Paris', '14')  
insert into salesman values('5007', 'Paul Adam', 'Rome', '13')  
insert into salesman values('5003', 'Lauson Hen', 'San Jose', '12');



select * from salesman;


-- select Queries from Salesman table

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='paris';

select salesman_id , comission from salesman where salesman_name='Paul Adam';

--Alter Table

ALTER  TABLE salesman ADD GRADE int;

--update table 

update salesman set GRADE=100;

select * from salesman;

update salesman set GRADE=200 where salesman_city='Rome';

update salesman set GRADE=300 where saleman_name='James Hoog';

update salesman set salesman_name= 'pierre' where salesman_name='McLyon';

select * from salesman;

update salesman set GRADE=300 where salesman_name='James Hoog';

select * from salesman;


-- Get all salesman ids without any repeated values
select distinct salesman_id from orders;

-- Display the order number ordered by date in ascending order
select order_no, order_date from orders order by order_date;

-- Display the order number ordered by purchase amount in descending order
select order_no, purchase_amount from orders order by purchase_amount DESC;

-- Display the full data of orders that have purchase amount less than 500.
select * from orders where purchase_amount < 500;

-- Display the full data of orders that have purchase amount between 1000 and 2000.
select * from orders where purchase_amount between 1000 and 2000;
