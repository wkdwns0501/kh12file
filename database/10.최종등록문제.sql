drop table customer;
create table customer(
customer_no number primary key,
customer_id varchar2(20) unique not null,
customer_contact char(13) unique not null,
customer_join char(10) not null,
customer_purchase char(10) not null,
customer_mileage number default 0,
customer_level varchar2(12) not null,
check(regexp_like(customer_id, '^[a-z0-9]{8,20}$')),
check(regexp_like(customer_contact,'^010-[0-9]{4}-[0-9]{4}$')),
check(regexp_like(customer_join,'^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(customer_purchase,'^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(customer_mileage >= 0),
check(customer_level in ('일반', 'VIP', 'VVIP', '플래티넘'))
);

drop sequence customer_seq;

create sequence customer_seq;


insert into customer(customer_no, customer_id, customer_contact, 
								customer_join, customer_purchase, 
								customer_mileage, customer_level)
values (customer_seq.nextval, 'testuser1', '010-1212-3434', 
			'2022-01-01' ,'2022-03-11', 5500, 'VIP');
insert into customer(customer_no, customer_id, customer_contact, 
								customer_join, customer_purchase, 
								customer_mileage, customer_level)
values (customer_seq.nextval, 'testuser2', '010-2323-4545', 
			'2020-05-11' ,'2022-01-30', 7200, 'VVIP');
insert into customer(customer_no, customer_id, customer_contact, 
								customer_join, customer_purchase, 
								customer_mileage, customer_level)
values (customer_seq.nextval, 'testuser3', '010-3434-5656', 
			'2021-11-26' ,'2021-12-25', 30000, '플래티넘');
insert into customer(customer_no, customer_id, customer_contact, 
								customer_join, customer_purchase, 
								customer_mileage, customer_level)
values (customer_seq.nextval, 'testuser4', '010-4545-6767', 
			'2022-02-03' ,'2022-03-15', 500, '일반');
insert into customer(customer_no, customer_id, customer_contact, 
								customer_join, customer_purchase, 
								customer_mileage, customer_level)
values (customer_seq.nextval, 'testuser5', '010-5656-7878', 
			'2021-12-31' ,'2022-01-31', 800, '일반');

SELECT * from customer;

SELECT * from user_sequences;
