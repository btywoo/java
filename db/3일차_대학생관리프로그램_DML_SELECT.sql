use university;

# 컴퓨터 공학 고길동 학생이 수강 신청한 강의의 개수를 조회하는 쿼리
select 
	st_name, st_major, count(*) 
from 
	student join course on co_st_num = st_num 
where 
	st_name = '고길동' and st_major = '컴퓨터공학';

# 신입생을 조회하는 쿼리
select 
	* 
from 
	student 
where 
	st_num like '2024%' and st_grade = 1;

# 각 전공별 학생 수를 조회하는 쿼리
select 
	st_major '전공', count(*) '학생 수' 
from 
	student 
	group by st_major;

# 컴퓨터공학 고길동 학생이 수강 신청한 학점을 조회하는 쿼리
select 
	st_name, st_major, sum(le_point) '학점'
from 
	student 
	join course on co_st_num = st_num 
	join lecture on co_le_num = le_num 
where 
	st_name = '고길동' and st_major = '컴퓨터공학';

# 강의별 수강 신청한 학생 수를 조회하는 쿼리
select 
	le_title '강의명', count(co_st_num) '학생 수' 
from 
	course 
	join lecture on co_le_num = le_num 
    group by le_title;

# 학생이 있는 학과 이름을 조회하는 쿼리
select distinct 
	st_major 
from 
	student;
    
# 위 코드와 동일 코드
select 
	st_major 
from 
	student 
    group by st_major; 

# 홍길동 학생이 수강하는 강의 목록을 조회하는 쿼리
select distinct 
	st_name '이름', le_title '강의명' 
from 
	student 
    join course on co_st_num = st_num 
	join lecture on co_le_num = le_num 
where 
	st_name = '홍길동';
    
# 김 교수가 강의하는 강의명을 조회하는 쿼리
select distinct
	le_title 강의명 
from 
	lecture join professor on pr_num = le_pr_num 
where 
	pr_name = '김교수';
