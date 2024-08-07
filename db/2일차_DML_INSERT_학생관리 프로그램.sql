# 1학년 1반 2번 둘리 학생 추가
insert into student(grade, class, num, name) value(1, 1, 2, '둘리');
# 1학년 1학기 영어 과목 추가
# 1학년 1학기 수학 과목 추가
insert into subject(grade, semester, name) value(1, 1, '영어'), (1, 1, '수학');
# 1학년 1반 1번학생의 영어 성적 추가(중간 : 80, 기말 : 100, 수행 100)
# 1학년 1반 1번학생의 수학 성적 추가(중간 : 100, 기말 : 100, 수행 80)
# 1학년 1반 2번학생의 국어 성적 추가(중간 : 50, 기말 : 100, 수행 80)
# 1학년 1반 2번학생의 영어 성적 추가(중간 : 100, 기말 : 100, 수행 100)
# 1학년 1반 2번학생의 수학 성적 추가(중간 : 50, 기말 : 50, 수행 50)
insert into score(midterm, final, performance, studentNum, subjectNum) value(80, 100, 100, 6, 2);
insert into score(midterm, final, performance, studentNum, subjectNum) value(100, 100, 80, 6, 3);
insert into score(midterm, final, performance, studentNum, subjectNum) value(50, 100, 80, 7, 1);
insert into score(midterm, final, performance, studentNum, subjectNum) value(100, 100, 100, 7, 2);
insert into score(midterm, final, performance, studentNum, subjectNum) value(50, 50, 50, 7, 3);