# Chapter 03. SQL 기초

SQL 학습에 사용할 마당서점 예제

오라클 설치와 기본 사용법

SQL 소개

데이터 조작어–검색

데이터 정의어

데이터 조작어–삽입\, 수정\, 삭제

SQL의 개념과 주요 명령어를 알아본다\.

SELECT 문으로 질의를 처리하는 방법을 알아본다\.

집계 함수와 GROUP BY 문으로 질의를 처리하는 방법을 알아본다\.

두 개 이상의 테이블을 조회하여 질의를 처리하는 방법을 알아본다\.

DDL로 테이블의 구조를 정의하고 변경하는 방법을 알아본다\.

DML로 데이터를 삽입\, 수정\, 삭제하는 방법을 알아본다\.

# 01. SQL 학습에 사용할 마당서점 예제

마당서점의 데이터

누가 어떤 정보를 원하는가?

오라클과 샘플 데이터 설치

# 1.1 마당서점의 현황과 운영 시스템 환경

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_0.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_1.jpg)

# 1.2 마당서점의 데이터

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_2.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_3.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_4.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_5.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_6.jpg)

# 1.3 사용자별 요구 정보

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_7.jpg)

# 02. 오라클 설치와 기본 사용법



* 오라클  <span style="color:#ff0000">18c </span>  <span style="color:#ff0000">XE\(Express </span>  <span style="color:#ff0000">Edition\) </span> 설치\(부록 A 참조\)
  * 오라클 DBMS를 내려받아 설치함 =>  [https](https://www.oracle.com/kr/database/technologies/xe-downloads.html)[://](https://www.oracle.com/kr/database/technologies/xe-downloads.html)[www\.oracle\.com/kr/database/technologies/xe\-downloads\.html](https://www.oracle.com/kr/database/technologies/xe-downloads.html)\(C:\\app\\\(사용자\)\\product\\18\.0\.0\\dbhomeXE 폴더\)
  * 시스템 관리자 계정 : system\, 비밀번호 : Manager1  \(비밀번호에 대문자와 숫자가 필요\)
  * \[시작\]\-\[Oracle\-OraDB18\_home1\]\-\[응용 프로그램 개발\] 메뉴에 포함된 SQL Plus 프로그램 사용 가능
  * <span style="color:#0000cc"> __<__ </span>  <span style="color:#0000cc"> __여기서 잠깐__ </span>  <span style="color:#0000cc"> __> __ </span> 오라클 18c 설치 소요시간 오라클 18c 버전은 설치 파일이 용량이 2G가 넘기 때문에 다운로드부터 설치까지 수분~수십분 이상이 소요
  * <span style="color:#0000cc"> __<__ </span>  <span style="color:#0000cc"> __여기서 잠깐__ </span>  <span style="color:#0000cc"> __> __ </span> 설치에 문제가 생기는 여러 원인들  컴퓨터 이름이 한글로 되어 있을 떄오라클을 한번 설치한 적이 있을 경우 \- oracle home 에서 \./deinstall/deinstall 실행– regedit를 이용하여 기록을 삭제\(방법 명령창에서 “sc delete OracleServiceXE” 를 수행\)


| <span style="color:#000000">오라클버전</span>  <span style="color:#000000"> </span> | <span style="color:#000000"> </span> |
| :-: | :-: |
| <span style="color:#ff0000"> __18c __ </span>  <span style="color:#ff0000"> __XE __ </span>  <span style="color:#ff0000"> __\(Express Edition\)__ </span> | <span style="color:#000000">무료버전</span> |

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_8.png)



* 샘플 데이터베이스 설치\(부록 B\.3~B4 참조\)
    * madang 데이터베이스\(본 교재에서 사용하는 데이터베이스\)
    * madang 사용자 계정 및 샘플 데이터베이스 설치 : B\.3
    * \(스크립트를 실행한다  \-  <span style="color:#0000cc">demo\_madang\.sql</span> \)
* emp\(employee\) 데이터베이스\(오라클에서 만들어 교육용으로 사용하는 데이터베이스\)
    * 사용자 계정은 scott  : B\.4
    * 예제로 emp와 dept 테이블 포함
    * \(스크립트를 실행한다  \-  <span style="color:#0000cc">demo\_scott\.sql</span> \)
    * 이전 버전들에서는 scott 계정이 기본으로 설치되어있는 경우가 있다\. \(계정 사용\(해제\) 명령 : ALTER USER c\#\#scott ACCOUNT UNLOCK\)
* SQL Developer 설치\(부록 B\.1 참조\)
  * 오라클 홈페이지에서 본인의 환경에 맞는 버전 다운로드하여 설치


# SQL Plus

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_9.png)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_10.png)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_11.jpg)

# 1.2 마당서점의 데이터



* SQL 문을 작성할 때 주로 사용하는 명령어\.
  * \<Tip> SQL Plus에서 사용하는 명령어에 관한 자세한 설명은 다음의 링크를 참고한다\.
    * http://docs\.oracle\.com/cd/E11882\_01/server\.112/e16604/ch\_twelve001\.htm \</Tip>
  * \-데이터베이스 접속 :  <span style="color:#ff0000">conn</span>
    * \[예\] conn scott/tiger : scott 계정에 비밀번호 tiger로 접속
  * \- 명령어 실행 :  <span style="color:#ff0000">run</span> \,  <span style="color:#ff0000">/</span>
    * \[예\] run : 바로 전에 실행했던 명령어를 다시 실행
    * \[예\] / : run과 같은 의미
  * \- 명령어 찾기 :  <span style="color:#ff0000">list</span>
    * \[예\] list : 마지막에 수행했던 명령어를 출력한다\. 직전 명령줄이 길 경우 편리
  * \- 메모장을 이용하여 명령어 작성 및 실행하기 :  <span style="color:#ff0000">ed</span>  <파일이름>\,  <span style="color:#ff0000">run</span>  <파일이름>
    * \[예\] ed test : test\.sql 이름의 파일이 메모장을 이용하여 작성할 수 있도록 열림
    * \[예\] start test : test\.sql 이름에 저장된 명령어 스크립트가 실행
    * \[예\] @ test : start test와 같은 의미
  * \- 출력 모양을 조절하는 명령 :  <span style="color:#ff0000">column</span>
    * \[예\] column bookname format a20 : bookname을 길이 20의 문자 포맷으로 출력
    * \[예\] column price format 999999 : price를 길이 6개의 숫자 포맷으로 출력


# SQL Developer



* SQL Developer 설치
  * 오라클에서 내려받아 설치함 =>  [https://](https://www.oracle.com/tools/downloads/sqldev-downloads.html)[www\.oracle\.com/tools/downloads/sqldev\-downloads\.html](https://www.oracle.com/tools/downloads/sqldev-downloads.html)
  * 임의의 폴더에 압축파일을 해제하고 실행은 폴더에 포함된 sqldeveloper\.exe 파일을 실행시킨다\. \(단축아이콘을 만들어두면 편리하다\)


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_12.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_13.jpg)

# 03. SQL 소개

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_14.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_15.jpg)



* SQL 기능에 따른 분류
  * 데이터 정의어\( __DDL__ \)
    * 테이블이나 관계의 구조를 생성하는 데 사용
    * CREATE\, ALTER\,  DROP 문 등이 있음\.
  * 데이터 조작어\( __DML__ \)
    * 테이블에 데이터를 검색\, 삽입\, 수정\, 삭제하는 데 사용
    * SELECT\, INSERT\, DELETE\, UPDATE 문 등이 있음\.
      * SELECT 문은 특별히 질의어\(query\)라고 함\.
  * 데이터 제어어\( __DCL__ \)
    * 데이터의 사용 권한을 관리하는 데 사용
    * GRANT\, REVOKE 문 등이 있음\.


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_16.jpg)

__예__  __\)  __  __김연아 고객의 전화번호를 __  __찾으시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_17.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_18.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_19.jpg)

# 04. 데이터 조작어 - 검색

SELECT 문

집계 함수와 GROUP BY

두 개 이상 테이블에서 SQL 질의

SELECT 문의 구성 요소

SELECT 문의 기본 문법

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_20.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_21.jpg)

SELECT 문의 기본 문법

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_22.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_23.jpg)

# SELECT 문 예제

__질의 __  __3\-1   __  __모든 도서의 이름과 가격을 __  __검색하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_24.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_25.jpg)

__질의 __  __3\-1 __  __변형__  __  __  __모든 도서의 이름과 가격을 __  __검색하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_26.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_27.jpg)

__질의 __  __3\-2   __  __모든 도서의 도서번호__  __\,  __  __도서이름__  __\, __  __출판사__  __\, __  __가격을 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_28.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_29.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_30.jpg)

__질의 __  __3\-3   __  __도서 테이블에 있는 모든 출판사를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_31.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_32.jpg)

※ 중복을 제거하고 싶으면 DISTINCT 키워드를 사용

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_33.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_34.jpg)

# 조건 검색_WHERE

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_35.jpg)

__질의 __  __3\-4   __  __가격이 __  __20\,000__  __원 미만인 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_36.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_37.jpg)

__질의 __  __3\-5   __  __가격이 __  __10\,000__  __원 이상 __  __20\,000 __  __이하인 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_38.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_39.jpg)



* 집합
  * 출판사가 ‘굿스포츠’ 혹은 ‘대한미디어’가 아닌 도서를 검색


__질의 __  __3\-6   __  __출판사가 ‘굿스포츠’ 혹은 ‘__  __대한미디어’인__  __ 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_40.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_41.jpg)

__질의 __  __3\-7   ‘__  __축구의 __  __역사’를__  __ 출간한 출판사를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_42.jpg)

__질의 __  __3\-8   __  __도서이름에 ‘__  __축구’가__  __ 포함된 출판사를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_43.jpg)

__질의 __  __3\-9   __  __도서이름의 왼쪽 두 번째 위치에 ‘__  __구’라는__  __ 문자열을 갖는 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_44.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_45.jpg)

__질의 __  __3\-10   __  __축구에 관한 도서 중 가격이 __  __20\,000__  __원 이상인 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_46.jpg)

__질의 __  __3\-11   __  __출판사가 ‘굿스포츠’ 혹은 ‘__  __대한미디어’인__  __ 도서를 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_47.jpg)

# 검색 결과의 정렬_ORDER BY

__질의 __  __3\-12   __  __도서를 이름순으로 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_48.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_49.jpg)

__질의 __  __3\-13   __  __도서를 가격순으로 검색하고__  __\, __  __가격이 같으면 이름순으로 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_50.jpg)

__질의 __  __3\-14__  __   __  __도서를 가격의 내림차순으로 __  __검색하시오__  __\. __  __만약 가격이 같다면 출판사의 오름차순으로 __  __검색하시오__  __ __

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_51.jpg)

# 집계 함수



  * 의미 있는 열 이름을 출력하고 싶으면 속성이름의 별칭을 지칭하는 AS 키워드를 사용하여 열 이름을 부여


__질의 __  __3\-15   __  __고객이 주문한 도서의 총 판매액을 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_52.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_53.jpg)

__질의 __  __3\-16   2__  __번 김연아 고객이 주문한 도서의 총 판매액을 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_54.jpg)

__질의 __  __3\-17   __  __고객이 주문한 도서의 총 판매액__  __\, __  __평균값__  __\, __  __최저가__  __\, __  __최고가를 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_55.jpg)

__질의 __  __3\-18   __  __마당서점의 도서 판매 건수를 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_56.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_57.jpg)

# GROUP BY 검색

__질의 __  __3\-19   __  __고객별로 주문한 도서의 총 수량과 총 판매액을 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_58.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_59.jpg)

__질의 __  __3\-20   __  __가격이 __  __8\,000__  __원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 __  __                __  __총 수량을 __  __구하시오__  __\.  __  __단__  __\, __  __두 권 이상 구매한 고객만 구한다__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_60.jpg)

GROUP BY와 HAVING 절의 문법과 주의사항

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_61.jpg)

# 연습문제



* 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오\.
  * \(1\) 도서번호가 1인 도서의 이름
  * \(2\) 가격이 20\,000원 이상인 도서의 이름
  * \(3\) 박지성의 총 구매액\(박지성의 고객번호는 1번으로 놓고 작성\)
  * \(4\) 박지성이 구매한 도서의 수\(박지성의 고객번호는 1번으로 놓고 작성\)
* 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오\.
  * \(1\) 마당서점 도서의 총 개수
  * \(2\) 마당서점에 도서를 출고하는 출판사의 총 개수
  * \(3\) 모든 고객의 이름\, 주소
  * \(4\) 2014년 7월 4일~7월 7일 사이에 주문 받은 도서의 주문번호
  * \(5\) 2014년 7월 4일~7월 7일 사이에 주문 받은 도서를 제외한 도서의 주문번호
  * \(6\) 성이 ‘김’ 씨인 고객의 이름과 주소
  * \(7\) 성이 ‘김’ 씨이고 이름이 ‘아’로 끝나는 고객의 이름과 주소


# 3.4 두 개 이상 테이블에서 SQL 질의



* Customer 테이블을 Orders 테이블과 조건 없이 연결
  * Customer와 Orders 테이블의 합체 결과 투플의 개수는 고객이 다섯 명이고 주문이 열 개이므로 5×10 해서 50이 됨


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_62.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_63.jpg)

# 조인

__질의 __  __3\-21   __  __고객과 고객의 주문에 관한 데이터를 모두 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_64.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_65.jpg)

__질의 __  __3\-22   __  __고객과 고객의 주문에 관한 데이터를 고객번호 순으로 정렬하여 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_66.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_67.jpg)

__질의 __  __3\-23   __  __고객의 이름과 고객이 주문한 도서의 판매가격을 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_68.jpg)

__질의 __  __3\-24   __  __고객별로 주문한 모든 도서의 총 판매액을 구하고__  __\, __  __고객별로 __  __정렬하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_69.jpg)

__다음과 같은 질의는 어떻게 구할 수 있는가__  __?__

__\- “__  __고객의 이름과 고객이 주문한 도서의 이름을 __  __구하시오__  __”  __

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_70.jpg)

__질의 __  __3\-25   __  __고객의 이름과 고객이 주문한 도서의 이름을 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_71.jpg)

__질의 __  __3\-26   __  __가격이 __  __20\,000__  __원인 도서를 주문한 고객의 이름과 도서의 이름을 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_72.jpg)

__질의 __  __3\-27  __  __도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 __  __               __  __판매가격을__  __ __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_73.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_74.jpg)

# 부속질의

__질의 __  __3\-28  __  __가장 비싼 도서의 이름을 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_75.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_76.jpg)

__질의 __  __3\-29   __  __도서를 구매한 적이 있는 고객의 이름을 __  __검색하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_77.jpg)

__질의 __  __3\-30   __  __대한미디어에서 출판한 도서를 구매한 고객의 이름을 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_78.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_79.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_80.jpg)



* 상관 부속질의\(correlated subquery\)
  * 상위 부속질의의 투플을 이용하여 하위 부속질의를 계산함\.
  * 상위 부속질의와 하위 부속질의가 독립적이지 않고 서로 관련을 맺고 있음\.


__질의 __  __3\-31   __  __출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 __  __구하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_81.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_82.jpg)

# 집합연산



* 합집합 UNION\, 차집합 MINUS\, 교집합 INTERSECT
  * 주의할점: Oracle은 차집합을  __MINUS__ 로 하지만 SQL 표준에서는  __EXCEPT__  를 사용


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_83.jpg)

__질의 __  __3\-32   __  __도서를 주문하지 않은 고객의 이름을 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_84.jpg)

# EXISTS



* EXISTS
  * 원래 단어에서 의미하는 것과 같이 조건에 맞는 튜플이 존재하면 결과에 포함시킴
  * 즉 부속질의문의 어떤 행이 조건에 만족하면 참임
    * 반면 NOT EXISTS는 부속질의문의 모든 행이 조건에 만족하지 않을 때만 참임\.


__질의 __  __3\-33  __  __주문이 있는 고객의 이름과 주소를 __  __보이시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_85.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_86.png)

# 연습문제



* 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오\.
  * \(5\) 박지성이 구매한 도서의 출판사 수
  * \(6\) 박지성이 구매한 도서의 이름\, 가격\, 정가와 판매가격의 차이
  * \(7\) 박지성이 구매하지 않은 도서의 이름
* 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오\.
  * \(8\) 주문하지 않은 고객의 이름\(부속질의 사용\)
  * \(9\) 주문 금액의 총액과 주문의 평균 금액
  * \(10\) 고객의 이름과 고객별 구매액
  * \(11\) 고객의 이름과 고객이 구매한 도서 목록
  * \(12\) 도서의 가격\(Book 테이블\)과 판매가격\(Orders 테이블\)의 차이가 가장 많은 주문
  * \(13\) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름


# 05. 데이터 정의어

CREATE TABLE 문

ALTER TABLE 문

DROP TABLE 문

# 4.1 CREATE TABLE 문



  * 테이블을 구성하고\, 속성과 속성에 관한 제약을 정의하며\, 기본키 및 외래키를 정의하는 명령
  * PRIMARY KEY는 기본키를 정할 때 사용하고 FOREIGN KEY는 외래키를 지정할 때 사용하며\, ON UPDATE와 ON DELETE는 외래키 속성의 수정과 투플 삭제 시 동작을 나타냄\.
  * CREATE TABLE 문의 기본 문법


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_87.jpg)



  * 테이블을 구성하고\, 속성과 속성에 관한 제약을 정의하며\, 기본키 및 외래키를 정의하는 명령
  * PRIMARY KEY는 기본키를 정할 때 사용하고 FOREIGN KEY는 외래키를 지정할 때 사용하며\, ON UPDATE와 ON DELETE는 외래키 속성의 수정과 투플 삭제 시 동작을 나타냄\.
  * CREATE TABLE 문의 기본 문법


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_88.jpg)



  * 기본키를 지정하고 싶다면 다음과 같이 생성


__질의__  __ __  __3\-34 __  __  __  __다음과 같은 속성을 가진 __  __NewBook__  __ __  __테이블을 __  __생성하시오__  __\, __  __               __  __정수형은 __  __NUMBER__  __를__  __\, __  __문자형은 가변형 문자타입인 __  __VARCHAR2__  __를 사용__

__	 __  __bookid__  __\(__  __도서번호__  __\) – NUMBER__

__	 __  __bookname__  __\(__  __도서이름__  __\) – VARCHAR2\(20\)__

__	 publisher\(__  __출판사__  __\) – VARCHAR2\(20\)__

__	 price\(__  __가격__  __\) – NUMBER__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_89.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_90.jpg)



  * bookid 속성이 없어서 두 개의 속성 bookname\, publisher가 기본키가 된다면 괄호를 사용하여 복합키를 지정
  * NewBook 테이블의 CREATE 문에 좀 더 복잡한 제약사항을 추가


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_91.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_92.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_93.jpg)



* __질의 __  __3\-35   __  __다음과 같은 속성을 가진 __  __NewCustomer__  __ __  __테이블을 __  __생성하시오__
* __ 	 __  __custid__  __\(__  __고객번호__  __\) __  __	\- __  __NUMBER\, __  __기본키__
  * __	 name\(__  __이름__  __\) __  __	– __  __VARCHAR2\(40\)__
* __	 address\(__  __주소__  __\) __  __	– __  __VARCHAR2\(40\)__
* __	 phone\(__  __전화번호__  __\) __  __	– __  __VARCHAR2\(30\)__


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_94.jpg)

__질의 __  __3\-36   __  __다음과 같은 속성을 가진 __  __NewOrders__  __ __  __테이블을 __  __생성하시오__  __\.__

__ __  __orderid__  __\(__  __주문번호__  __\) __  __\- __  __NUMBER\, __  __기본키__

__ __  __custid__  __\(__  __고객번호__  __\) \- NUMBER\, NOT NULL __  __제약조건__  __\, __  __외래키__  __\(__  __NewCustomer\.custid__  __\, __  __연쇄삭제__  __\)__

__ __  __bookid__  __\(__  __도서번호__  __\) \- NUMBER\, NOT NULL __  __제약조건__

__ __  __saleprice__  __\(__  __판매가격__  __\) \- NUMBER __

__ __  __orderdate__  __\(__  __판매일자__  __\) \- DATE__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_95.jpg)



  * 외래키 제약조건을 명시할 때는 반드시 참조되는 테이블\(부모 릴레이션\)이 존재해야 함
  * 참조되는 테이블의 기본키여야 함
  * 외래키 지정 시 ON DELETE 또는 ON UPDATE 옵션은 참조되는 테이블의 튜플이 삭제되거나 수정될 때 취할 수 있는 동작을 지정
  * NO ACTION은 어떠한 동작도 취하지 않음\.


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_96.jpg)

# 4.2 ALTER TABLE 문



  * ALTER 문은 생성된 테이블의 속성과 속성에 관한 제약을 변경하며\, 기본키 및 외래키를 변경함
  * ADD\, DROP은 속성을 추가하거나 제거할 때 사용
  * MODIFY는 속성의 기본값을 설정하거나 삭제할 때 사용
  * ADD <제약이름>\, DROP <제약이름>은 제약사항을 추가하거나 삭제할 때 사용
  * ALTER 문의 기본 문법


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_97.jpg)

__실습을 위하여 __  __NewBook__  __ __  __테이블을 지우고 질의__  __3\-34 __  __NewBook__  __ __  __테이블을 새로 생성한다__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_98.jpg)

__질의 __  __3\-37   __  __NewBook__  __ __  __테이블에 __  __VARCHAR2\(13\)__  __의 자료형을 가진 __  __isbn__  __ __  __속성을 __  __추가하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_99.jpg)

__질의 __  __3\-38   __  __NewBook__  __ __  __테이블의 __  __isbn__  __ __  __속성의 데이터 타입을 __  __NUMBER__  __형으로 __  __변경하시__  __오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_100.jpg)

__질의 __  __3\-39   __  __NewBook__  __ __  __테이블의 __  __isbn__  __ __  __속성을 __  __삭제하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_101.jpg)

__질의 __  __3\-40   __  __NewBook__  __ __  __테이블의 __  __bookid__  __ __  __속성에 __  __NOT NULL __  __제약조건을 __  __적용하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_102.jpg)

__질의 __  __3\-41   __  __NewBook__  __ __  __테이블의 __  __bookid__  __ __  __속성을 기본키로 __  __변경하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_103.jpg)

# 4.3 DROP TABLE 문



* DROP 문
  * DROP 문은 테이블을 삭제하는 명령
  * DROP 문은 테이블의 구조와 데이터를 모두 삭제하므로 사용에 주의해야 함
    * \(데이터만 삭제하려면 DELETE 문을 사용\)
* DROP문의 기본 문법


![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_104.jpg)

__질의 __  __3\-42   __  __NewBook__  __ __  __테이블을 __  __삭제하시오__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_105.jpg)

__질의 __  __3\-43__  __   __  __NewCustomer__  __ __  __테이블을 __  __삭제하시오__  __\. __  __만약 삭제가 거절된다면 원인을 __  __                __  __파악하고 관련된 __  __ __  __테이블을 같이 __  __삭제하시오__  __ __  __                __  __\(__  __NewOrders__  __ __  __테이블이 __  __NewCustomer__  __를 참조하고 있음__  __\)__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_106.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_107.jpg)

# 05. 데이터 조작어 – 삽입, 수정, 삭제

INSERT 문

UPDATE 문

DELETE 문

# 5.1 INSERT 문

INSERT 문은 테이블에 새로운 투플을 삽입하는 명령임\.

INSERT 문의 기본 문법

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_108.jpg)

__질의 __  __3\-44   Book __  __테이블에 새로운 도서 ‘스포츠 __  __의학’을__  __ __  __삽입하시오__  __\. __  __스포츠 의학은 __  __                __  __한솔의학서적에서 출간했으며 가격은 __  __90\,000__  __원이다__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_109.jpg)

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_110.jpg)

__질의 __  __3\-45   Book __  __테이블에 새로운 도서 ‘스포츠 __  __의학’을__  __ __  __삽입하시오__  __\. __  __스포츠 의학은 __  __          __  __    __  __  __  __한솔의학서적에서 출간했으며 가격은 미정이다__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_111.jpg)

대량 삽입\(bulk insert\)이란 한꺼번에 여러 개의 투플을 삽입하는 방법임\.

__질의 __  __3\-46   __  __수입도서 목록__  __\(__  __Imported\_book__  __\)__  __을 __  __Book __  __테이블에 모두 __  __삽입하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_112.jpg)

# 5.2 UPDATE 문

__UPDATE __  __문은 특정 속성 값을 수정하는 명령__

__UPDATE __  __문의 기본 문법__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_113.jpg)

__질의 __  __3\-47   Customer __  __테이블에서 고객번호가 __  __5__  __인 고객의 주소를 ‘대한민국 __  __부산’으로__  __ __  __변경하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_114.jpg)

__질의 __  __3\-48   Customer __  __테이블에서 박세리 고객의 주소를 김연아 고객의 주소로 __  __변경하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_115.jpg)

# 5.3 DELETE 문

DELETE 문은 테이블에 있는 기존 투플을 삭제하는 명령

DELETE 문의 기본 문법

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_116.jpg)

__질의 __  __3\-49   Customer __  __테이블에서 고객번호가 __  __5__  __인 고객을 __  __삭제하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_117.jpg)

__질의 __  __3\-50   __  __모든 고객을 __  __삭제하시오__  __\.__

![image](img/3%EC%9E%A5%20%EA%B0%95%EC%9D%98_SQL%20%EA%B8%B0%EC%B4%88_118.jpg)

# 연습문제



* 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오\.
  * \(1\) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
  * \(2\) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
  * \(3\) \(생략\) 전체 고객의 30% 이상이 구매한 도서
* 다음 질의에 대해 DML 문을 작성하시오\.
  * \(1\) 새로운 도서 \(‘스포츠 세계’\, ‘대한미디어’\, 10000원\)이 마당서점에 입고되었다\.
  * 삽입이 안 될 경우 필요한 데이터가 더 있는지 찾아보자\.
  * \(2\) ‘삼성당’에서 출판한 도서를 삭제해야 한다\.
  * \(3\) ‘이상미디어’에서 출판한 도서를 삭제해야 한다\. 삭제가 안 될 경우 원인을 생각해보자\.
  * \(4\) 출판사 ‘대한미디어’가 ‘대한출판사’로 이름을 바꾸었다\.


# 요약

SQL

데이터 정의어\(DLL\)

데이터 조작어\(DML\)

WHERE 조건

집계 함수

GROUP BY

HAVING

조인

동등조인\(내부조인\)

부속질의

상관 부속질의

투플 변수

집합연산

집합연산

EXISTS

CREATE

ALTER

DROP

INSERT

UPDATE

DELETE

