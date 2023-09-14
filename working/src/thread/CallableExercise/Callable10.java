package thread.CallableExercise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable10 {



    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "1234";
        String table = "actor";
        // Bağlantı oluşturma ve ExecutorService oluşturma
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            ExecutorService executor = Executors.newFixedThreadPool(4);

            // Kullanıcı adlarını çekip paralel olarak işleme koymak için Callable oluşturma
            Callable<Integer> userCountTask = () -> {
                String sql = "SELECT COUNT(*) FROM " + table;
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                return resultSet.getInt(1);
            };

            // Callable'ları submit ederek Future nesneleri elde etme
            Future<Integer> userCountFuture = executor.submit(userCountTask);

            // Future nesnelerini kullanarak sonuçları elde etme
            try {
                int userCount = userCountFuture.get();
                System.out.println("User Count: " + userCount);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // ExecutorService kapatma
            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


