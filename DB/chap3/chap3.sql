-- [���� 3-1] ��� ������ �̸��� ������ �˻��Ͻÿ�.
SELECT	bookname, price
FROM	Book;

SELECT	price, bookname
FROM	Book;

-- [���� 3-2] ��� ������ ������ȣ, �����̸�, ���ǻ�, ������ �˻��Ͻÿ�.
SELECT	bookid, bookname, publisher, price
FROM	Book;

SELECT	*
FROM	Book;

-- [���� 3-3] ���� ���̺� �ִ� ��� ���ǻ縦 �˻��Ͻÿ�.
SELECT	publisher
FROM	Book;

SELECT DISTINCT	publisher
FROM   Book;

-- [���� 3-4] ������ 20,000�� �̸��� ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	price < 20000;

-- [���� 3-5] ������ 10,000�� �̻� 20,000 ������ ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	price BETWEEN 10000 AND 20000;

SELECT	*
FROM	Book
WHERE	price >= 10000 AND price <= 20000;

-- [���� 3-6] ���ǻ簡 ���½������� Ȥ�� �����ѹ̵� �� ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	publisher IN ('�½�����', '���ѹ̵��');

SELECT	*
FROM	Book
WHERE	publisher NOT IN ('�½�����', '���ѹ̵��');

-- [���� 3-7] ���౸�� ���硯�� �Ⱓ�� ���ǻ縦 �˻��Ͻÿ�.
SELECT	bookname, publisher
FROM	Book
WHERE	bookname LIKE '�౸�� ����';

-- [���� 3-8] �����̸��� ���౸�� �� ���Ե� ���ǻ縦 �˻��Ͻÿ�.
SELECT	bookname, publisher
FROM	Book
WHERE	bookname LIKE '%�౸%';

--[���� 3-9] �����̸��� ���� �� ��° ��ġ�� ��������� ���ڿ��� ���� ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	bookname LIKE '_��%';

--[���� 3-10] �౸�� ���� ���� �� ������ 20,000�� �̻��� ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	bookname LIKE '%�౸%' AND price >= 20000;

--[���� 3-11] ���ǻ簡 ���½������� Ȥ�� �����ѹ̵� �� ������ �˻��Ͻÿ�.
SELECT	*
FROM	Book
WHERE	publisher ='�½�����' OR publisher ='���ѹ̵��';

--[���� 3-12] ������ �̸������� �˻��Ͻÿ�. 
SELECT	*
FROM	Book
ORDER BY	bookname;

--[���� 3-13] ������ ���ݼ����� �˻��ϰ�, ������ ������ �̸������� �˻��Ͻÿ�.
SELECT	*
FROM	Book
ORDER BY	price, bookname;

--[���� 3-14] ������ ������ ������������ �˻��Ͻÿ�. ���� ������ ���ٸ� ���ǻ��� ������������ ����Ͻÿ�.
SELECT 	*
FROM 	Book
ORDER BY 	price DESC, publisher ASC;

--[���� 3-15] ���� �ֹ��� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT	SUM(saleprice)
FROM	Orders;

SELECT	SUM(saleprice) AS �Ѹ���
FROM	Orders;

--[���� 3-16] 2�� �迬�� ���� �ֹ��� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT	SUM(saleprice) AS �Ѹ���
FROM	Orders
WHERE	custid=2;

--[���� 3-17] ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���Ͻÿ�.
SELECT	SUM(saleprice) AS Total,
		AVG(saleprice) AS Average,
		MIN(saleprice) AS Minimum,
		MAX(saleprice) AS Maximum
FROM	Orders;

--[���� 3-18] ���缭���� ���� �Ǹ� �Ǽ��� ���Ͻÿ�.
SELECT	COUNT(*)
FROM	Orders;

==[���� 3-19] ������ �ֹ��� ������ �� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT	custid, COUNT(*) AS ��������, SUM(saleprice) AS �Ѿ�
FROM	Orders
GROUP BY	custid;

--[���� 3-20] ������ 8,000�� �̻��� ������ ������ ���� ���Ͽ� ���� �ֹ� ������ �� ������ ���Ͻÿ�. ��, �� �� �̻� ������ ���� ���Ͻÿ�.
SELECT	custid, COUNT(*) AS ��������
FROM	Orders
WHERE	saleprice >= 8000
GROUP BY	custid
HAVING	count(*) >= 2;

--[���� 3-21] ���� ���� �ֹ��� ���� �����͸� ��� ���̽ÿ�.
SELECT	*
FROM	Customer, Orders
WHERE	Customer.custid=Orders.custid;

--[���� 3-22] ���� ���� �ֹ��� ���� �����͸� ������ �����Ͽ� ���̽ÿ�.
SELECT	*
FROM	Customer, Orders
WHERE	Customer.custid=Orders.custid
ORDER BY	Customer.custid;

--[���� 3-23] ���� �̸��� ���� �ֹ��� ������ �ǸŰ����� �˻��Ͻÿ�.
SELECT	name, saleprice
FROM	Customer, Orders
WHERE	Customer.custid=Orders.custid;

--[���� 3-24] ������ �ֹ��� ��� ������ �� �Ǹž��� ���ϰ�, ������ �����Ͻÿ�.
SELECT	name, SUM(saleprice)
FROM	Customer, Orders
WHERE	Customer.custid=Orders.custid
GROUP BY	Customer.name
ORDER BY	Customer.name;

--[���� 3-25] ���� �̸��� ���� �ֹ��� ������ �̸��� ���Ͻÿ�. 
SELECT	Customer.name, book.bookname
FROM	Customer, Orders, Book
WHERE	Customer.custid=Orders.custid AND Orders.bookid=Book.bookid;

--[���� 3-26] ������ 20,000���� ������ �ֹ��� ���� �̸��� ������ �̸��� ���Ͻÿ�.
SELECT	Customer.name, book.bookname
FROM	Customer, Orders, Book
WHERE	Customer.custid=Orders.custid AND Orders.bookid=Book.bookid
			AND Book. price=20000;

--[���� 3-27] ������ �������� ���� ���� �����Ͽ� ���� �̸��� ���� �ֹ��� ������ �ǸŰ����� ���Ͻÿ�.
SELECT	Customer.name, saleprice
FROM	Customer LEFT OUTER JOIN Orders 
			ON Customer.custid=Orders.custid;

	SELECT Customer.name, saleprice
	FROM   CUSTOMER, ORDERS 
	WHERE  CUSTOMER.custid=ORDERS.custid(+)

--[���� 3-28] ���� ��� ������ �̸��� ���̽ÿ�.
SELECT	bookname
FROM	Book
WHERE	price = (SELECT MAX(price) 
                      FROM Book);

--[���� 3-29] ������ ������ ���� �ִ� ���� �̸��� �˻��Ͻÿ�.
SELECT	name
FROM	Customer
WHERE	custid IN (SELECT custid 
                        FROM Orders);

--[���� 3-30] �����ѹ̵����� ������ ������ ������ ���� �̸��� ���̽ÿ�.
SELECT	name
FROM	Customer
WHERE	custid IN(SELECT	custid
			 FROM		Orders
			 WHERE	bookid IN(SELECT	bookid
						  FROM		Book
						  WHERE	publisher='���ѹ̵��'));

--[���� 3-31] ���ǻ纰�� ���ǻ��� ��� ���� ���ݺ��� ��� ������ ���Ͻÿ�. 
SELECT	b1.bookname
FROM	Book b1
WHERE	b1.price > (SELECT 	avg(b2.price)
			    FROM	Book b2
			    WHERE	b2.publisher=b1.publisher);


--[���� 3-32] ������ �ֹ����� ���� ���� �̸��� ���̽ÿ�. 
SELECT	name
FROM	Customer
MINUS
SELECT	name
FROM	Customer
WHERE	custid IN (SELECT custid FROM Orders);

--[���� 3-33] �ֹ��� �ִ� ���� �̸��� �ּҸ� ���̽ÿ�.

SELECT	name, address
FROM	Customer cs
WHERE	EXISTS (SELECT *
		         FROM	   Orders od
			 WHERE   cs.custid=od.custid);

--[���� 3-34] ������ ���� �Ӽ��� ���� NewBook ���̺��� �����Ͻÿ�. 
CREATE TABLE	NewBook (
  bookid		NUMBER, 
  bookname		VARCHAR2(20),
  publisher		VARCHAR2(20),
  price		NUMBER);

CREATE TABLE	NewBook (
  bookid		NUMBER,
  bookname		VARCHAR2(20),
  publisher		VARCHAR2(20),
  price		NUMBER,
  PRIMARY KEY	(bookid));

CREATE TABLE	NewBook (
  bookid		NUMBER	PRIMARY KEY,
  bookname		VARCHAR2(20),
  publisher		VARCHAR2(20),
  price		NUMBER);

CREATE TABLE 	NewBook (
  bookname		VARCHAR2(20),
  publisher		VARCHAR2(20),
  price 		NUMBER,
  PRIMARY KEY	(bookname, publisher));

CREATE TABLE 	NewBook (
  bookname		VARCHAR2(20)	NOT NULL,
  publisher		VARCHAR2(20)	UNIQUE,
  price		NUMBER DEFAULT 10000 CHECK(price > 1000),
  PRIMARY KEY	(bookname, publisher));

--[���� 3-35] ������ ���� �Ӽ��� ���� NewCustomer ���̺��� �����Ͻÿ�.
CREATE TABLE	NewCustomer (
  custid		NUMBER	PRIMARY KEY,
  name		VARCHAR2(40),
  address		VARCHAR2(40),
  phone		VARCHAR2(30));

--[���� 3-36] ������ ���� �Ӽ��� ���� NewOrders ���̺��� �����Ͻÿ�.
CREATE TABLE	NewOrders (
  orderid	NUMBER,
  custid	NUMBER	NOT NULL,
  bookid	NUMBER	NOT NULL,
  saleprice	NUMBER,
  orderdate	DATE,
  PRIMARY KEY(orderid),
  FOREIGN KEY(custid) REFERENCES NewCustomer(custid) ON DELETE CASCADE);

--[���� 3-37] NewBook ���̺� VARCHAR2(13)�� �ڷ����� ���� isbn �Ӽ��� �߰��Ͻÿ�.
ALTER TABLE NewBook ADD isbn VARCHAR2(13);

--[���� 3-38] NewBook ���̺��� isbn �Ӽ��� ������ Ÿ���� NUMBER������ �����Ͻÿ�.
ALTER TABLE NewBook MODIFY isbn NUMBER;

--[���� 3-39] NewBook ���̺��� isbn �Ӽ��� �����Ͻÿ�.
ALTER TABLE NewBook DROP COLUMN isbn;

--[���� 3-40] NewBook ���̺��� bookid �Ӽ��� NOT NULL ���������� �����Ͻÿ�.
ALTER TABLE NewBook MODIFY bookid NUMBER NOT NULL;

--[���� 3-41] NewBook ���̺��� bookid �Ӽ��� �⺻Ű�� �����Ͻÿ�. 
ALTER TABLE NewBook ADD PRIMARY KEY(bookid);

--[���� 3-42] NewBook ���̺��� �����Ͻÿ�.
DROP TABLE NewBook;

--[���� 3-43] NewCustomer ���̺��� �����Ͻÿ�. 
DROP TABLE NewCustomer;

--[���� 3-44] Book ���̺� ���ο� ���� �������� ���С��� �����Ͻÿ�.
INSERT INTO Book(bookid, bookname, publisher, price)
	    VALUES (11, '������ ����', '�Ѽ����м���', 90000);

--[���� 3-45] Book ���̺� ���ο� ���� �������� ���С��� �����Ͻÿ�. 
INSERT INTO Book(bookid, bookname, publisher)
	   VALUES (14, '������ ����', '�Ѽ����м���');

--[���� 3-46] ���Ե��� ���(Imported_book)�� Book ���̺� ��� �����Ͻÿ�.
INSERT INTO Book(bookid, bookname, price, publisher)
	   SELECT	bookid, bookname, price, publisher
	   FROM 	Imported_book;

--[���� 3-47] Customer ���̺��� ����ȣ�� 5�� ���� �ּҸ� �����ѹα� �λꡯ���� �����Ͻÿ�.
UPDATE	Customer
SET		address ='���ѹα� �λ�'
WHERE	custid=5;

--[���� 3-48] Customer ���̺��� �ڼ��� ���� �ּҸ� �迬�� ���� �ּҷ� �����Ͻÿ�.
UPDATE	Customer
SET		address=(SELECT	address
			  FROM		Customer
			  WHERE	name='�迬��')
WHERE	name ='�ڼ���';

--[���� 3-49] Customer ���̺��� ����ȣ�� 5�� ���� ������ �� ����� Ȯ���Ͻÿ�.
DELETE	FROM	Customer
WHERE	custid=5;

SELECT * FROM Customer;

--[���� 3-50] ��� ���� �����Ͻÿ�.
DELETE	FROM	Customer;



