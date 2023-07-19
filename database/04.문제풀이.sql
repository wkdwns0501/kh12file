-- <1번 문제>
-- 테이블 생성
DROP TABLE score;
CREATE TABLE score(
grade NUMBER(1),
room NUMBER,
name varchar2(21),
korean NUMBER(3),
english NUMBER(3),
math number(3)
);
-- 데이터 등록
INSERT INTO SCORE(grade,class,name,korean,english,math)
values(1, 1, '마리오', 50, 60, 50);
INSERT INTO SCORE(grade,class,name,korean,english,math)
values(1, 1, '루이지', 60, 90, 50);
INSERT INTO SCORE(grade,class,name,korean,english,math)
values(1, 2, '쿠파', 70, 70, 80);
INSERT INTO SCORE(grade,class,name,korean,english,math)
values(1, 2, '요시', 80, 85, 35);
-- 데이터 조회
SELECT * FROM score;
-- 데이터 삭제
DELETE FROM score WHERE english < 80;
-- 데이터 영구 저장
COMMIT;

-- <2번 문제>
-- 테이블 생성  -- 이름을 만들다보면 쓸 수 없는 단어가 있다 (예약어)
-- 테이블 이름을 앞에 붙여 쓰면 문제가 사라진다
DROP TABLE account;
CREATE TABLE account(
account_owner varchar2(21),
account_period NUMBER,
account_count NUMBER,
account_payment NUMBER,
account_balance number
);
-- 데이터 등록
INSERT INTO account(account_owner,account_period,account_count,account_payment,account_balance)
values('유재석', 3, 15, 1000000, 15000000);
INSERT INTO account(account_owner,account_period,account_count,account_payment,account_balance)
values('강호동', 2, 5, 500000, 2500000);
INSERT INTO account(account_owner,account_period,account_count,account_payment,account_balance)
values('신동엽', 2, 8, 800000, 10000000);
-- 데이터 조회
SELECT*FROM account;
-- 데이터 삭제
DELETE FROM account WHERE name = '신동엽';
-- 데이터 영구 저장
COMMIT;
