-- FOREGIN KEY --> Başka bir tablodaki PRİMARY KEY'i referans göstermek için kullanılır.
-- Böylelikle, tablolar arasında parent child ilişkisi oluşur.
-- NOT: parent tabloda olmayan primary key ile child tabloya veri girişi yapılamaz
-- child tablo null deger kabul eder
-- NOT: child tablodaki veri silinmeden parent tablodaki veri silinemez
-- NOT: child tablo silinmeden parent tablo silinemez


create table hastaneler
(
hastane_adi varchar(30) PRIMARY KEY,
adres varchar(30),
alan_kodu int
);



insert into hastaneler values('Meddem', 'Isparta', '0246');
insert into hastaneler values('Sifa', 'Ankara', '0236');
insert into hastaneler values('Davraz', 'Istanbul', '0216');
insert into hastaneler values('Deva', 'Antalya', '0242');








create table doktorlar
(
gorev_yeri varchar(30),
doktor_adi varchar(30),
diploma_no int,
brans_adı varchar(30),
	
CONSTRAINT fk FOREIGN KEY(gorev_yeri) REFERENCES hastaneler(hastane_adi)
);




insert into doktorlar values('Meddem', 'Hasan Bal', '123456', 'psikiyatri');
insert into doktorlar values('Sifa', 'Vedat Sen', '123865', 'pediatri');
insert into doktorlar values('Davraz', 'Huseyin Oz', '123568', 'noroloji');
insert into doktorlar values('Deva', 'Ahmet Kar', '123852', 'dahiliye');
insert into doktorlar values('Meddem', 'Hakan Kar', '123369', 'dermatoloji');
insert into doktorlar values('Sifa', 'Ramiz Kara', '123147', 'anestezi');
insert into doktorlar values('Davraz', 'Okan Pul', '123147', 'ortopedi');





--SORU 1: doktorlar tablosuna gorev_yeri 'Meddem' olan veri girişi yapınız

select * from doktorlar;

insert into doktorlar values('Meddem','Muammer sarac', 123459,'ortopedi');
-- Eğer ki primary key olan gorev_yeri sutunun da ki 'meddem' olmasaydı child table'a bu eklemeyi yapamazdık
--Aşağıdaki örnekteki gibi

--SORU 2: .doktorlar tablosuna gorev_yeri 'Okmeydanı' olan veri girişi yapınız.

insert into doktorlar values('Okmeydanı', 'Hasan Ali', 123458, 'psikiyatri');

--ERROR:  insert or update on table "doktorlar" violates foreign key constraint "fk"
--DETAIL:  Key (gorev_yeri)=(Okmeydanı) is not present in table "hastaneler".

--SORU 3: doktorlar tablosunda gorev_yeri null olan veri girişi yapınız.

select * from doktorlar;

insert into doktorlar values(null, 'Goksel celik', 983243, 'dahiliye');

--SORU 4: .hastaneler tablosundaki hastane_adi 'Meddem' olan veriyi siliniz.

--child tablodaki veri silinmeden parent tablodaki veri silinemez.

delete from hastaneler where hastane_adi='Meddem';
-- ERROR:  update or delete on table "hastaneler" violates foreign key constraint "fk" on table "doktorlar"
-- DETAIL:  Key (hastane_adi)=(Meddem) is still referenced from table "doktorlar".

--SORU 5: doktorlar tablosundaki gorev_yeri 'Meddem' olan verileri siliniz

delete from doktorlar where gorev_yeri ='Meddem';

--SORU 6: .hastaneler tablosundaki hastane_adi 'Meddem' olan veriyi siliniz
--yukardaki 4. soruyu tekrar deneyelim Meddem Silindiği için artık hata vermeyecektir.

delete from hastaneler where hastane_adi='Meddem';

--SORU 7: .hastaneler tablosunu siliniz.

--Child table silinmeden parent table silinemez bu yüzden parent olan hastaneler tablosu silinemez.

drop table hastaneler;
-- ERROR:  cannot drop table hastaneler because other objects depend on it
-- DETAIL:  constraint fk on table doktorlar depends on table hastaneler
-- HINT:  Use DROP ... CASCADE to drop the dependent objects too.


--SORU 8: doktorlar tablosunu siliniz

drop table doktorlar;


--SORU 9: .hastaneler tablosunu siliniz
-- artık 7. soruyu burada gerçekleştirebliriz çünkü 8. soruda doktorlar tablosunu sildik.
drop table hastaneler;

-- DROP TABLE
-- Query returned successfully in 82 msec.

























