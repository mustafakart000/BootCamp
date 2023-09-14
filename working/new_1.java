import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiTableExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/library";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            ExecutorService executor = Executors.newFixedThreadPool(2);

            // Kitap sayısını çeken Callable
            Callable<Integer> bookCountTask = () -> {
                String sql = "SELECT COUNT(*) FROM books";
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                return resultSet.getInt(1);
            };

            // Yazar sayısını çeken Callable
            Callable<Integer> authorCountTask = () -> {
                String sql = "SELECT COUNT(*) FROM authors";
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                return resultSet.getInt(1);
            };

            // Callable'ları submit ederek Future nesneleri elde etme
            Future<Integer> bookCountFuture = executor.submit(bookCountTask);
            Future<Integer> authorCountFuture = executor.submit(authorCountTask);

            // Future nesnelerini kullanarak sonuçları elde etme
            try {
                int bookCount = bookCountFuture.get();
                int authorCount = authorCountFuture.get();
                System.out.println("Book Count: " + bookCount);
                System.out.println("Author Count: " + authorCount);
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
