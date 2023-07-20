-----------------------------------------
-- 수정(update)
-----------------------------------------
-- 이미 존재하는 데이터의 값을 바꾸는 작업
-- 개인정보변경, 조회수증가, 구독/해지, 좋아요, 게시글수정, ...

-- update 테이블이름 set 변경내용 [조건];
drop table product;
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


-- 모든 상품의 가격을 0으로 변경
update product set price = 0;

update product set price = 0 where type='과자';
update product set price = 0 where type='생필품';

update product set price = 0, name = '증정품' where type='과자';

--(Q) 1번 상품의 가격을 1500원으로 변경
update product set price = 1500 where no = 1;
--(Q) 스크류바의 가격을 2000원으로 변경
update product set price = 2000 where name = '스크류바';
--(Q) 멘토스의 가격을 1000원으로 변경하고 분류를 과자로 변경
update product set price = 1000, type = '과자' where name = '멘토스';
-- (참고) 오라클에는 누적 연산이 없다
--(Q) 과자의 가격을 500원 할인
update product set price = price - 500 where type = '과자'; 
--(Q) 아이스크림의 가격을 10% 인상
update product set price = price * 1.1 where type = '아이스크림';

-- 지금까지의 작업을 무효화 시키겠다
rollback;

-- 지금까지의 작업을 확정 저장하겠다
commit;

select * from product;
