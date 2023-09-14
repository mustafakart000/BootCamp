package thread.CallableExercise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable09 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> userNameFuture = executor.submit(new UserNameRetriever());
        Future<Integer> userCountFuture = executor.submit(new UserCountRetriever());

        try {
            String userName = userNameFuture.get();
            int userCount = userCountFuture.get();

            System.out.println("User Name: " + userName);
            System.out.println("User Count: " + userCount);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

class UserNameRetriever implements Callable<String> {
    @Override
    public String call() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String userName = "";

        try {
            // Veritabanı bağlantısı oluştur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "1234");

            // PreparedStatement oluştur ve sorguyu çalıştır
            preparedStatement = connection.prepareStatement("SELECT first_name FROM actor WHERE actor_id = ?");
            preparedStatement.setInt(1, 11); // Örnek olarak id = 1

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                userName = resultSet.getString("first_name");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Kaynakları serbest bırak
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }

        return userName;
    }
}

class UserCountRetriever implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int userCount = 0;

        try {
            // Veritabanı bağlantısı oluştur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "1234");

            // PreparedStatement oluştur ve sorguyu çalıştır

            preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS count FROM actor");

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                userCount = resultSet.getInt("count");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Kaynakları serbest bırak
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }

        return userCount;
    }
}

