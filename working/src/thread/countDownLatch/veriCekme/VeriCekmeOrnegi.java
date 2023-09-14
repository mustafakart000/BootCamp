package thread.countDownLatch.veriCekme;

import java.util.concurrent.CountDownLatch;

public class VeriCekmeOrnegi {
    public static void main(String[] args) {
        // Veritabanına bağlanma bilgileri
        String url = "jdbc:mysql://localhost:3306/amazon_shopping";
        String kullaniciAdi = "root";
        String sifre = "1234";

        // İki CountDownLatch oluşturuyoruz, biri her tablo için
        CountDownLatch applianceLatch = new CountDownLatch(1);
        CountDownLatch carLatch = new CountDownLatch(1);

        // İş parçacıkları oluşturuyoruz
        Thread applianceThread = new Thread(new VeriCekmeTask(url, kullaniciAdi, sifre, "all_appliances", applianceLatch));
        Thread carThread = new Thread(new VeriCekmeTask(url, kullaniciAdi, sifre, "car_and_motorbike", carLatch));

        // İş parçacıklarını başlatıyoruz
        applianceThread.start();
        carThread.start();

        try {
            // Her iki iş parçacığı da tamamlanana kadar bekliyoruz
            applianceLatch.await();
            carLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Veri çekme işlemi tamamlandı
        System.out.println("Veri çekme işlemi tamamlandı.");
    }
}
