-- number(자리)를 안쓰면 38자리, 안쓰는게 기본이다
-- varchar2(글자수) - 한글 한글자는 x3
-- char(글자수) - 고정 문자열, varchar보다 빠름
-- 문제 1 : 월드컵 선수 정보
DROP TABLE WORLDCUP;
CREATE TABLE worldcup(
no number(4),
name varchar2(30),
country varchar2(15),
goal number(3)
); 

-- 문제 2 : 메달리스트 정보
DROP TABLE MEDALIST;
CREATE TABLE medalist(
name varchar2(21),
event varchar2(30),
type varchar2(30),
gold number,
silver number,
bronze number
);

-- 문제 3 : 통신사 요금제 정보
-- 통신사가 무조건 2자리라면 고정문자열 처리 (char)
-- 장점 : 빠른 처리 속도
-- 단점 : 글자 수가 다를 수 없음
DROP TABLE PLAN;
CREATE TABLE plan(
company char(2),
name varchar2(60),
fee NUMBER,
data NUMBER,
call NUMBER,
sms NUMBER
);

-- 문제 4 : 커피숍 메뉴 정보
-- (참고) 테이블 자료형에는 논리가 없다 
-- number → 1 or 0 , char(1) → Y or N 
DROP TABLE MENU;
CREATE TABLE menu(
name varchar2(60),
TYPE varchar2(9),
price number,
event char(1)
);
