CREATE TABLE ogrenciler3(
	ogrenci_no char(7),--Uzunluğunu bildiğimiz Stringler için CHAR kullanılır.
	isim varchar(20),
	soyisim varchar(25),
	not_ort real,--ondalıklı sayılar için (double gibi)
	kayit_tarih date
	
	--VAROLAN BİR TABLODAN YENİ BİR TABLO OLUŞTURMA
CREATE TABLE NOTLAR
AS
SELECT isim, not_ort FROM ogrenciler3;
	
	select * from notlar;
	--Tablo içine veri ekleme
	INSERT INTO notlar VALUES ('Atse', 96.5);
	INSERT INTO notlar VALUES ('Ali', 12.5);
	INSERT INTO notlar VALUES ('mehmet', 43.5);
	INSERT INTO notlar VALUES ('Osman', 67.5);
	INSERT INTO notlar VALUES ('kemal', 77.5);
	INSERT INTO notlar VALUES ('zülfükar', 54.5);