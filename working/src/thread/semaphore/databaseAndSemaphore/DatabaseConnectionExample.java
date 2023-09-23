package thread.semaphore.databaseAndSemaphore;


import java.util.concurrent.Semaphore;

public class DatabaseConnectionExample {
    private Semaphore semaphore;
    private int maxConnections;

    public DatabaseConnectionExample(int maxConnections) {
        this.maxConnections = maxConnections;
        this.semaphore = new Semaphore(maxConnections);

    }

    public void connectToDatabase(String clientName) throws InterruptedException {
        System.out.println(clientName + " is trying to connect to the database.");

        semaphore.acquire(); // Veritabanı bağlantısı almak için izin iste

        System.out.println(clientName + " has successfully connected to the database.");

        // Veritabanı işlemleri burada yapılır

        Thread.sleep(2000); // Örnek olarak işlem süresini temsil eder

        System.out.println(clientName + " is disconnecting from the database.");

        semaphore.release(); // Veritabanı bağlantısını serbest bırak
    }

    public static void main(String[] args) {
        final DatabaseConnectionExample database = new DatabaseConnectionExample(1); // Maksimum 3 bağlantı izni

        Runnable client1 = () -> {
            try {
                database.connectToDatabase("Client 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable client2 = () -> {
            try {
                database.connectToDatabase("Client 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable client3 = () -> {
            try {
                database.connectToDatabase("Client 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable client4 = () -> {
            try {
                database.connectToDatabase("Client 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(client1);
        Thread thread2 = new Thread(client2);
        Thread thread3 = new Thread(client3);
        Thread thread4 = new Thread(client4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

