package thread.CallableExercise;

import java.sql.*;

public class TableProcessor {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/amazon_shopping";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String query = "SELECT * FROM air_conditioners";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String id = resultSet.getString("name");
                double rating = resultSet.getDouble("ratings");

                // Burada verilere istediğiniz gibi erişebilirsiniz
                // Örnek: Verileri ekrana yazdırma
                System.out.println("ID: " + id);
                System.out.println("Rating: " + rating);

                System.out.println("------------------------");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
