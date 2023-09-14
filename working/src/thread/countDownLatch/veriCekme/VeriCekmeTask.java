package thread.countDownLatch.veriCekme;

import java.sql.*;
import java.util.concurrent.CountDownLatch;

class VeriCekmeTask implements Runnable {
    private String url;
    private String kullaniciAdi;
    private String sifre;
    private String tabloAdi;
    private CountDownLatch latch;

    public VeriCekmeTask(String url, String kullaniciAdi, String sifre, String tabloAdi, CountDownLatch latch) {
        this.url = url;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.tabloAdi = tabloAdi;
        this.latch = latch;
    }

    @Override
    public void run() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Veritabanına bağlanma
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);

            // SQL sorgusu
            String sql = "SELECT * FROM " + tabloAdi;

            // Sorguyu hazırla
            preparedStatement = connection.prepareStatement(sql);

            // Sorguyu çalıştır ve sonuçları al
            resultSet = preparedStatement.executeQuery();

            // Verileri işleme
            while (resultSet.next()) {
                // Veriyi al ve işle
                // Örnek:
                String image = resultSet.getString("image");
                // Verileri kullanarak istediğiniz işlemleri yapabilirsiniz
                System.out.println("image: "+image);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Bağlantıyı kapat
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // CountDownLatch'i azalt
            latch.countDown();
        }
    }
}