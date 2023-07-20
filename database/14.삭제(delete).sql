----------------------------------------------------
-- 삭제(delete)
----------------------------------------------------
-- 데이터베이스에 저장된 값을 영구적으로 제거하는 것
-- commit / rollback의 영향을 받음

-- delete [from] 테이블이름 [조건]

-- 전부다 삭제(비추천)
delete product;

-- (Q) 1번 상품 정보 삭제 (primary키를 가지고 삭제하는 경우가 제일 많다)
delete product where no = 1;

-- (Q) 과자와 아이스크림 상품 정보 삭제
delete product where type = '과자' or type = '아이스크림';
delete product where type in ('과자', '아이스크림');

-- (Q) 2020년 상반기에 생산한 상품 정보 삭제
delete product 
	where made between
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') 
		and 
		to_date('2020-06-30 23:59:59', 'yyyy-mm-dd hh24:mi:ss') 
		;

rollback;

select * from product;
