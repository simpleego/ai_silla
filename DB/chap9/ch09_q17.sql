--system
REVOKE SELECT ON mdguest2.NewTable FROM programmer;

--mdguest �� ����

SET ROLE ALL;

SELECT * 
FROM   mdguest2.NewTable;