package PracticeAdvenced.practice.Practice06.Again.Kitap_─░nheritance;



    public class Kitap {
            String kitapAdi;
            String yazarAdi;
            int sayfaSayisi;
            String seriNo;
            String seriNo2="serino2";
            static int kitapSayisi;

            public Kitap(String kitapAdi, String yazarAdi, int kitapSayisi) {
                this.kitapAdi = kitapAdi;
                this.yazarAdi = yazarAdi;
                this.sayfaSayisi = sayfaSayisi;
                kitapSayisi++;

                seriNo = yazarAdi.substring(0, 2) + kitapAdi.substring(0, 2) + kitapSayisi;
            }

            public void kitapBilgileri() {
                System.out.println("Kitap adi: " + kitapAdi + "\nYazar Adi: " +
                        yazarAdi + "\nSayfa Sayisi" +
                        sayfaSayisi + "\nSeriNo: " + seriNo+ " " +seriNo2+"serino3");

                System.out.println("=========================================================");
            }
        }



