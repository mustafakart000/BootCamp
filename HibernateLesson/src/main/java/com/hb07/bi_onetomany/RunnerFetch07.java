package com.hb07.bi_onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RunnerFetch07 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//         !!! get methodu
//       Student07 student =  session.get(Student07.class, 1001);
//        student.getBookList().forEach(System.out::println); // method reference
//        student.getBookList().forEach(b->System.out.println(b)); // lambda expression

        // !!! SQL ile öğrenci bilgilerini alalım ( öğrenci ismi ve kitap ismi )
//        String sqlQuery =
//                "SELECT s.student_name,b.name FROM student07 s INNER JOIN book07 b ON s.id=b.student_id";
//
//        List<Object[]> resulList1 = session.createSQLQuery(sqlQuery).getResultList();
//        for (Object[] object: resulList1) {
//            System.out.println(Arrays.toString(object));
//        }

//        System.out.println();
//        Student07 a2= session.get(Student07.class, 1001);
//        System.out.println("*****************************1001****************************");
//        System.out.println(a2);
//
//        Book07 a= session.get(Book07.class, 101);
//        System.out.println("101");
//        System.out.println(a);
//        System.out.println();


//        String hqlQueryP="DELETE FROM Book07 b WHERE b.name='A Book'  ";
//
//        int numOfDeletedRow=session.createQuery(hqlQueryP).executeUpdate();
//
//        System.out.println(numOfDeletedRow);
//
//        String hqlQueryP2= "update Book07 set name='advance java2 book' where id=101";
//
//        int numOfDeletedRow2=session.createQuery(hqlQueryP2).executeUpdate();
//        System.out.println(numOfDeletedRow2);

//        String hqlQueryP3= "UPDATE FROM Book07 b  Student07 s set s.name='hasan' Where s.student=1001";
//        int numOfDeletedRow3= session.createQuery(hqlQueryP3).executeUpdate();
//        System.out.println(numOfDeletedRow3);   Yanlış oldu çünkü iki table'lı update için doğru yazamadım kodu

//          Student07 student= session.get(Student07.class, 1001);
//       session.delete(student);


       //student.getBookList().set(0,null)//orphanRemovel=true, 0. indexdeki child'ı child tablosundan gider siler

//        student.getBookList().set(2, null);

        ///!!! Book ismi içinde "Java" geçen student kayıtlarını alalım HQL Olarak

        String hqlQuery4= "Select s from Student07 s JOIN s.bookList b WHERE s.id=1002";

        List<Student07> filterBook= session.createQuery(hqlQuery4).getResultList();

        for (Student07 w: filterBook) {
            System.out.println(w);

        }

        // !!! yukardaki sorguyu HQL ile yazalım
//        String hqlQuery =
//                "SELECT s.name,b.name FROM Student07 s INNER JOIN FETCH Book07 b ON s.id=b.student.id";
//        List<Object[]> resultList2 = session.createQuery(hqlQuery).getResultList();
//        resultList2.forEach(oa->System.out.println(Arrays.toString(oa)));

        // !!! Delete işlemi SQL
//        String sqlQuery = "DELETE FROM book07";
//        int numOfDeletedRecords = session.createSQLQuery(sqlQuery).executeUpdate();
//        System.out.println("Silinen kayıt sayısı : " + numOfDeletedRecords);

//        String sqlQuery3 = "DELETE FROM student07";
//        int numOfDeletedRecords2=session.createSQLQuery(sqlQuery3).executeUpdate();
//        System.out.println("Silinen kayit sayisi = "+ numOfDeletedRecords2);

        // !!! Delete işlemi HQL
//        String hqlQuery1 = "DELETE FROM Book07";
//        int numOfDeletedRecords=session.createQuery(hqlQuery1).executeUpdate();
//        System.out.println("Silinen kayit sayisi = "+numOfDeletedRecords);

//        String hqlQuery2 = "DELETE FROM Student07";
//        int numOfDeletedRecords2=session.createQuery(hqlQuery2).executeUpdate();
//        System.out.println("Silinen kayit sayisi = "+numOfDeletedRecords2);

        // Kitap ismi "A Book" olan kitabı HQL ile siliniz
//        String hqlQuery3 ="DELETE FROM Book07 b WHERE b.name='A Book'";
//        int numOfDeletedRecords3 = session.createQuery(hqlQuery3).executeUpdate();
//        System.out.println("Silinen kayit sayisi = "+numOfDeletedRecords3);

        // Kitab bilgisi olan bir Öğrenciyi silmek istersek bunu 2 yolu var :
            // 1) önce Book tablosundan ilişkili olduğu Book lar silinir daha sonra
                    // istenen student objesi silinebilir
            //2) Student entity clasının ilgili yerine Cascade / orphanRemoval

        //
        // !!! 1001 id li student objemi delete metoduyla silelim
//       Student07 student = session.get(Student07.class,1001);
//       session.delete(student);

       //student.getBookList().set(0,null); // orphanRemovel=true , 0.indexdeki child ı Child
            // tablosundan gider siler

        // !!! book ismi içinde "Java" geçen student kayıtlarını alalım ( HQL )
//        String hqlQuery4 =
//                "SELECT s FROM Student07 s JOIN s.bookList b WHERE b.name LIKE '%Java%'";
//        List<Student07> resulList1 = session.createQuery(hqlQuery4, Student07.class).getResultList();
//        for (Student07 student07: resulList1) {
//            System.out.println(student07);
//        }

        tx.commit();
        session.close();
        sf.close();
    }
}
