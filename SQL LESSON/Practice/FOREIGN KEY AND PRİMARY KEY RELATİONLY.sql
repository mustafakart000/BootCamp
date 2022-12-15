--FOREİGN KEY
CREATE TABLE calisanlar3 ( iid varchar,
						  isim varchar UNIQUE,
						  maas real Not Null,
						  ise_baslama date,
						  CONSTRAINT calisanlar_pk2
						  PRIMARY KEY (iid)
						 );
select * from calisanlar2 						 
INSERT INTO calisanlar VALUES('10002', 'Mehmet Yılmaz' ,12000, '2018-04-14'); 
INSERT INTO calisanlar VALUES('10008', null, 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10010', Mehmet Yılmaz, 5000, '2018-04-14'); -- ' CHAR ' ifadeler tırnak içinde olmalılar.
INSERT INTO calisanlar VALUES('10004', 'Veli Han', 5000,'2019-04-12'); -- 
INSERT INTO calisanlar VALUES('10005', 'Mustafa Ali', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10006', 'Canan Yaş', NULL, '2019-04-12'); 
INSERT INTO calisanlar VALUES('10003', 'CAN', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10007', 'CAN', 5000, '2018-04-14'); 
INSERT INTO calisanlar VALUES('10009', 'cem', '', '2018-04-14'); 
INSERT INTO calisanlar VALUES('', 'osman', 2000, '2018-04-14');
INSERT INTO calisanlar VALUES('', 'osman can', 2000, '2018-04-14');
INSERT INTO calisanlar VALUES( '10002', 'ayse Yılmaz' ,12000, '2018-04-14'); 
INSERT INTO calisanlar VALUES( null, 'filiz ' ,12000, '2018-04-14');						 
						  
Create Table adresler (adres_id int,
					   sokak varchar,
					   cadde varchar,
					   sehir varchar,
					  CONSTRAINT adresler_fk FOREIGN KEY (adres_id)
					   REFERENCES calisanlar(iid)
					  );

INSERT INTO adresler VALUES('10003','Mutlu Sok', '40.Cad.','IST');
INSERT INTO adresler VALUES('10003','Can Sok', '50.Cad.','Ankara');
INSERT INTO adresler VALUES('10002','Ağa Sok', '30.Cad.','Antep');
-- Parent tabloda olmayan id ile child a ekleme yapamayiz
INSERT INTO adresler VALUES('10012','Ağa Sok', '30.Cad.','Antep');
-- FK'ye null değeri atanabilir.
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Antep');
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Maraş');
					  