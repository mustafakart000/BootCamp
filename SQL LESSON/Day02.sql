
CREATE TABLE ogrenciler3(
	ogrenci_no char(7),--Uzunluğunu bildiğimiz Stringler için CHAR kullanılır.
	isim varchar(20),
	soyisim varchar(25),
	not_ort real,--ondalıklı sayılar için (double gibi)
	kayit_tarih date
	
	--VAROLAN BİR TABLODAN YENİ BİR TABLO OLUŞTURMA
CREATE TABLE NOTLAR
AS
SELECT isim, not_ort FROM ogrenciler3;
	
	select * from notlar;
	--Tablo içine veri ekleme
	INSERT INTO notlar VALUES ('Atse', 96.5);
	INSERT INTO notlar VALUES ('Ali', 12.5);
	INSERT INTO notlar VALUES ('mehmet', 43.5);
	INSERT INTO notlar VALUES ('Osman', 67.5);
	INSERT INTO notlar VALUES ('kemal', 77.5);
	INSERT INTO notlar VALUES ('zülfükar', 54.5);
	
	Create table talebeler
	(
	id char(10),
		notlar real
	);
	INSERT INTO talebeler VALUES ('Atse', 96.5);
	INSERT INTO talebeler VALUES ('Ali', 12.5);
	INSERT INTO talebeler VALUES ('mehmet', 43.5);
	INSERT INTO talebeler VALUES ('Osman', 67.5);
	INSERT INTO talebeler VALUES ('kemal', 77.5);
	INSERT INTO talebeler VALUES ('zülfükar', 54.5);
	
	CREATE TABLE ogrenciler7
(
ogrenci_no char(7) unique,
isim varchar(20)not null,	
soyisim varchar(25),	
not_ort real,
kayit_tarih date	
);
select * from ogrenciler7;
	INSERT INTO ogrenciler7 VALUES ('1234567', 'mustafa','Evren',75.5,now());
		INSERT INTO ogrenciler7 VALUES ('1234568', 'Ali','Veli',75.5,now());
	INSERT INTO ogrenciler7  (ogrenci_no,soyisim,not_ort) VALUES ('1234569','Evren',85.5);--Not NULL kısıtlamasından Dolayı isim eklemek zorundayız
	
	
	--PRIMARY KEY OLUŞTURMA
	
	CREATE TABLE ogrenciler8
(
ogrenci_no char(7) primary key,
isim varchar(20),	
soyisim varchar(25),	
not_ort real,
kayit_tarih date	
);
	
	--PRİMARY KEY ATAMASI İKİNCİ YOL
		CREATE TABLE ogrenciler9
(
ogrenci_no char(7),
isim varchar(20),	
soyisim varchar(25),	
not_ort real,
kayit_tarih date,
	CONSTRAINT ogr PRIMARY KEY (ogrenci_no)
);
	
---	“tedarikciler3” isimli bir tablo olusturun. Tabloda “tedarikci_id”, “tedarikci_ismi”, “iletisim_isim” field’lari olsun ve “tedarikci_id” yi Primary Key yapin.---
	---“urunler” isminde baska bir tablo olusturun “tedarikci_id” ve “urun_id” field’lari olsun ve
---“tedarikci_id” yi Foreign Key yapin.
	
	CREATE TABLE  tedarikciler3

(
tedarikci_id char(8) Primary Key,
	tedarikci_ismi varchar(20),
 iletisim_isim varchar(20)

);
CREATE TABLE urunler
(
tedarikci_id char(5),
urun_id char(5),
FOREIGN KEY (tedarikci_id) REFERENCES tedarikciler3(tedarikci_id)
);
	
	CREATE TABLE urunler
(
tedarikci_id char(5),
urun_id char(5),
CONSTRAINT urn_fk FOREIGN KEY (tedarikci_id) REFERENCES tedarikciler3(tedarikci_id)
);
	select*from tedarikciler3;

	
CREATE TABLE calisanlar
(
id varchar(15) PRIMARY KEY,
isim varchar(30) UNIQUE,
maas int NOT NULL,
ise_baslama date
);
CREATE TABLE adresler
(
adres_id varchar(30),
sokak varchar(30),
cadde varchar(30),
sehir varchar(30),
FOREIGN KEY (adres_id) REFERENCES calisanlar(id)
);
INSERT INTO calisanlar VALUES('10002', 'Mehmet Yılmaz' ,12000, '2018-04-14');
INSERT INTO calisanlar VALUES('10008', null, 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10010', 'Mehmet Yılmaz', 5000, '2018-04-14'); -- UNIQUE CONS. Kabul etmez
INSERT INTO calisanlar VALUES('10004', 'Veli Han', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10005', 'Mustafa Ali', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10006', 'Canan Yaş', NULL, '2019-04-12'); -- NOT NULL CONS. Kabul etmez
INSERT INTO calisanlar VALUES('10003', 'CAN', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10007', 'CAN', 5000, '2018-04-14'); -- UNIQUE CONS. Kabul etmez
INSERT INTO calisanlar VALUES('10009', 'cem', '', '2018-04-14');
INSERT INTO calisanlar VALUES('', 'osman', 2000, '2018-04-14');
INSERT INTO calisanlar VALUES('', 'osman can', 2000, '2018-04-14'); -- PRIMARY KEY
INSERT INTO calisanlar VALUES( '10002', 'ayse Yılmaz' ,12000, '2018-04-14'); -- PRIMARY KEY
INSERT INTO calisanlar VALUES( null, 'filiz ' ,12000, '2018-04-14'); -- PRIMARY KEY
INSERT INTO adresler VALUES('10003','Mutlu Sok', '40.Cad.','IST');
INSERT INTO adresler VALUES('10003','Can Sok', '50.Cad.','Ankara');
INSERT INTO adresler VALUES('10002','Ağa Sok', '30.Cad.','Antep');
-- Parent tabloda olmayan id ile child a ekleme yapamayiz
INSERT INTO adresler VALUES('10012','Ağa Sok', '30.Cad.','Antep');
-- FK'ye null değeri atanabilir.
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Antep');
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Maraş');
SELECT * FROM calisanlar;
SELECT * FROM adresler;
	
-- CHECK CONSTRAINT
CREATE TABLE calisanlar1
(
id varchar(15) PRIMARY KEY,
isim varchar(30) UNIQUE,
maas int CHECK (maas>10000),
ise_baslama date
);
	INSERT INTO calisanlar1 VALUES('10052', 'Mehmet Yılmaz' ,9000, '2018-04-14');

	---DQL--WHERE KULLANIMI
	SELECT * FROM calisanlar;
	SELECT isim FROM calisanlar;
	
	--calisanlar tablosundan maası 5000 den buyuk olan isimleri listeleyiniz.
	SELECT isim,maas FROM calisanlar WHERE maas>5000;
	
	--Calisanlar Tablosundan İsmi Veli han olan veriyi getiriniz
	SELECT*FROM calisanlar WHERE isim='Veli Han';
		--calisanlar tablosundan maası 5000   olan tüm verileri listeleyiniz.
	SELECT*FROM calisanlar WHERE maas=5000;
	--DML --DELETE KOMUTU
	DELETE FROM calisanlar;
		DELETE FROM adresler WHERE sehir='Antep';
	SELECT *FROM adresler;

	