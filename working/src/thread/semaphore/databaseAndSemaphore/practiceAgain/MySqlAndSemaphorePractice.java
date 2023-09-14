package thread.semaphore.databaseAndSemaphore.practiceAgain;

import java.sql.*;
import java.util.concurrent.Semaphore;

public class MySqlAndSemaphorePractice {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/amazon_shopping";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";
    private static final int MAX_DB_CONNECTIONS = 3; //Maksimum 3 veritabanı bağlantısı izni;
    private final Semaphore semaphore;
    private Connection dbConnection;

    public MySqlAndSemaphorePractice( ) {
        this.semaphore = new Semaphore(MAX_DB_CONNECTIONS);
    }

    public void connectToDatabase() throws InterruptedException, SQLException {

        semaphore.acquire();

        dbConnection = DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD);

        System.out.println(" Database Connection  established. ");

    }

    public int  getTotalProductCount(){

        int totalProductCount =0;
        try {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet =statement.executeQuery("SELECT COUNT(*) FROM car_and_motorbike");
            if(resultSet.next()) {
                totalProductCount = resultSet.getInt(1);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalProductCount;
    }

    public void disconnectFromDataBase(){

        try {
            dbConnection.close();
            System.out.println(" DataBase connection closed. ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        semaphore.release();// veri taban bağlantısını serbest bırak

    }

    public static void main(String[] args) {
       final MySqlAndSemaphorePractice database = new MySqlAndSemaphorePractice();

        Runnable client1 = ()-> {
            try {
                System.out.println("client1 wants to connect to database ");
                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client1 Total product count: " + totalCount);
                database.disconnectFromDataBase();
                System.out.println("Client1 cut connect");
            } catch (InterruptedException | SQLException e) {
                e.printStackTrace();
            }
        };


        Runnable client2 = () -> {
            try {
                System.out.println("client2 wants to connect to database ");

                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client2 Total product count: " + totalCount);
                database.disconnectFromDataBase();
                System.out.println("Client2 cut connect");
            } catch (InterruptedException | SQLException e) {
                e.printStackTrace();
            }
        };


        Runnable client3 = ()->{

            try {
                System.out.println("client3 wants to connect to database ");
                database.connectToDatabase();
                int totalCount = database.getTotalProductCount();
                System.out.println("Client3 Total product count: " + totalCount);
                database.disconnectFromDataBase();
                System.out.println("Client3 cut connect");
            } catch (InterruptedException | SQLException e) {
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
