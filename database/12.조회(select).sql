/*
	조회(SELECT)
	- 테이블의 데이터를 원하는 목적에 맞게 선택적으로 조회
*/

-- 샘플 데이터
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

-- 기본 조회
select * from product;

-- 이름만 조회
select name from product;
-- 이름과 가격만 조회
select name, price from product;
-- 없는 항목은 조회할 수 없다
-- select name, price, point from product; -- point가 없어서 조회 불가

-- 항목을 계산해서 조회할 수 있다
-- 날짜 계산 시 기본 처리 단위는 '일'이다
select name, expire-made+1 from product;

-- 조회한 항목에 표시될 이름을 지정할 수 있다 (별칭 설정)
-- 별칭에 띄어쓰기가 있는 경우에는 쌍따옴표로 감싸서 처리
select name "이름", expire-made+1 "유통기한" from product;

------------------------------------------------------------------
-- 조건(where) : 조회 결과를 원하는 상황으로 필터링
------------------------------------------------------------------
select * from product;
-- 2000원 이상인 상품 정보 조회
select * from product where price >= 2000;
-- 1000원 이상 2000원 이하인 상품 정보 조회
select * from product where price >= 1000 and price <= 2000;
select * from product where price between 1000 and 2000;

-- 오라클에서는 같다가 = 로 표현된다
select * from product where price = 1000

select * from product where price != 1000;
select * from product where price <> 1000;

-- <문자열 조건>
-- 문자열도 같음을 = 로 처리한다
-- 유사 검색은 like와 instr()로 처리할 수 있다
-- 시작검색만큼은 반드시 like로 써야할 정도로 압도적인 차이가 발생함
-- 나머지 성능은 instr()이 좋다 , 복잡한 검색은 like로 가능
-- like 는 자바의 startWith (~시작하는지 판정)
-- instr은 자바의 Indexof (위치가 나오기 때문에 문자열 전체 검사후 판정, 
--										없으면 0, 시작은 1부터)
-- 일부분만 검사해야되는 상황이면 like 가 성능이 좋고
-- 전체를 검사해야되는 상황이면 instr() 이 성능이 좋다
-- 그래서 시작검색이 아닌 경우면 거의 instr()을 쓴다
select * from product where name = '스크류바';

select * from product where name like '스크%'; 	
select * from product where instr(name,'스크') = 1; 

select * from product where name like '%이%';
select * from product where instr(name,'이') > 0;

select * from product where name like '오%오';

-- (Q) 과자와 아이스크림만 조회 (or 잘안씀)
select * from product where type = '아이스크림' or type = '과자';
select * from product where type in('과자', '아이스크림');
-- (Q) 이름에 '초코' 가 들어간 상품 정보 조회 (instr이 좋음)
select * from product where name like '%초코%';
select * from product where instr(name,'초코') > 0;
-- (Q) 이름이 '바나나'로 시작하는 상품 정보 조회 (like가 좋음)
select * from product where name like '바나나';
select * from product where instr(name,'바나나') = 1;
-- (Q) 이름에 '이'가 들어있지 않은 상품 정보 조회
select * from product where name not like '%이%';
select * from product where instr(name,'이') = 0;
select * from product where not instr(name,'이') > 0;
-- (Q) 가격이 1000원 이상인 과자를 조회
select * from product where price >= 1000 and type = '과자';

-- <날짜 조건>
-- 기본 형식은 yyyy-mm-dd hh24:mi:ss 이다 (그냥 hh면 12시간 방식)
-- 문자열로 간주하고 조회할 수 있다 (운영체제에 따라 작동여부 결정)
-- 문자열로 변환하고 싶다면 to_char() 사용
-- 날짜 추출용 함수인 extract()를 사용하여 원하는 항목을 추출
-- to_char : 문자열로 변환, to_date : 날짜로 변환 설명, 
-- 날짜는 문자열로 변환 가능

-- 2020년에 제조된 상품 조회
-- select * from product where made like '2020%'; -- 실행안됨
select * from product where to_char(made, 'yyyy') = '2020'; 
		-- 문자열로 변환하기 때문에 2020 숫자가 들어가면안된다
select * from product where extract(year from made) = 2020;
		-- extract는 숫자로 반환한다
select * from product where  
	made between 	  --extract이랑 기능은 같지만 더 세밀하게 설정이 가능하다
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		to_date('2020-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss')
		;  
