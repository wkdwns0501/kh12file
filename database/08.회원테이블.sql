--다음 요구사항에 따라 회원(member) 테이블을 구현하시오.

-- check 를 아예 밑으로 빼도 된다
-- (주의) 오라클에는 긍정탐색, 부정 탐색이 없다
drop table member;
create table member(
member_id varchar2(25) primary key ,
member_pw varchar2(25) not null ,
member_nickname varchar2(30) not null ,
member_birth char(10) not null unique,
member_email varchar2(100),
member_contact varchar(11) not null, 
member_level varchar2(9) default '일반' not null,
member_point number default 0 not null,
member_join date default sysdate not null,
check(regexp_like(member_id,'^[a-z][a-z0-9]{7,24}$')),
check (
	regexp_like(member_pw,'[A-Z]+')
	and
	regexp_like(member_pw,'[a-z]+')
	and
	regexp_like(member_pw,'[0-9]+')
	and
	regexp_like(member_pw,'[!@#$]+')
	and
	regexp_like(member_pw,'^[A-Za-z0-9!@#$]{8,20}$')
	),
check(regexp_like(member_nickname,'^[A-Za-z0-9가-힣]{2,10}$')),
check(regexp_like(member_birth,'^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(member_contact,'^01[016789][1-9][0-9]{2,3}[0-9]{4}$')),
check(member_level in ('일반', 'VIP', '관리자')),
check(member_point >= 0)
);

insert into member (member_id,member_pw,member_nickname,member_birth
			,member_email,member_contact)
values ('testuser1234', 'Testpw1234!','테스트', '2001-01-02', null, '01012345678');
		
insert into member (member_id,member_pw,member_nickname,member_birth
			,member_email,member_contact,member_level,member_point,member_join)
values ('testuser123', 'Testpw123!','테스트닉네임', '2001-01-01'
			,'testemail@naver.com', '01012341234', '관리자',100, to_date('03 : 30','hh : mi'));

select * from member;
