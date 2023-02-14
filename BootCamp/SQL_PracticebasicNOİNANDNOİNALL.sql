/*======================== SET OPERATORLERI: UNION, UNION ALL==========================
    
    

    UNION: İKİ VEYA DAHA FAZLA SORGU İFADESİNİN SONUC KUMELERİNİ BİRLEŞTİREREK 

	-- TEK BİR SONUC KUMESİ OLUSTURUR.
   
    	   UNION:         SADECE BENZERSİZ VERİLERİ ALIR 

         UNION ALL:     BENZERLİ VERİLERİ DE ALIR
    



    Syntax:
    ----------
    SELECT sutun_adi FROM tablo_adi;
    UNION
    SELECT sutun_adi FROM tablo_adi;
    
   



 NOT:  Birlesik olan Sorgu ifadesinin veri türü diger sorgulardaki 
    ifadelerin veri türü ile uyumlu olmalidir.



======================================================================================*/ 

CREATE TABLE araba 
(
	id int  PRIMARY KEY, 
	marka VARCHAR(50), 
	mensei VARCHAR(50),
	fiyat int, --maas
	model VARCHAR(20) 
);
   
INSERT INTO araba VALUES(123,'Honda', 'Japon', 550000, 'Civic');
INSERT INTO araba VALUES(234,'Citroen', 'Fransız', 450000, 'C3');
INSERT INTO araba VALUES(345,'Volkswagen', 'Alman', 350000, 'Golf'); 
INSERT INTO araba VALUES(348,'Volkswagen', 'Alman', 350000, 'Golf'); 
INSERT INTO araba VALUES(456,'Volkswagen', 'Alman', 600000, 'Polo');
INSERT INTO araba VALUES(567,'Volkswagen', 'Alman', 700000, 'Tiguan');
INSERT INTO araba VALUES(453,'Citroen', 'Fransız', 450000, 'C5');
INSERT INTO araba VALUES(125,'Audi','Alman', 420000, 'Q7');


select * from araba;

/* -----------------------------------------------------------------------------
  SORU1: fiyat'ı 400000’den cok olan araba marka'larını ve  
--fiyat'ı 500000’den cok olan mensei'leri gosteren tekrarsız sorguyu listeleyiniz
------------------------------------------------------------------------------*/

select marka, fiyat from araba where fiyat>40000 UNION select mensei,id from araba where id>240;



/* -----------------------------------------------------------------------------
  SORU2: marka'sı 'Volkswagen' olan arabaların fiyat'larını  ve 
 
--mensei 'Japon' olan arabaların fiyat'larını tekrarsız

--büyükten küçüge dogru siralayarak bir tabloda gosteren sorguyu listeleyiniz.    
------------------------------------------------------------------------------*/


select marka, fiyat from araba where marka ='Volkswagen'
union
select mensei,fiyat from araba where mensei='Japon' order by fiyat desc;

/* -----------------------------------------------------------------------------
  SORU3: 500000’den az fiyat'ı olan arabanın marka, fiyat ve model bilgileri ile,
 
-- 'Golf' model olmayan arabanın marka, fiyat, model bilgilerini

-- tekrarsız gosteren bir sorgu listeleyiniz. 
------------------------------------------------------------------------------*/ 

select marka, fiyat, model,id from araba where fiyat<500000 union
select marka, fiyat, model, id from araba where not model='Golf';






