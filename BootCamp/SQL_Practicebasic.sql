create table film
(
film_no int PRIMARY KEY,
film_ismi varchar(30),
film_turu varchar(30)
);

insert into film values (100, 'Eyvah Eyvah', 'Komedi');
insert into film values (200, 'Kurtlar Vadisi', 'Aksiyon');
insert into film values (300, 'Eltilerin Savasi', 'Komedi');
insert into film values (400, 'Aile Arasinda', 'Komedi');
insert into film values (500, 'GORA', 'Bilim Kurgu');
insert into film values (600, 'Organize Isler', 'Komedi');
insert into film values (700, 'Babam ve Oglum', 'Dram');









create table oyuncu
(
film_id int,
oyuncu_yası int,
oyuncu_ismi varchar(30),
memleketi varchar(30),

CONSTRAINT fk FOREIGN KEY(film_id) REFERENCES film(film_no)
on delete cascade
);

insert into oyuncu values (100, 38, 'Ata Demirer', 'Tekirdag');
insert into oyuncu values (200, 42, 'Necati Sasmaz', 'Ankara');
insert into oyuncu values (300, 32, 'Gupse Ozay', 'Istanbul');
insert into oyuncu values (400, 35, 'Engin Gunaydin', 'Izmir');
insert into oyuncu values (500, 43, 'Cem Yilmaz', 'Istanbul');


select * from film 



-- SORU1: film_no’su 300 olan film'in
--film_ismi'ni Recep İvedik olarak güncelleyeniz.


update film  set film_ismi ='Recep İvedik' where film_no=300;


--  SORU2: film tablosundaki tüm film_turu'nu 'Aksiyon' olarak güncelleyeniz.

update film  set film_turu ='Aksiyon';


-- SORU3: film_no’su 100 olan film'in
--film_ismi'ni 'Cakallarla Dans' , film_turu’nu 'Komedi' olarak güncelleyiniz.

update film set film_ismi='Cakallarla Dans',film_turu ='Komedi' where film_no=100;


-- SORU4: film_ismi 'Babam ve Oglum' olan film'in
--film_turu'nu 'Dram' olarak güncelleyiniz.

update film set film_turu = 'Dram' where film_ismi = 'Babam ve Oglum'

-- SORU5: oyuncu tablosundaki 'Tekirdag' değerini,
-- 'Edirne' olarak güncelleyiniz.

update oyuncu set memleketi = 'Edirne' where memleketi ='Tekirdag';

-- SORU6: oyuncu tablosundaki oyuncu_yası değeri 40'dan büyük olanların,
 --oyuncu_yası'ını 1 artırarak güncelleyiniz.
 
 update oyuncu set oyuncu_yası =oyuncu_yası+1 where oyuncu_yası >40;
