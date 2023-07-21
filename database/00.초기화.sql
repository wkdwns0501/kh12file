----------------------------------------------------
-- 테이블 전체 초기화 스크립트
-- 테이블이 없으신 분들은 이 스크립트를 전체 실행하시면 됩니다.
----------------------------------------------------

drop table worldcup;
create table worldcup(
rank number,
name varchar2(30),
nation varchar2(30),
goal number
);

drop table medalist;
create table medalist(
name varchar2(21),
event varchar2(12),
type varchar2(30),
gold number,
silver number,
bronze number
);

DROP TABLE plan;
CREATE TABLE plan(
telecom char(2),
name varchar2(60),
month_price number,
DATA number,
CALL number,
sms number
);

DROP TABLE menu;
CREATE TABLE menu(
name varchar2(60),
TYPE varchar2(9),
price number,
event char(1)
);

drop table pocketmon;
create table pocketmon(
no number primary key,
name varchar2(30) not null,
type varchar2(9) not null
);

INSERT INTO POCKETMON(NO,name,type) 
VALUES(1, '이상해씨', '풀');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(4, '파이리', '불꽃');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(7, '꼬부기', '물');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(25, '피카츄', '전기');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(26, '라이츄', '전기');

commit;

---
drop table score;
create table score(
grade number not null check(grade >= 1),
room number not null check(room >= 1),
name varchar2(21) not null check(regexp_like(name,'^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100),
unique(grade, room, name)
);

INSERT INTO score(grade, room, name, korean, english, math)
values(1, 1, '마리오', 50, 60, 50);
INSERT INTO score(grade, room, name, korean, english, math)
values(1, 1, '루이지', 60, 90, 50);
INSERT INTO score(grade, room, name, korean, english, math)
values(1, 2, '쿠파', 70, 70, 80);
INSERT INTO score(grade, room, name, korean, english, math)
values(1, 2, '요시', 80, 85, 35);
---
CREATE TABLE account(
account_owner varchar2(21),
account_period NUMBER,
account_count NUMBER,
account_payment NUMBER,
account_balance NUMBER
);

INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
VALUES('유재석', 3, 15, 1000000, 15000000);
INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
VALUES('강호동', 2, 5, 500000, 2500000);
INSERT INTO account(account_owner, account_period, account_count, account_payment, account_balance)
VALUES('신동엽', 2, 8, 800000, 10000000);
---
drop table board;
create table board(
board_no number primary key check(board_no > 0),
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2(20) 
	check(regexp_like(board_writer, '^[A-Za-z0-9]{8,20}$')),
board_readcount number default 0 not null check(board_readcount >= 0)
);
---
drop table emp;
create table emp(
emp_no number primary key,
emp_name varchar2(21) not null
	check(regexp_like(emp_name, '^[가-힣]{2,7}$')),
emp_salary number not null check(emp_salary >= 0),
emp_join date default sysdate not null
);

-- 시간은 문자열 처럼도 넣을 수 있다(단, 국가별로 형식이 다름)
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(1, '김사장', 100000000, '2001-01-01');

-- 문자열을 변환 명령을 써서 넣을 수도 있다
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(2, '최상무', 80000000, to_date('2001-02-01', 'yyyy-MM-dd'));

-- 현재 시간을 구해서 넣어야 할 때는 sysdate라는 항목을 사용
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(3, '박전무', 75000000, sysdate);

insert into emp(emp_no, emp_name, emp_salary)
values(4, '이부장', 50000000);

commit;
---
drop table member;
create table member(
member_id varchar2(25) primary key,
member_pw varchar2(20) not null,
member_nickname varchar2(30) not null,
member_birth char(10) not null unique,
member_email varchar2(100),
member_contact varchar2(11) not null,
member_level varchar2(9) default '일반' not null,
member_point number default 0 not null,
member_join date default sysdate not null,
check(regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$')),
check(
	regexp_like(member_pw, '[A-Z]+') 
	and
	regexp_like(member_pw, '[a-z]+')
	and
	regexp_like(member_pw, '[0-9]+')
	and
	regexp_like(member_pw, '[!@#$]+')
	and
	regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,20}$')
),
check(regexp_like(member_nickname, '^[A-Za-z0-9가-힣]{2,10}$')),
check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(member_contact, '^01[016789][1-9][0-9]{2,3}[0-9]{4}$')),
check(member_level in ('일반', 'VIP', '관리자')),
check(member_point >= 0)
);

insert into member(
	member_id, member_pw, member_nickname, 
	member_birth, member_email, member_contact
)
values(
	'testuser1', 'Testuser1!', '테스트유저1', 
	'2023-07-19', null, '01012345678'
);
commit;
---
drop table item;
create table item(
item_no number primary key,
item_name varchar2(60) not null,
item_price number not null
);
drop sequence item_seq;
create sequence item_seq;
---
drop table customer;
create table customer(
customer_no number primary key,
customer_id varchar2(20) not null unique,
customer_contact char(13) not null unique,
customer_join char(10) not null,
customer_purchase char(10) not null,
customer_mileage number,
customer_level varchar2(12) not null,
check(regexp_like(customer_id, '^[a-z0-9]{8,20}$')),
check(regexp_like(customer_contact, '^010-[0-9]{4}-[0-9]{4}$')),
check(regexp_like(customer_join, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(customer_purchase, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(customer_mileage >= 0),
check(customer_level in ('일반', 'VIP', 'VVIP', '플래티넘'))
);

drop sequence customer_seq;
create sequence customer_seq;
insert into customer(
	customer_no, customer_id, customer_contact,
	customer_join, customer_purchase,
	customer_mileage, customer_level
)
values(
	customer_seq.nextval, 'testuser1', '010-1212-3434',
	'2022-01-01', '2022-03-11', 5500, 'VIP'
);

insert into customer(
	customer_no, customer_id, customer_contact,
	customer_join, customer_purchase,
	customer_mileage, customer_level
)
values(
	customer_seq.nextval, 'testuser2', '010-2323-4545',
	'2020-05-11', '2022-01-30', 7200, 'VVIP'
);

insert into customer(
	customer_no, customer_id, customer_contact,
	customer_join, customer_purchase,
	customer_mileage, customer_level
)
values(
	customer_seq.nextval, 'testuser3', '010-3434-5656',
	'2021-11-26', '2021-12-25', 30000, '플래티넘'
);

insert into customer(
	customer_no, customer_id, customer_contact,
	customer_join, customer_purchase,
	customer_mileage, customer_level
)
values(
	customer_seq.nextval, 'testuser4', '010-4545-6767',
	'2022-02-03', '2022-03-15', 500, '일반'
);

insert into customer(
	customer_no, customer_id, customer_contact,
	customer_join, customer_purchase,
	customer_mileage, customer_level
)
values(
	customer_seq.nextval, 'testuser5', '010-5656-7878',
	'2021-12-31', '2022-01-31', 5500, '일반'
);
commit;
---
drop table book;
drop sequence book_seq;
create table book(
book_id number primary key,
book_title varchar2(300),
book_author varchar2(90),
book_publication_date char(10),
book_price number(*,2),
book_publisher varchar2(90),
book_page_count number,
book_genre varchar2(30),
check(regexp_like(book_author, '[^!@#$]+')),
check(book_price >= 0),
check(book_page_count > 0),
check(regexp_like(book_publication_date, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$'))
);
create sequence book_seq;

INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99, 'Scholastic', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99, 'Grand Central Publishing', 336, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 12.99, 'Scribner', 180, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, '1984', 'George Orwell', '1949-06-08', 10.99, 'Secker & Warburg', 328, 'Dystopian');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Pride and Prejudice', 'Jane Austen', '1913-01-28', 9.99, 'Penguin Classics', 432, 'Romance');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 15.99, 'Houghton Mifflin Harcourt', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99, 'Little, Brown and Company', 224, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 29.99, 'Allen & Unwin', 1178, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To the Lighthouse', 'Virginia Woolf', '1927-05-05', 13.99, 'Harcourt, Brace and Company', 209, 'Modernist');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Alchemist', 'Paulo Coelho', '1988-06-01', 9.99, 'HarperOne', 208, 'Fiction');
commit;
---
create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');
commit;
---
-- kpop_song_no 시퀀스 생성
DROP SEQUENCE kpop_song_seq;
CREATE SEQUENCE kpop_song_seq;

-- kpop_song 테이블 생성
DROP TABLE kpop_song;
CREATE TABLE kpop_song (
  kpop_song_no NUMBER PRIMARY KEY,
  kpop_song_title VARCHAR2(300) NOT NULL,
  kpop_song_artist VARCHAR2(300) NOT NULL,
  kpop_song_album VARCHAR2(300) NOT NULL,
  kpop_song_playcount NUMBER DEFAULT 0 NOT NULL CHECK(kpop_song_playcount >= 0),
  kpop_song_likecount NUMBER DEFAULT 0 NOT NULL CHECK(kpop_song_likecount >= 0)
);


-- 데이터 추가 구문은 제공해 드립니다. (PL/SQL 구문)
BEGIN
  FOR i IN 1..1000 LOOP
    INSERT INTO kpop_song (
      kpop_song_no,
      kpop_song_title,
      kpop_song_artist,
      kpop_song_album,
      kpop_song_playcount,
      kpop_song_likecount
    ) VALUES (
      kpop_song_seq.NEXTVAL,
      'Sample Title ' || i,
      'Sample Artist ' || i,
      'Sample Album ' || i,
      ROUND(DBMS_RANDOM.VALUE(10, 99999)), -- 재생 횟수 (10 이상 10만 미만)
      ROUND(DBMS_RANDOM.VALUE(10, 49999)) -- 좋아요 수 (10 이상 5만 미만)
    );
  END LOOP;
  COMMIT;
END;
