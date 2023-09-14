package thread.CallableExercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TableProcessorAmazonShopping {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/amazon_shopping";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String queryUpdate = "UPDATE `amazon_products` SET actual_price = REPLACE(actual_price, '.', '')," +
                    "discount_price = REPLACE(discount_price, '.', '')";

            Statement updateStatement = connection.createStatement();
            updateStatement.executeUpdate(queryUpdate);  // UPDATE sorgusunu çalıştırın
            updateStatement.close();  // Kapatın

            String query = "SELECT * FROM `amazon_products` WHERE actual_price >= 350 && ratings >=4";
            Statement selectStatement = connection.createStatement();
            ResultSet resultSet = selectStatement.executeQuery(query);

            List<Callable<Void>> tasks = new ArrayList<>();
            while (resultSet.next()) {
                String actual_price = resultSet.getString("actual_price");
                String name = resultSet.getString("name");
                double ratings = resultSet.getDouble("ratings");
                Callable<Void> task = () -> {
                    processItem(name, ratings, actual_price);
                    return null;
                };
                tasks.add(task);
            }

            ExecutorService executorService = Executors.newFixedThreadPool(5);
            List<Future<Void>> futures = executorService.invokeAll(tasks);
            for (Future<Void> future : futures) {
                future.get();
            }
            executorService.shutdown();
            resultSet.close();
            selectStatement.close();
            connection.close();

        } catch (SQLException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static void processItem(String name, double ratings, String actual_price) {
        System.out.println("Processing Name: " + name + ", Ratings: " + ratings + " actual_price: " + actual_price);
    }


}
