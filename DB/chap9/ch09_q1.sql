--c:\madang ������ oradata�� �����Ǿ��־����.

CREATE TABLESPACE md_tbs
     DATAFILE 'C:\madang\oradata\md_tbs_data01.dbf'
     SIZE 10M;
     
     
CREATE TABLESPACE md_test
     DATAFILE 'C:\madang\oradata\md_test_data01.dbf'
     SIZE 10M;     

select * from user_tablespaces;