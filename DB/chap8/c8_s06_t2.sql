SET TRANSACTION ISOLATION LEVEL READ COMMITTED;

SELECT SUM(price) �Ѿ�
FROM   Book;
 

UPDATE Book 
SET     price=price+500
WHERE  bookid=1;

SELECT SUM(price) �Ѿ� 
FROM   Book;

COMMIT;