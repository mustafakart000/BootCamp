package thread.CallableExercise;

import java.sql.*;
import java.util.concurrent.*;

public class AmazonProductsTotalPriceCalculator {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/amazon_shopping";
        String username = "root";
        String password = "1234";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
            String query = "Select actual_price, discount_price FROM amazon_products";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            double totalPrice=0.0;
            while(resultSet.next()){

                double actualPrice = resultSet.getDouble("actual_price");
                double discountPercent = resultSet.getDouble("discount_price");
                Callable<Double> task = ()-> calculateTotalPrice(actualPrice,discountPercent);
                Future<Double> future = executorService.submit(task);
                totalPrice += future.get();

            }
            executorService.shutdown();
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Total Price of All Products: " + totalPrice);

        } catch (SQLException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static double calculateTotalPrice(double actualPrice, double discountPercent ){
        return actualPrice * (1- discountPercent/100);
    }


}
