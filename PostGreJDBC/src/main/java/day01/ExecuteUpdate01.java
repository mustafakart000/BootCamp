package day01;

import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 1. adım: driver'a kaydol.
        Class.forName("org.postgresql.Driver");
        //2. adım: Databas'e bağlan
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","swagger534");
        //3.adım: Statment Oluştur.
        Statement st = con.createStatement();
        //1. Örnek: number_of_employees değeri ortalama çalışan sayısından
        // az olan number_of_employees değerlerini 16000 olarak UPDATE edin.

        String sql1="UPdate companies set number_of_employees= 16000 where number_of_employees<(select avg(number_of_employees) from companies)";
        int updateEdilenSatirSayisi=st.executeUpdate(sql1);
        System.out.println("updateEdilenSatirSayisi = " + updateEdilenSatirSayisi);
        ResultSet resultSet1= st.executeQuery("Select * from companies");
        while (resultSet1.next()){
            System.out.println(resultSet1.getInt(1)+"--"+resultSet1.getString(2)+"--"+resultSet1.getInt(1));
        }

    }
}
