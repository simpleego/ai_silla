--system
GRANT SELECT,INSERT ON mdguest2.Newtable  TO PROGRAMMER;

--mdguest �� ����
 SET ROLE ALL;
INSERT INTO mdguest2.NewTable(myname, myphone)
	   VALUES ('ȫ�浿', '000-000-0100');
COMMIT;

SELECT * 
FROM   mdguest2.NewTable;