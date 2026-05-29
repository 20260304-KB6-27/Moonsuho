-- DDL (Data Definition Language)
-- 데이터베이스 구조를 정의하는 언어

DROP DATABASE IF EXISTS tabledb;

CREATE DATABASE tabledb;

use tabledb;

drop table if exists usertbl;

create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthYear int         not null,
    addr      char(2)     not null,
    mobile1   char(3)     null,
    mobile2   char(8)     null,
    height    smallint    null check (height<500),
    mDate     date        default (now())
);

drop table if exists buytbl;
create table buytbl
(
    num       int auto_increment
        primary key,
    userID    char(8)  not null,
    prodName  char(6)  not null,
    groupName char(4)  null,
    price     int      not null,
    amount    smallint not null

-- FOREIGN KEY (현재 테이블 컬럼명)
       -- REFERENES 참조할 테이블명(참조할 칼럼명)
#     constraint buytbl_ibfk_1
#         foreign key (userID) references usertbl (userID)
);

-- 테이블 구조 병경
ALTER TABLE buytbl
ADD CONSTRAINT fk_usertbl_buytbl
foreign key (userID) -- 외래키로 설정할 칼럼
references usertbl(userID); -- 참조할 부모 테이블 (칼럼)
