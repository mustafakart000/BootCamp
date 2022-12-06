create table ogrenciler
(
id int PRIMARY KEY,
isim varchar(40),
adres varchar(100),
sinav_notu int
);

--- INSERT:Veritabanına yeni veri ekler.
insert into ogrenciler values(120, 'Ali Can', 'Ankara', 75);
insert into ogrenciler values(121, 'Veli Mert', 'Trabzon', 85);
insert into ogrenciler values(122, 'Ayşe Tan', 'Bursa', 65);
insert into ogrenciler values(123, 'Derya Soylu', 'Istanbul', 95);
insert into ogrenciler values(124, 'Yavuz Bal', 'Ankara', 85);
insert into ogrenciler values(125, 'Emre Gül', 'Hatay', 90);
insert into ogrenciler values(126, 'Harun Reşit', 'Isparta', 100);
select * from ogrenciler;

--SORU: ogrenciler tablosundaki id ve isim sütununu getiriniz.

select id, isim from ogrenciler;

--SORU: Sınav notu 80'den büyük olan öğrencilerin tüm bilgilerini listele

select * from ogrenciler where sinav_notu>80;

select * from ogrenciler where sinav_notu  Between 80 and 100;

--SORU: Adresi Ankara olan ögrencilerin tüm bilgilerini listele

select * from ogrenciler where adres='Ankara'

delete from ogrenciler where isim ='Ali Can'

--SORU: Sınav notu 85 ve adresi Ankara olan öğrenci ismini listele

select isim from ogrenciler where adres='Ankara' and sinav_notu=85;

select isim from ogrenciler where adres IN 'Ankara' or 'Isparta';

select * from ogrenciler where sinav_notu Between 65 And 85;
select * from ogrenciler where sinav_notu In(65,85);
--SORU: .id'si 122 ve 125 arasında olmayan ögrencilerin isim ve sınav notu listele
select id,isim, sinav_notu from ogrenciler where not id between 122 and 125;
 
delete from ogrenciler where  sinav_notu between 75 and 90;
select * from ogrenciler;

--SORU: adres'i Trabzon olan satırı siliniz
delete from ogrenciler where adres='trabzon';
--SORU: ismi Derya Soylu veya Yavuz Bal olan satırları siliniz
delete from ogrenciler where isim='Derya Soylu' or isim='Yavuz Bal';
--SORU: sınav notu 100 den küçük olan satırları siliniz
delete from ogrenciler where sinav_notu<100;

----SORU: Tablodaki tüm satırları siliniz
delete from ogrenciler;
select * from ogrenciler;
TRUNCATE TABLE ogrenciler;

/*SORU: memurlar isminde bir tablo oluşturunuz. id, isim, maas sutunları olsun.
id sutununun data tipi int olsun. PRİMARY KRY kısıtlaması olsun.
isim sutununun data tipi varchar(30) olsun. UNIQUE kısıtlaması olsun.
maas sutununun data tipi int olsun. maas 5000 buyuk olsun. NOT NULL kısıtlaması olsun.
white_check_mark
raised_hands
pray*/

CREATE TABLE memurlar(
						id int PRIMARY KEY,
						isim varchar(30) UNIQUE,
						maas int check (maas>5000) NotNull;
						
						)

