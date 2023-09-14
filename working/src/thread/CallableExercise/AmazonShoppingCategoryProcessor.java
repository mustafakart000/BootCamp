package thread.CallableExercise;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AmazonShoppingCategoryProcessor {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/amazon_shopping";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String query = "SELECT DISTINCT main_category FROM `amazon_products`";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            ExecutorService executorService = Executors.newFixedThreadPool(5);

            List<Callable<Object>> tasks = new ArrayList<>(); // Callable<Object> kullanıyoruz
            while (resultSet.next()) {
                String mainCategory = resultSet.getString("main_category");
                Callable<Object> task = () -> {
                    processCategory(mainCategory, connection);
                    return null;
                };
                tasks.add(task);
            }

            List<Future<Object>> futures = executorService.invokeAll(tasks);
            for (Future<Object> future : futures) {
                future.get();
            }

            executorService.shutdown();
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void processCategory(String category, Connection connection) throws SQLException {
        String query = "SELECT * FROM `amazon_products` WHERE main_category = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, category);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String productName = resultSet.getString("name");
            double price = resultSet.getDouble("actual_price");
            System.out.println("Processing product: " + productName + " in category: " + category +
                    ", Price: " + price);
        }

        resultSet.close();
        preparedStatement.close();
    }

}
