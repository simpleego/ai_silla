SET TRANSACTION NAME 'mytran';
INSERT INTO Book VALUES(99, '�����ͺ��̽�', '�Ѻ�', 25000);
SELECT bookname "bookname1" FROM Book 
  WHERE bookid=99;  
/*���: �����ͺ��̽� , SAVEPOINT: a */
SAVEPOINT a;

UPDATE Book SET bookname='�����ͺ��̽� ����' WHERE bookid=99;
SELECT bookname "bookname2" FROM Book 
  WHERE bookid=99;   
  /* ���: �����ͺ��̽� ���� , SAVEPOINT: b */
SAVEPOINT b;

UPDATE Book SET bookname='�����ͺ��̽� ���� �� �ǽ�' WHERE bookid=99;
SELECT bookname "bookname3" FROM Book 
  WHERE bookid=99;    
/*���: �����ͺ��̽� ���� �� �ǽ� */

ROLLBACK TO b;
SELECT bookname "bookname4" FROM Book 
  WHERE bookid=99;   
/*���: �����ͺ��̽� ���� , SAVEPOINT: b �� �ѹ� */

ROLLBACK TO a;
SELECT bookname "bookname5" FROM Book 
  WHERE bookid=99;    
/*���: �����ͺ��̽� , SAVEPOINT: a �� �ѹ�*/
COMMIT;

UPDATE Book SET bookname='�����ͺ��̽� ���� �� �ǽ�2' WHERE bookid=99; 
SELECT bookname "bookname6" FROM Book 
  WHERE bookid=99;    
/*���: �����ͺ��̽� ���� �� �ǽ�2 */

ROLLBACK;
SELECT bookname "bookname5" FROM Book 
  WHERE bookid=99;    
/*���: �����ͺ��̽� , �ѹ� */
DELETE FROM  Book WHERE bookid=99;
COMMIT;