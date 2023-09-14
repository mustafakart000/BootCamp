package thread.semaphore.databaseAndSemaphore;

import java.sql.*;
import java.util.concurrent.Semaphore;

public class MySqlAndSemaphore {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/amazon_shopping";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";
    private static final int MAX_DB_CONNECTIONS = 3; // Maksimum 3 veritabanı bağlantısı izni

    private final Semaphore semaphore;
    private Connection dbConnection;

    public MySqlAndSemaphore() {
        this.semaphore = new Semaphore(MAX_DB_CONNECTIONS);
    }

    public void connectToDatabase() throws InterruptedException {
        semaphore.acquire(); // Veritabanı bağlantısı almak için izin iste

        try {
            dbConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connection established.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getTotalProductCount() {
        int totalProductCount = 0;

        try {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM car_and_motorbike");

            if (resultSet.next()) {
                totalProductCount = resultSet.getInt(1);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalProductCount;
    }

    public void disconnectFromDatabase() {
        try {
            dbConnection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        semaphore.release(); // Veritabanı bağlantısını serbest bırak
    }

    public static void main(String[] args) {
        MySqlAndSemaphore database = new MySqlAndSemaphore();

        Runnable client1 = () -> {
            try {
                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client1 Total product count: " + totalCount);
                database.disconnectFromDatabase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable client2 = () -> {
            try {
                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client2 Total product count: " + totalCount);
                database.disconnectFromDatabase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable client3 = () -> {
            try {
                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client3 Total product count: " + totalCount);
                database.disconnectFromDatabase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(client1);
        Thread thread2 = new Thread(client2);
        Thread thread3 = new Thread(client3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
