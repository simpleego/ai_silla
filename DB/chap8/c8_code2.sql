Drop TABLE Users;
CREATE TABLE Users 
( id	NUMBER,
  name	VARCHAR2(20),
  age	NUMBER);

INSERT INTO Users VALUES (1, 'HONG GILDONG', 30);

SELECT * 
FROM   Users;

 

COMMIT;