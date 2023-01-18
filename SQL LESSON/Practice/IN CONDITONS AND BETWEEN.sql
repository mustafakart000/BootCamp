-- IN CONDITION

/*IN Condition birden fazla mantiksal ifade ile tanimlayabilecegimiz durumlari
(Condition) tek komutla yazabilme imkani verir
AND (ve): Belirtilen şartların her ikiside gerçekleşiyorsa o kayıt listelenir.
OR (veya): Belirtilen şartlardan biri gerçekleşirse, kayıt listelenir.
*/
DROP TABLE if exists musteriler

CREATE TABLE musteriler 
(
urun_id int, 
musteri_isim varchar(50), 
urun_isim varchar(50)
);
INSERT INTO musteriler VALUES (10, 'Mark', 		'Orange'	); 
INSERT INTO musteriler VALUES (10, 'Mark', 		'Orange'	); 
INSERT INTO musteriler VALUES (20, 'John', 		'Apple'		); 
INSERT INTO musteriler VALUES (30, 'Amy', 		'Palm'		); 
INSERT INTO musteriler VALUES (20, 'Mark', 		'Apple'		); 
INSERT INTO musteriler VALUES (10, 'Adem', 		'Orange'	); 
INSERT INTO musteriler VALUES (40, 'John', 		'Apricot'	); 
INSERT INTO musteriler VALUES (20, 'Eddie', 	'Apple'		);
select *from musteriler;

------------------------------------------------------------------------
-- Musteriler tablosundan urun ismi orange, apple veya apricot olan tüm verileri listeleyiniz
SELECT * FROM musteriler where  urun_isim ='Orange' or urun_isim ='Apple' or urun_isim ='Apricot';

SELECT* FROM musteriler
Where urun_isim In ('Orange','Apple','Apricot');
/*
10	"Mark"	"Orange"
10	"Mark"	"Orange"
20	"John"	"Apple"
20	"Mark"	"Apple"
10	"Adem"	"Orange"
40	"John"	"Apricot"
20	"Eddie"	"Apple"
*/

--NOT:yazdıklarımız dışındakileri getirmek içinde NOT IN komutunu yazarız 
--2.ÖRNEK
SELECT* FROM musteriler
Where urun_isim NOT In ('Orange','Apple','Apricot');
-- 30	"Amy"	"Palm"
------------------------------------------------------------------------
------------------------------------------------------------------------

--BETWEEN CONDITION

/*BETWEEN Condition iki mantiksal ifade ile tanimlayabilecegimiz durumlari tek komutla
yazabilme imkani verir. Yazdigimiz 2 sinirda araliga dahildir (INCLUSIVE)*/

-- Musteriler tablosundan urun_id'si 20 ile 40 arasında olan tüm verileri listeleyiniz

select *from musteriler;

SELECT * FROM musteriler WHERE urun_id<20 or urun_id>40;

SELECT * FROM musteriler where urun_id NOT BETWEEN 20 and 40;
--NOT: ARASINDA OLMAYANLARI NOT BETWEEN İLE ÇAĞIRABİLİRİZ.

------------------------------------------------------------------------

/*Practice 6
- id'si 1003 ile 1005 arasında olan personel bilgilerini listeleyiniz
- D ile Y arasındaki personel bilgilerini listeleyiniz
- D ile Y arasında olmayan personel bilgilerini listeleyiniz
- Maaşı 70000 ve ismi Sena olan personeli listeleyiniz */

CREATE table personel
(
ıd char(4),
isim varchar(50),
maas int
);

insert into personel values('1001', 'Ali Can', 		70000);
insert into personel values('1002', 'Veli Mert', 	85000);
insert into personel values('1003', 'Ayşe Tan', 	65000);
insert into personel values('1004', 'Derya Soylu', 	95000);
insert into personel values('1005', 'Yavuz Bal', 	80000);
insert into personel values('1006', 'Sena Beyaz', 	100000);

--id'si 1003 ile 1005 arasında olan personel bilgileri

select * from personel where ıd BETWEEN '1003' and '1005';

--D ile Y arasındaki personel bilgileri

select *from personel where isim between 'D' and 'Y';

--D ile Y arasında olmayan personel bilgileri

select *from personel where isim not between 'D' and 'Y';

--Maaşı 70000 ve ismi Sena olan personeli listesi

select * from personel where maas=70000 or isim='Sena Beyaz';

------------------------------------------------------------------------

