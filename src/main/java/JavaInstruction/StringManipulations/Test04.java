package JavaSunctruction.StringManipulations;

public class Test04 {


        ///---> Değişken Tanımlama İşlemleri <---\\\
        private String ayrac = new String(new char[15]).replace("\0", "-");
        private String isim, soyisim, mailAdresi,unvan;
        private int yas, maas;
        ///---> Getter ve Setter Metotlarının Tanımlanması <---\\\
        public void setIsim(String isim) {
            this.isim = isim;
        }
        public String getIsim() {
            return isim;
        }
        public void setSoyisim(String soyisim) {
            this.soyisim = soyisim;
        }
        public String getSoyisim() {
            return soyisim;
        }
        public void setMailAdresi(String mailAdresi) {
            this.mailAdresi = mailAdresi;
        }
        public String getMailAdresi() {
            return mailAdresi;
        }
        public void setUnvan(String unvan) {
            this.unvan = unvan;
        }
        public String getUnvan() {
            return unvan;
        }
        public void setYas(int yas) {
            this.yas = yas;
        }
        public int getYas() {
            return yas;
        }
        public void setMaas(int maas) {
            this.maas = maas;
        }
        public int getMaas() {
            return maas;
        }
        ///---> Elde Ettiğimiz Verileri Ekrana Yazdırmak İçin Metot Oluşturalım <---\\\
        protected  void yazdir(){
            System.out.println(ayrac+"\n < Java Constructor Metot Kullanımı >\n"+ayrac);
            System.out.println("-> Çalışanın bilgileri derlenip konsol ekranına yazdırılmaya hazırlanıyor...\n"+ayrac);
            System.out.println("-> Çalışanın Adı: " + getIsim()+"\n-> Çalışanın Soyismi: "+ getSoyisim()+"\n-> Çalışanın Yaşı: " + getYas());
            System.out.println("-> Çalışanın Unvanı: " + getUnvan() + "\n-> Çalışanın Mail Adresi: "+ getMailAdresi());
            System.out.println("-> Çalışanın Maaşı: " + getMaas() + " TL\n"+ayrac);
    }


    public static void main(String[] args) {

        ///---> Sınıf yapısından nesne türetme işlemini gerçekleştirelim <---\\\
        Test04 employeManager = new Test04();
        ///---> Oluşturmuş olduğumuz nesne içerisindeki değişkenlere veri ataması gerçekleştirelim <---\\\
        employeManager.setIsim("Muzaffer");
        employeManager.setSoyisim("Çağlayan");
        employeManager.setYas(36);
        employeManager.setUnvan("Bilgisayar Mühendisi");
        employeManager.setMailAdresi("muzaffer@gmail.com");
        employeManager.setMaas(9500);
        ///---> Eklemiş olduğumuz verilerin çıktısını kontrol etmek için yazdir() metodunu çağıralım <---\\\
        employeManager.yazdir();
    }
}

