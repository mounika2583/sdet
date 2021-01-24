REM   Script: Activity1-5
REM   All activities for salesman table


create table salesman (  
 salesman_id int,  
 salesman_name varchar(20),  
 salesman_city varchar(20),  
 commission int);

desc salesman


insert into salesman values('5001','James Hoog','New York','15') 
insert into salesman values(5002, 'Nail Knite', 'Paris', 13)  
insert into salesman values(5005, 'Pit Alex', 'London', 11)  
insert into salesman values(5006, 'McLyon', 'Paris', 14)  
insert into salesman values(5007, 'Paul Adam', 'Rome', 13)  
insert into salesman values(5003, 'Lauson Hen', 'San Jose', 12) ;



select * from salesman;

insert into salesman values('5001','James Hoog','New York','15') 
insert into salesman values('5002', 'Nail Knite', 'Paris', '13')  
insert into salesman values('5005', 'Pit Alex', 'London', '11')  
insert into salesman values('5006', 'McLyon', 'Paris', '14')  
insert into salesman values('5007', 'Paul Adam', 'Rome', '13')  
insert into salesman values('5003', 'Lauson Hen', 'San Jose', '12');

insert into salesman values('5001','James Hoog','New York','15');

insert into salesman values('5002', 'Nail Knite', 'Paris', '13');

insert into salesman values('5005', 'Pit Alex', 'London', '11');

insert into salesman values('5006', 'McLyon', 'Paris', '14');

insert into salesman values('5007', 'Paul Adam', 'Rome', '13');

insert into salesman values('5003', 'Lauson Hen', 'San Jose', '12');

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city='paris;

select salesman_id , comission from salesman where salesman_name='Paul Adam';

select * from salesman where salesman_city='paris';

select salesman_id , commission from salesman where salesman_name='Paul Adam';

select * from salesman where salesman_city='Paris';

ALTER  TABLE salesman ADD GRADE int;

update salesman set GRADE=100;

select * from salesman;

update salesman set GRADE=200 where salesman_city='Rome';

update salesman set GRADE=300 where saleman_name='James Hoog';

update salesman set salesman_name= 'pierre' where salesman_name='McLyon';

select * from salesman;

update salesman set GRADE=300 where salesman_name='James Hoog';

select * from salesman;

