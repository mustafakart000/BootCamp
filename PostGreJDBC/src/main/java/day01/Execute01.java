package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 1. adım: driver'a kaydol.
        Class.forName("org.postgresql.Driver");
        //2. adım: Databas'e bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","swagger534");
        //3.adım: Statment Oluştur.
        Statement st = con.createStatement();
        /*
            execute() methodu DDL(create, drop, alter table) ve DQL(select) için kullanılabilir.
            1) Eğer execute() methodu DDL için kullanılırsa 'false' return yapar.
            2) Eğer execute() methodu DQL için kullanılırsa ResultSet alındığında 'true' aksi hale 'false' verir.
         */
        //4.adım Query çaliştir
        //1.Örnek: "workers" adında bir table oluşturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.
        boolean sql1 = st.execute("CREATE TABLE workers(worker_id varchar(20),worker_name varchar(20), worker_salary int)");
        System.out.println("sql1 = " + sql1);

        //2.Örnek: Table'a worker_address sütunu ekleyerek alter yapın.
        String sql2 = "ALTER TABLE workers ADD worker_address varchar(80)";
        st.execute(sql2);
        String sql3="DROP table workers";
        st.execute("DROP table workers");
        //bağlantı ve statment'ı kapat
    }
}
