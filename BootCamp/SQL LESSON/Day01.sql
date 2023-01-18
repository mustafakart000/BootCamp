--DATABASE(VeriTabanı) oluşturma
--Create dataBase evren
Create database erol;
--DD-DATA DEFİNİTON LANG.
--CREATE -- TABLO OLUŞTURMA

CREATE TABLE ogrenciler2(
	ogrenci_no char(7),
	isim varchar(20),
	soyisim varchar(25),
	not_ort real,--ondalıklı sayılar için (double gibi)
	kayit_tarih date
)
--Varolan tablodan bir tablo oluşturma
CREATE TABLE ogrenci_notları
as
select isim, soyisim,not_ort FROM ogrenciler2;-- Benzer tablodaki başlıklarla ve data tipleriyle yeni bir tablo oluşturmak için
--normal tablo oluştururken ki parantezler yerine AS kullanıp Select komutuyla almak istediğimiz verileri alırız

--DML -DATA MANUPULATION LANG.
--INSERT (Database'everi ekleme)

INSERT INTO ogrenciler2 VALUES(1234567,'said','ILHAM',85.5,now());
INSERT INTO ogrenciler2 VALUES(1234567,'said','ILHAM',85.5,'2020-12-12');


--PARÇALI VERİ EKLEME

INSERT INTO ogrenciler2(isim,soyisim)VALUES('Erol','EVREN');

--DQL DATA QUERY LANG.
--SELECT
select * from ogrenciler2;
