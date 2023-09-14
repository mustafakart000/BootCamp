package thread.CallableExercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TableProcessor1 {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/amazon_shopping";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String query = "SELECT * FROM air_conditioners";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Callable<Void>> tasks = new ArrayList<>();

            while (resultSet.next()) {
                String id = resultSet.getString("name");
                double rating = resultSet.getDouble("ratings");

                Callable<Void> task = () -> {
                    processItem(id, rating);
                    return null;
                };

                tasks.add(task);
            }

            ExecutorService executorService = Executors.newFixedThreadPool(5);
            List<Future<Void>> futures = executorService.invokeAll(tasks);

            for (Future<Void> future : futures) {
                future.get(); // Blocking call to ensure all tasks are completed
            }

            executorService.shutdown();

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void processItem(String id, double rating) {
        // Bu metot, verileri işlemek için kullanılabilir
        System.out.println("Processing ID: " + id + ", Rating: " + rating);
    }
}
