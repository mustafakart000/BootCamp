--ON DELETE CASCADE 
/* Her defasında önce child tablodaki verileri silmek yerine ON DELETE CASCADE
silme özelliğini aktif hale getirebiliriz.
Bunun için FK olan satırın en sonuna ON DELETE CASCADE komutunu yazmak yeterli*/

CREATE TABLE talebeler2 (
						iid CHAR(3) PRIMARY KEY,
						isim VARCHAR(50),
						veli_isim VARCHAR(50),
						yazili_notu int
						);


INSERT INTO talebeler2 VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO talebeler2 VALUES(124, 'Merve Gul', 'Ayse',85);
INSERT INTO talebeler2 VALUES(125, 'Kemal Yasa', 'Hasan',85);
INSERT INTO talebeler2 VALUES(126, 'Nesibe Yılmaz', 'Ayse',95);
INSERT INTO talebeler2 VALUES(127, 'Mustafa Bak', 'Can',99);

CREATE TABLE notlar (
						talebe_id char(3),
						ders_adi varchar(30),
						yazili_not int,
						CONSTRAINT notlar_fk FOREIGN KEY (talebe_id) REFERENCES talebeler2(iid)
						on delete cascade
					);
					
INSERT INTO notlar VALUES ('123','kimya',75);
INSERT INTO notlar VALUES ('124', 'fizik',65);
INSERT INTO notlar VALUES ('125', 'tarih',90);
INSERT INTO notlar VALUES ('126', 'Matematik',90);


select *from talebeler2;
select *from notlar;

delete from notlar where talebe_id='123'; --child
delete from talebeler2 where iid ='123';
delete from talebeler2 where iid ='126';

select *from talebeler2;
