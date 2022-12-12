drop table if exists calisanlar2
CREATE TABLE calisanlar2
(
id int,
isim VARCHAR(50),
sehir VARCHAR(50),
maas int,
isyeri VARCHAR(20)
);

INSERT INTO calisanlar2 VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
INSERT INTO calisanlar2 VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
INSERT INTO calisanlar2 VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
INSERT INTO calisanlar2 VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');

select * from calisanlar2;

drop table if exists markalar
CREATE TABLE markalar
(
marka_id int,
marka_isim VARCHAR(20),
calisan_sayisi int
);

INSERT INTO markalar VALUES(100, 'Vakko', 12000);
INSERT INTO markalar VALUES(101, 'Pierre Cardin', 18000);
INSERT INTO markalar VALUES(102, 'Adidas', 10000);
INSERT INTO markalar VALUES(103, 'LCWaikiki', 21000);

select *from markalar

-- Çalisan sayisi 15.000’den cok olan markalarin isimlerini ve bu markada
--calisanlarin isimlerini ve maaşlarini listeleyin.

select isyeri, isim, maas from calisanlar2 where isyeri
IN(select marka_isim from markalar where calisan_sayisi>15000); 

--marka_id’si 101’den büyük olan marka çalişanlarinin isim, maaş ve
--şehirlerini listeleyiniz.

select isim, maas, sehir from calisanlar2 where isyeri 
(select marka_isim from markalar where marka_id=101);


--SUBQUERIES
-- Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin toplam maaşini listeleyiniz
select marka_isim, calisan_sayisi,
(select sum(maas) from calisanlar2 where marka_isim=isyeri)
from markalar  

select   isyeri , sum(maas) from calisanlar2
GROUP by isyeri

 
-- Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin
--maksimum ve minumum maaşini listeleyen 
--bir Sorgu yaziniz.

select marka_isim, calisan_sayisi,
(select max(maas) from calisanlar2 where marka_isim=isyeri) as max_maas,
(select min(maas) from calisanlar2 where marka_isim=isyeri) as min_maas
from markalar

--EXISTS CONDITION
/*
EXISTS Condition subquery’ler ile kullanilir. IN ifadesinin kullanımına benzer
olarak, EXISTS ve NOT EXISTS ifadeleri de alt sorgudan getirilen değerlerin
içerisinde bir değerin olması veya olmaması durumunda işlem yapılmasını sağlar.*/

DROP TABLE IF EXISTS mart
CREATE TABLE mart
(
urun_id int,
musteri_isim varchar(50), 
urun_isim varchar(50)
);

INSERT INTO mart VALUES (10, 'Mark', 'Honda');
INSERT INTO mart VALUES (20, 'John', 'Toyota');
INSERT INTO mart VALUES (30, 'Amy', 'Ford');
INSERT INTO mart VALUES (20, 'Mark', 'Toyota');
INSERT INTO mart VALUES (10, 'Adam', 'Honda');
INSERT INTO mart VALUES (40, 'John', 'Hyundai');
INSERT INTO mart VALUES (20, 'Eddie', 'Toyota');

DROP TABLE IF EXISTS nisan

CREATE TABLE nisan 
(
urun_id int ,
musteri_isim varchar(50), 
urun_isim varchar(50)
);


INSERT INTO nisan VALUES (10, 'Hasan', 'Honda');
INSERT INTO nisan VALUES (10, 'Kemal', 'Honda');
INSERT INTO nisan VALUES (20, 'Ayse', 'Toyota');
INSERT INTO nisan VALUES (50, 'Yasar', 'Volvo');
INSERT INTO nisan VALUES (20, 'Mine', 'Toyota');

/* MART VE NİSAN aylarında aynı URUN_ID ile satılan ürünlerin
URUN_ID’lerini listeleyen ve aynı zamanda bu ürünleri MART ayında alan
MUSTERI_ISIM 'lerini listeleyen bir sorgu yazınız. */


select urun_id, musteri_isim from mart where exists (select urun_id from nisan where
													mart.urun_id = nisan.urun_id)
													
select urun_isim, musteri_isim from nisan where exists
(select urun_isim from mart where mart.urun_isim=nisan.urun_isim)


--Her iki ayda ortak satilmayan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--NİSAN ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.--Her iki ayda ortak satilmayan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--NİSAN ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.

select urun_isim, musteri_isim from  nisan where
not exists (select urun_isim from mart where mart.urun_isim=nisan.urun_isim)


drop table if exists tedarikciler
create table tedarikciler --parent
				(
				vergi_no int primary key,
					firma_ismi varchar(50),
					irtibat_ismi varchar(50)
				);


INSERT INTO tedarikciler VALUES (101, 'IBM', 'Kim Yon');
INSERT INTO tedarikciler VALUES (102, 'Huawei', 'Çin Li');
INSERT INTO tedarikciler VALUES (103, 'Erikson', 'Maki Tammen');
INSERT INTO tedarikciler VALUES (104, 'Apple', 'Adam Eve');


CREATE TABLE urunler -- child
			(
			ted_vergino int, 
			urun_id int, 
			urun_isim VARCHAR(50), 
			musteri_isim VARCHAR(50),
			CONSTRAINT fk_urunler FOREIGN KEY(ted_vergino) 
			REFERENCES tedarikciler(vergi_no)
			on delete cascade
			); 

INSERT INTO urunler VALUES(101, 1001,'Laptop', 'Ayşe Can');
INSERT INTO urunler VALUES(102, 1002,'Phone', 'Fatma Aka');
INSERT INTO urunler VALUES(102, 1003,'TV', 'Ramazan Öz');
INSERT INTO urunler VALUES(102, 1004,'Laptop', 'Veli Han');
INSERT INTO urunler VALUES(103, 1005,'Phone', 'Canan Ak');
INSERT INTO urunler VALUES(104, 1006,'TV', 'Ali Bak');
INSERT INTO urunler VALUES(104, 1007,'Phone', 'Aslan Yılmaz');

-- vergi_no’su 102 olan tedarikcinin firma ismini 'Vestel' olarak güncelleyeniz.

update tedarikciler set firma_ismi ='Vestel' where vergi_no=102;

-- vergi_no’su 101 olan tedarikçinin firma ismini 'casper' ve irtibat_ismi’ni 'Ali Veli' olarak güncelleyiniz.

update tedarikciler set firma_ismi ='casper',
						irtibat_ismi='Ali VELİ'
						where vergi_no=101;
						
select * from tedarikciler;

-- urunler tablosundaki 'Phone' değerlerini 'Telefon' olarak güncelleyiniz.

update urunler set urun_isim='Telefon' where urun_isim='Phone';

-- urunler tablosundaki urun_id değeri 1004'ten büyük olanların
-- urun_id’sini 1 arttırın.
update urunler set urun_id= urun_id+1 where urun_id >1004;

-- urunler tablosundaki tüm ürünlerin urun_id değerini ted_vergino sutun
--değerleri ile toplayarak güncelleyiniz.
update urunler set urun_id = urun_id + ted_vergino;

/*Tablodaki Data Nasil Update Edilir (UPDATE SET)?
* urunler tablosundan Ali Bak’in aldigi urunun ismini, tedarikci
tablosunda irtibat_ismi 'Adam Eve' olan firmanın ismi (firma_ismi)
ile degistiriniz.*/


update urunler set urun_isim=(select firma_ismi from tedarikciler)


