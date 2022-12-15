/*
UPDATE tablo_adi
SET sutun_ismi = 'istenen veri' WHERE sutun_ismi='istenen veri'
*/
UPDATE tedarikciler
SET firma_ismi = 'Vestel' WHERE vergi_no=102;
-- vergi_no’su 101 olan tedarikçinin firma ismini 'casper' ve irtibat_ismi’ni 'Ali Veli' olarak güncelleyiniz.
UPDATE tedarikciler
SET firma_ismi = 'Casper',irtibat_ismi='Ali Veli' WHERE vergi_no=101
--  urunler tablosundaki 'Phone' değerlerini 'Telefon' olarak güncelleyiniz.
UPDATE urunler
SET urun_isim = 'Telefon' WHERE urun_isim='Phone';