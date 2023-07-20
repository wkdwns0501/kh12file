------------------------------------------------------
-- 서브쿼리 (sub query)
------------------------------------------------------
-- 여러 개의 구문을 순차적으로 실행하도록 만드는 기술

-- (ex) 가장 비싼 금액의 상품 정보를 조회
select max(price) from product;
select * from product where price = 3000; 

-- 위의 예제를 서브쿼리로 변환하면 아래와 같다
select * from product where price = (
 select max(price) from product
); 

-- (Q) 가장 최근에 제조된 상품 정보
select * from product where made = (
	select max(made) from product
);
-- (Q) 가격이 가장 저렴한 책 정보
select * from book where book_price = (
	select min(book_price) from book
);

-- 가격이 비싼 순서로 3개만 조회

-----------------------------------------------
-- TOP N Query (자료사이트 참고)
-----------------------------------------------
-- 서브쿼리를 사용하여 데이터를 원하는 구간만큼 끊어내는 구문
-- 오라클은 rownum이라는 값을 조회 시 사용할 수 있다
-- rownum은 조회 결과에 순서를 부여한다

-- 공식
/*
select * from (
	select rownum rn, TMP.* from (
		원하는 순서로 정렬하는 구문
	)TMP
) where rn between 시작 and 종료;
 */

-- (Q) 상품을 번호순으로 3개만 조회
-- select * from product where no <= 3 order by no asc;
-- (Q) 상품을 가격이 저렴한순으로 3개만 조회

select * from product order by price asc;
select * from product order by price desc;
select * from product order by no asc;
-- 해석 순서    3번 4번을 바꿔야한다
-- 1   /				3			 /			2        /            4 		
select rownum, product.* from product order by price asc;
select rownum, product.* from product order by price desc;
select rownum, product.* from product order by no asc;

-- 정렬을 먼저하고 rownum을 나중에 붙이도록 구조 개선
select rownum, TMP.* from(
	select * from product order by no asc
)TMP where rownum <= 3;

-- 문제점 : 중간부터는 조회가 안된다
select rownum, TMP.* from(
	select * from product order by no asc
)TMP where rownum between 3 and 5;

-- 해결책 : rownum을 모두 붙인 다음 조회하도록 서브쿼리 추가
-- 문제점 : rownum은 select마다 생긴다
select * from (
	select rownum, TMP.* from(
		select * from product order by no asc
	)TMP
) where rownum between 3 and 5;

-- 해결책 : 두 번째 select에서 발생한 rownum에 별칭을 부여
-- TOP N Query 공식!
--------------------------------------------------------------
select * from (
	select rownum rn, TMP.* from(
		select * from product order by no asc 
	)TMP
) where rn between 3 and 5;	  
-- 3번째 줄과 5번째줄 숫자 부분만 바꿔서 공식처럼 쓴다
--------------------------------------------------------------

-- (Q) 가격이 가장 비싼 책 Top 5 조회
select * from (
	select rownum rn, TMP.* from(
		select * from book order by book_price desc 
	)TMP
) where rn between 1 and 5;	 

-- (Q) 제목이 가장 짧은 책 Top 3 조회
select * from (
	select rownum rn, TMP.* from(
		select * from book order by length(book_title) asc 
	)TMP
) where rn between 1 and 3;	 

-- (Q) 출간한지 가장 오래된 책 6등 ~ 10등 조회
select * from (
	select rownum rn, TMP.* from(
		select * from book order by book_publication_date asc 
	)TMP
) where rn between 6 and 10;	 
