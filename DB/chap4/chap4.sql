--[���� 4-1] -78�� +78�� ������ ���Ͻÿ�.
   SELECT 	ABS(-78), ABS(+78) 
   FROM 	Dual;

--[���� 4-2] 4.875�� �Ҽ� ù° �ڸ����� �ݿø��� ���� ���Ͻÿ�.
SELECT	ROUND(4.875, 1) 
   FROM	Dual;

--[���� 4-3] ���� ��� �ֹ� �ݾ��� ��� ������ �ݿø��� ���� ���Ͻÿ�.
SELECT	custid "����ȣ", ROUND(SUM(saleprice)/COUNT(*), -2) "��ձݾ�"
FROM	Orders
GROUP BY	custid;

--[���� 4-4] ���� ���� ���߱����� ���Ե� ������ ���󱸡��� ������ �� ���� ����� ���̽ÿ�.
SELECT	bookid, REPLACE(bookname, '�߱�', '��') bookname, publisher, price
FROM	Book;

--[���� 4-5] ���½����������� ������ ������ ����� ������ ���� ��, ����Ʈ ���� ���̽ÿ�.
SELECT 	bookname "����", LENGTH(bookname) "���ڼ�",	LENGTHB(bookname) "����Ʈ��"
FROM 	Book
WHERE 	publisher='�½�����';

--[���� 4-6] ���缭���� �� �߿��� ���� ��(��)�� ���� ����� �� ���̳� �Ǵ��� ���� �ο����� ���Ͻÿ�.
SELECT	SUBSTR(name, 1, 1) "��", COUNT(*) "�ο�"
FROM	Customer
GROUP BY	SUBSTR(name, 1, 1);

--[���� 4-7] ���缭���� �ֹ��Ϸκ��� 10�� �� ������ Ȯ���Ѵ�. �� �ֹ��� Ȯ�����ڸ� ���Ͻÿ�.
SELECT	orderid "�ֹ���ȣ", orderdate "�ֹ���", orderdate+10 "Ȯ��"
FROM	Orders;

--[���� 4-8] ���缭���� 2020�� 7�� 7�Ͽ� �ֹ����� ������ �ֹ���ȣ, �ֹ���, ����ȣ, ������ȣ�� ��� ���̽ÿ�. �� �ֹ����� ��yyyy-mm-dd ���ϡ� ���·� ǥ���Ѵ�.
SELECT	orderid "�ֹ���ȣ", TO_CHAR(orderdate, 'yyyy-mm-dd dy') "�ֹ���", custid "����ȣ", bookid "������ȣ"
FROM	Orders
WHERE      orderdate=TO_DATE('20200707', 'yyyymmdd');

--[���� 4-9] DBMS ������ ������ ���� ��¥�� �ð�, ������ Ȯ���Ͻÿ�.
SELECT	SYSDATE, TO_CHAR(SYSDATE, 'yyyy/mm/dd dy hh24:mi:ss') "SYSDATE_1" 
FROM 	Dual; 		

--[���� 4-10] �̸�, ��ȭ��ȣ�� ���Ե� ������� ���̽ÿ�. ��, ��ȭ��ȣ�� ���� ���� ������ó���������� ǥ���Ͻÿ�.
SELECT	name "�̸�", NVL(phone, '����ó����') "��ȭ��ȣ" 
FROM	Customer;

--[���� 4-11] ����Ͽ��� ����ȣ, �̸�, ��ȭ��ȣ�� ���� �� �� ���̽ÿ�.
SELECT	ROWNUM "����", custid, name, phone
FROM	Customer
WHERE 	ROWNUM <= 2;

--[���� 4-12] ��� �ֹ��ݾ� ������ �ֹ��� ���ؼ� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT	orderid, saleprice
FROM	Orders
WHERE	saleprice <= (SELECT AVG(saleprice) FROM   Orders);

--[���� 4-13] �� ���� ��� �ֹ��ݾ׺��� ū �ݾ��� �ֹ� ������ ���ؼ� �ֹ���ȣ, ����ȣ, �ݾ��� ���̽ÿ�.
SELECT	orderid, custid, saleprice
FROM	Orders md
WHERE	saleprice > (SELECT   AVG(saleprice)
			     FROM	Orders so
			     WHERE	md.custid=so.custid);

--[���� 4-14] �����ѹα����� �����ϴ� ������ �Ǹ��� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT	SUM(saleprice) "total"
FROM	Orders
WHERE	custid IN (SELECT     custid
			   FROM	Customer
			   WHERE	address LIKE '%���ѹα�%');

--[���� 4-15] 3�� ���� �ֹ��� ������ �ְ� �ݾ׺��� �� ��� ������ ������ �ֹ��� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT	orderid, saleprice
FROM	Orders
WHERE	saleprice > ALL (SELECT saleprice
				  FROM   Orders
				  WHERE custid='3');

--[���� 4-16] EXISTS �����ڸ� ����Ͽ� �����ѹα����� �����ϴ� ������ �Ǹ��� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT	SUM(saleprice) "total"
FROM	Orders od
WHERE	EXISTS (SELECT  *
			 FROM	   Customer cs
			 WHERE	   address LIKE '%���ѹα�%' AND cs.custid=od.custid);

--[���� 4-17] ���缭���� ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT	(SELECT    name
	  	FROM	     Customer cs
		 	WHERE    cs.custid=od.custid) "name", SUM(saleprice) "total"
FROM	Orders od
GROUP BY	od.custid;

--[���� 4-18] Orders ���̺� �� �ֹ��� �´� �����̸��� �Է��Ͻÿ�.
ALTER TABLE Orders ADD bookname VARCHAR2(40);

UPDATE	Orders
SET		bookname=(SELECT	bookname
           		    FROM	Book
 			    WHERE	Book.bookid=Orders.bookid);

--[���� 4-19] ����ȣ�� 2 ������ ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT	cs.name, SUM(od.saleprice) "total"
FROM	(SELECT   custid, name
		 FROM     Customer
		 WHERE   custid <= 2) cs,
		Orders	od
WHERE	cs.custid=od.custid
GROUP BY	cs.name;

--[���� 4-20] �ּҿ� �����ѹα����� �����ϴ� ����� ������ �並 ����� ��ȸ�Ͻÿ�. ���� �̸��� vw_Customer�� �����Ͻÿ�.
CREATE VIEW	vw_Customer
AS SELECT		*
	FROM		Customer
	WHERE		address LIKE '%���ѹα�%';

--[���� 4-21] Orders ���̺��� ���̸��� �����̸��� �ٷ� Ȯ���� �� �ִ� �並 ������ ��, ���迬�ơ� ���� ������ ������ �ֹ���ȣ, �����̸�, �ֹ����� ���̽ÿ�.
CREATE VIEW	vw_Orders (orderid, custid, name, bookid, bookname, saleprice, orderdate)
AS SELECT		od.orderid, od.custid, cs.name,
			od.bookid, bk.bookname, od.saleprice, od.orderdate
	FROM		Orders od, Customer cs, Book bk
	WHERE		od.custid=cs.custid AND od.bookid=bk.bookid;

SELECT	orderid, bookname, saleprice
FROM	vw_Orders
WHERE	name ='�迬��';

--[���� 4-22] [���� 4-20]���� ������ �� vw_Customer�� �ּҰ� �����ѹα����� ���� �����ش�. 
CREATE OR REPLACE VIEW vw_Customer (custid, name, address)
AS  SELECT		custid, name, address
	FROM		Customer
	WHERE		address LIKE '%����%';

SELECT	*
FROM	vw_Customer;

--[���� 4-23] �ռ� ������ �� vw_Customer�� �����Ͻÿ�.
DROP VIEW	vw_Customer;

SELECT	*
FROM	vw_Customer;

--[���� 4-24] Book ���̺��� bookname ���� ������� �ε��� ix_Book�� �����Ͻÿ�.
CREATE INDEX ix_Book ON Book (bookname);

--[���� 4-25] Book ���̺��� publisher, price ���� ������� �ε��� ix_Book2�� �����Ͻÿ�.
CREATE INDEX ix_Book2 ON Book (publisher, price);

	SELECT	* 
	FROM		Book
	WHERE		publisher='���ѹ̵��' AND price >= 30000;

--[���� 4-26] �ε��� ix_Book�� ������Ͻÿ�.
ALTER INDEX ix_Book REBUILD; 

--[���� 4-27] �ε��� ix_Book�� �����Ͻÿ�.
DROP INDEX ix_Book;