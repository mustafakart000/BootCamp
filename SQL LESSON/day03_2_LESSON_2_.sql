--AGGREGATE METHOD
-- Calisanlar toplasundan maksimum maası listeleyelim
SELECT max(maas) AS maksimum_maas FROM calisanlar2;
/*
    Eğer bir sutuna geçici olarak bir isim vermek istersek AS komutunu yazdıktan sonra
vermek istediğimiz ismi yazarız
*/
CREATE TABLE calisanlar
(
id int,
isim VARCHAR(50),
sehir VARCHAR(50),
maas int,
isyeri VARCHAR(20)
);

CREATE TABLE markalar
(
marka_id int,
marka_isim VARCHAR(20),
calisan_sayisi int
);

INSERT INTO calisanlar2 VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
INSERT INTO calisanlar2 VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
INSERT INTO calisanlar2 VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
INSERT INTO calisanlar2 VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(333456710, 'Fatma Yasa', 'Bursa', null, 'Vakko');

SELECT max(maas) as maximum_maas FROM calisanlar2;

SELECT min(maas) as minumum_maas FROM calisanlar2;

select round(avg (maas),2) from calisanlar2;

--Calisanlar tablosundali maas'ların sayısını listeleyiniz.

select  count  (null) FROM calisanlar2

select * from calisanlar2
select * from markalar

-- Her markanin id’sini, ismini ve toplam kaç şehirde bulunduğunu listeleyen bir SORGU yaziniz

select marka_id, marka_isim,(Select count (sehir) as sehir_sayisi from calisanlar2
							where marka_isim=isyeri),(select isim from calisanlar ) from markalar
							
-- Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin toplam maaşini listeleyiniz

select marka_isim, calisan_sayisi, (select sum(maas) as toplam_maas from calisanlar2 where isyeri=marka_isim)
from markalar;

select marka_isim,calisan_sayisi,(Select max(maas)from calisanlar2 where isyeri=marka_isim),
								  (select min(maas)from calisanlar2 where isyeri=marka_isim) from markalar

--VIEW Kullanımı
CREATE VIEW  maxminmaas as 
select marka_isim,calisan_sayisi,(Select max(maas)from calisanlar2 where isyeri=marka_isim),
								  (select min(maas)from calisanlar2 where isyeri=marka_isim) from markalar
select * from maxminmaas; 								  