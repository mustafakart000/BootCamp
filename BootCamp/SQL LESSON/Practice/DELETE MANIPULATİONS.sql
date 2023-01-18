CREATE TABLE ogrenciler
(
	id int,
	isim VARCHAR(50),
	veli_isim VARCHAR(50),
	yazili_notu int
);

INSERT INTO ogrenciler VALUES(123, 'Ali Can', 		'Hasan',	75);
INSERT INTO ogrenciler VALUES(124, 'Merve Gul', 	'Ayse',		85);
INSERT INTO ogrenciler VALUES(125, 'Kemal Yasa', 	'Hasan',	85);
INSERT INTO ogrenciler VALUES(126, 'Nesibe Yilmaz', 'Ayse',		95);
INSERT INTO ogrenciler VALUES(127, 'Mustafa Bak', 	'Can',		99);
INSERT INTO ogrenciler VALUES(127, 'Mustafa Bak', 	'Ali', 		99);

select * from ogrenciler
------------------------------------------------------------------------
-- İsmi Mustafa Bak ve Nesibe Yılmaz olan kayıtları silelim

DELETE FROM ogrenciler where isim='Mustafa Bak' or isim='Nesibe Yilmaz';

-- 123	"Ali Can"		"Hasan"		75
-- 124	"Merve Gul"		"Ayse"		85
-- 125	"Kemal Yasa"	"Hasan"		85
------------------------------------------------------------------------
-- Veli ismi Hasan datayi silelim

DELETE FROM ogrenciler where veli_isim='Hasan';

--Hasan isimli veli olan iki data da silindi.
--124	"Merve Gul"		"Ayse"		85

------------------------------------------------------------------------
-- TRUNCATE -- 
-- Bir tablodaki tüm verileri geri alamayacağımız şekilde siler. Şartlı silme yapmaz

TRUNCATE ogrenciler

------------------------------------------------------------------------

-- ON DELETE CASCADE 
DROP TABLE if exists talebeler -- Eğer tablo varsa tabloyu siler

Create table talebeler
(
	ıd char(3) primary key,
	isim VARCHAR (50),
	veli_isim VARCHAR(50),
	yazili_notu int
);

CREATE TABLE not1( 
talebe_id char(3),
ders_adi varchar(30),
yazili_notu int,
CONSTRAINT notlar_fk FOREIGN KEY (talebe_id) REFERENCES talebeler(ıd)
on delete cascade
);

INSERT INTO talebeler VALUES(123, 'Ali Can', 		'Hasan',	75);
INSERT INTO talebeler VALUES(124, 'Merve Gul', 		'Ayse',		85);
INSERT INTO talebeler VALUES(125, 'Kemal Yasa', 	'Hasan',	85);
INSERT INTO talebeler VALUES(126, 'Nesibe Yilmaz',  'Ayse',		95);
INSERT INTO talebeler VALUES(127, 'Mustafa Bak', 	'Can',		99);
INSERT INTO talebeler VALUES(127, 'Mustafa Bak', 	'Ali', 		99);

INSERT INTO not1 VALUES ('123',		'kimya',		75);
INSERT INTO not1 VALUES ('124', 	'fizik',		65);
INSERT INTO not1 VALUES ('125', 	'tarih',		90);
INSERT INTO not1 VALUES ('126', 	'Matematik',	90);

select * from talebeler
select * from not1

------------------------------------------------------------------------
-- Talebeler tablosundan id'si 126 olan datayı silelim

DELETE FROM talebeler Where ıd='126';

/*
    Her defasında önce child tablodaki verileri silmek yerine ON DELETE CASCADE silme özelliği ile
parent tablo dan da veri silebiliriz. Yanlız ON DELETE CASCADE komutu kullanımında parent tablodan sildiğimiz
data child tablo dan da silinir
*/
/*  Child TABLO not1:(parent TABLO dan sildiğimiz 126 id, child tablodan da silindi)
  	"123"	"kimya"		75
	"124"	"fizik"		65
	"125"	"tarih"		90
*/
------------------------------------------------------------------------
