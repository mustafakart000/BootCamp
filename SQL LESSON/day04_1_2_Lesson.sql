--ÖDEV- Ankara’da calisani olan markalarin marka id'lerini ve calisan 
--sayilarini listeleyiniz

select marka_id, calisan_sayisi as ankarada_cal_id from markalar where
marka_isim IN(select isyeri from calisanlar2 where sehir='Ankara' );
select* from markalar
select * from calisanlar2

--------------------------------------------------------------------------------

--ALIASES
drop table if exists calisanlar02
CREATE TABLE calisanlar02 (
calisan_id char(9),
calisan_isim varchar(50),
calisan_dogdugu_sehir varchar(50)
);
select * from calisanlar02;

INSERT INTO calisanlar02 VALUES(123456789, 'Ali Can', 'Istanbul'); 
INSERT INTO calisanlar02 VALUES(234567890, 'Veli Cem', 'Ankara'); 
INSERT INTO calisanlar02 VALUES(345678901, 'Mine Bulut', 'Izmir');

--Eğer iki sutunu birleştirmek stersek aşağıdaki örnekteki gibi concat kullanabılırız.
Select calisan_id AS id, calisan_isim || calisan_dogdugu_sehir as Calisan_yer_dogdugu_yer from calisanlar02 
--2. yol
Select calisan_id AS id, concat (calisan_isim,' ', calisan_dogdugu_sehir) as Calisan_yer_dogdugu_yer from calisanlar02 
--eğer boşluk koymak istersek birleştirme arasına örnek => calisan_isim || ' ' || calisan_dogdugu_sehir


--IS NULL CONDITION(Arama yapılan kayıtta nul değerleri gösterir.)

Create table insanlar 
(
ssn char(9),
name varchar(50),
	adres varchar(50)
	);
	
INSERT INTO insanlar VALUES(123456789, 'Ali Can', 'Istanbul');  
INSERT INTO insanlar VALUES(234567890, 'Veli Cem', 'Ankara');  
INSERT INTO insanlar VALUES(345678901, 'Mine Bulut', 'Izmir');  
INSERT INTO insanlar (ssn, adres) VALUES(456789012, 'Bursa'); 
INSERT INTO insanlar (ssn, adres) VALUES(567890123, 'Denizli');
select * from insanlar

select ssn,name from insanlar where name is null;

--is not null means  it call other values

select ssn,name from insanlar where name is not null;

--Insanlar tablosunda null değer almış verileri no name değiştiriniz

update insanlar
set name='no name' where name is null;


--ORDER BY CLAUSE
/*
	ORDER BY komutu belli bir field’a gore NATURAL ORDER olarak siralama
	yapmak icin kullanilir
	ORDER BY komutu sadece SELECT komutu Ile kullanilir
	
	
Tablolardaki verileri sıralamak için ORDER BY komutu kullanırız
Büyükten küçüğe yada küçükten büyüğe sıralama yapabiliriz
Default olarak küçükten büyüğe sıralama yapar (asc yazmaya gerek yok)
Eğer BÜYÜKTEN KÜÇÜĞE sıralmak istersek ORDER BY komutundan sonra DESC komutunu kullanırız

*/

drop table if exists insanlar
CREATE TABLE insanlar
(
ssn char(9),
isim varchar(50),
soyisim varchar(50),  
adres varchar(50)
);
INSERT INTO insanlar VALUES(123456789, 'Ali','Can', 'Istanbul');
INSERT INTO insanlar VALUES(234567890, 'Veli','Cem', 'Ankara');  
INSERT INTO insanlar VALUES(345678901, 'Mine','Bulut', 'Ankara');  
INSERT INTO insanlar VALUES(256789012, 'Mahmut','Bulut', 'Istanbul'); 
INSERT INTO insanlar VALUES (344678901, 'Mine','Yasa', 'Ankara');  
INSERT INTO insanlar VALUES (345678901, 'Veli','Yilmaz', 'Istanbul');

--Insanlar tablosundaki datalari adres’e gore siralayin

select * from insanlar;
SELECT * from insanlar order BY adres;
SELECT * from insanlar order BY isim;

select * from insanlar where isim='Mine' order by ssn;
-- ssn yerine columns sayısı olan 2'i de yazılabilir.
--2. yolüsteki komutla aynı sonucu verir 
select * from insanlar where soyisim='Bulut' order by 2; 


--Insanlar tablosundaki tum kayitlari SSN numarasi buyukten kucuge olarak siralayin
select *from insanlar order by ssn desc; --desc tersini alma

-- Insanlar tablosundaki tum kayitlari isimler Natural sirali, 
--						Soyisimler ters sirali olarak listeleyin
select * from insanlar order by isim asc, soyisim desc;

-- İsim ve soyisim değerlerini soyisim kelime uzunluklarına göre sıralayınız
select isim,soyisim from insanlar order by isim, LENGTH (soyisim);
-- Tüm isim ve soyisim değerlerini aynı sutunda çağırarak her bir sütun değerini
-- uzunluğuna göre sıralayınız.
select isim|| ' '|| soyisim as isim_soyisim from insanlar order by length (isim||soyisim);

--GROUP BY CLAUSE
CREATE TABLE manav
(
isim varchar(50),  Urun_adi varchar(50),  Urun_miktar int
);

INSERT INTO manav VALUES( 'Ali', 'Elma', 5);
INSERT INTO manav VALUES( 'Ayse', 'Armut', 3);
INSERT INTO manav VALUES( 'Veli', 'Elma', 2);
INSERT INTO manav VALUES( 'Hasan', 'Uzum', 4);
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);
INSERT INTO manav VALUES( 'Ayse', 'Elma', 3);
INSERT INTO manav VALUES( 'Veli', 'Uzum', 5);
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);
INSERT INTO manav VALUES( 'Veli', 'Elma', 3);
INSERT INTO manav VALUES( 'Ayse', 'Uzum', 2);

select * from manav

--Isme gore alinan toplam urunleri bulun ve urunleri büyükten kucuge sıralayınız.
select isim, sum(urun_miktar) as alinan_toplam_ürün from manav
GROUP BY isim
order by alinan_toplam_ürün desc;

-- urun ismine göre urunu alan toplam kisi sayısı.

select urun_adi, count(isim) from manav
GROUP BY urun_adi;