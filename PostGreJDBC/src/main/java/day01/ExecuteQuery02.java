package day01;

import java.sql.*;

public class ExecuteQuery02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. adım: driver'a kaydol.
        Class.forName("org.postgresql.Driver");
        //2. adım: Databas'e bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","swagger534");
        //3.adım: Statment Oluştur.
        Statement st = con.createStatement();

        //1. Örnek: companies tablosundan en yüksek ikinci number_of_employees değeri olan company ve number_of_employees
        // değerlerini çağırın.

        //1.yol en buyuk ikinci
        /*SELECT MAX(number_of_employees) FROM companies
        WHERE number_of_employees < (SELECT MAX(number_of_employees) FROM companies)*/
        //2.yol
        String sql1= "SELECT company, number_of_employees FROM companies ORDER BY number_of_employees DESC OFFSET 1 ROW FETCH NEXT 1 ROW ONLY";

        ResultSet resultSet1= st.executeQuery(sql1);
        while (resultSet1.next()){
            System.out.println(resultSet1.getString("company")+"--"+resultSet1.getInt("number_of_employees"));
        }

        con.close();
        st.close();
        resultSet1.close();

    }
}
