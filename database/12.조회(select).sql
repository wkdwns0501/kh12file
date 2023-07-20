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
		-- 문자열로 변환하기 때문에 숫자 2020이 들어가면 안된다
select * from product where extract(year from made) = 2020;
		-- extract는 숫자로 반환한다
select * from product where  
	made between 	  --extract이랑 기능은 같지만 더 세밀하게 설정이 가능하다
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		to_date('2020-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss')
		;  
		
-- (Q) 여름(6, 7, 8)월에 생산한 상품 정보 조회
select * from product where to_char(made, 'mm') in ('06', '07', '08');
select * from product where extract(month from made) between 6 and 8;
select * from product where 
	made between 	  
		to_date('2020-06-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		to_date('2020-08-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss')
		;
-- (Q) 2019년 하반기에 생산한 상품 정보 조회
select * from product 
	where to_char(made, 'yyyy-mm') 
		in ('2019-07', '2019-08', '2019-09', '2019-10', '2019-11', '2019-12');
select * from PRODUCT 	
	where extract(year from made) = 2019
		and extract(month from made) between 7 and 12;
select * from product 
	where made between 	  
		to_date('2019-07-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		to_date('2019-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss')
		;
-- (Q) 2020년 부터 현재까지 생산한 상품 정보 조회
select * from product 
	WHERE made between 	  
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		sysdate
		;
-- (Q) 최근 1년간 생산한 상품 정보 조회
-- 오라클 날짜는 기본 계산 단위가 (일) 이다
-- 따라서 1년전은 sysdate - 365 이다
select * from product
	where made between sysdate-365 and sysdate;

-- (응용) 시간까지 고려 (시작일 00시 부터 종료일 23시59분까지)
select * from product 
	WHERE made between 	  
		to_date(
			to_char(sysdate-365, 'yyyy-mm-dd') || ' ' || '00:00:00',
			'yyyy-mm-dd hh24:mi:ss' )
		and 
		to_date(
			to_char(sysdate, 'yyyy-mm-dd') || ' ' || '23:59:59', 
			'yyyy-mm-dd hh24:mi:ss' );
		
-------------------------------------------------------
-- 정렬 (Order)
-------------------------------------------------------
-- 모든 조회가 끝나고 나온 결과를 원하는 목적에 따라 재배열
-- asc(오름차순, ascending) , desc(내림차순, desending)
-- 정렬을 따로 지정하지 않겠다 (비추천)
select * from product;

select * from product order by no; -- 안쓰면 오름차순
select * from product order by no asc;
select * from porduct order by no desc;

-- 2차 정렬
select * from product order by price desc, no asc; 
	-- 가격순으로 내림차순하고 , 같은게있다면 번호순으로 오름차순 해라

-- (Q) 최근에 제조된 상품부터 출력
select * from product order by made desc;
  -- 번호가 시퀀스라면 아래코드도 가능
  -- select * from product order by no desc;

-- (Q) 폐기일이 오래된 상품부터 출력
select * from product order by expire asc;

-- (Q) 이름순으로 출력 (통상적으로 오름차순), 추가 - 이름이같으면 번호순까지
select * from product order by name asc, no asc;

-- (Q) 상품을 종류별로 가격이 비싼 순으로 출력, 추가 - 번호순까지
select * from product order by type asc, price desc, no asc;

-- (Q) 유통기한이 가장 짧은 상품부터 출력, 추가 - 번호순까지
select * from product order by expire-made+1 asc, no asc;

-- 부여한 별칭으로 정렬 가능
-- 테이블에도 별칭 부여가 가능하다
-- * 는 다른 항목과 같이 쓸 수 없고 테이블 이름에 .* 를 추가하여 사용
select p.*, expire-made+1 유통기한
from product p order by 유통기한 asc, no asc;


