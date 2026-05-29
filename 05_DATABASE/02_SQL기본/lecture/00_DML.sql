-- DML
-- 데이터 값을 삽입, 수정, 삭제하는 SQL문

-- INSERT
insert into
    employees
values (2,20260522,'수호','문','M',20260304);

select * from employees limit 2;


insert into
    employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
values
    (3,20260522,'영희','문','F',20260304),
    (4,20260522,'철수','문','M',20260304);

-- 칼럼을 명시하면 Insert시 데이터 순서를 바꾸는 것도 가능
insert into
    employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
values
    (5,20260522,'영희','문','F',20260304);

-- UPDATE
-- 테이블에 기록된 컬럼의 값을 수정하는 구문
update
    employees
set
    last_name = '이',
    first_name = '종원'
where
    last_name = '종원';

-- DELETE
-- 테이블 행을 삭제
delete
from employees
where first_name='suho';