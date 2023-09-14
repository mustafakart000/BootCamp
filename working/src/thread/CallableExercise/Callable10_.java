package thread.CallableExercise;

import java.sql.*;
import java.util.concurrent.*;

public class Callable10_ {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "1234";
        String table = "customer";
        //Bağlantı oluşturma ve executorService oluşturma
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {

            ExecutorService executor = Executors.newFixedThreadPool(4);

            Callable<Integer> userCountTask = () -> {
                String sql = "SELECT COUNT(*) FROM " + table;
                PreparedStatement statment = connection.prepareStatement(sql);
                ResultSet resultSet = statment.executeQuery();
                resultSet.next();
                return resultSet.getInt(1);
            };


            //Callable'ları submit ederek Future nesneleri elde etme

            Future<Integer> userCountFuture = executor.submit(userCountTask);


            //Future nesneleri kullanarak sonuçları elde etmek
            try {
                int userCount = userCountFuture.get();
                System.out.println("User count: " + userCount);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

            executor.shutdown();
        } catch (SQLException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}