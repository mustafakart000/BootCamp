package com.hb06.oneTomany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch06 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student06.class).addAnnotatedClass(Book06.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // !!! get methodu
//        Student06 student = session.get(Student06.class,1001);
//        System.out.println(student);

        // !!! HQL ile id si 101 olan kitabı getirelim
//        String hqlQuery1 = "FROM Book06 b WHERE b.id=101";
//        Book06 book1 = session.createQuery(hqlQuery1, Book06.class).uniqueResult();
//        System.out.println(book1);

        // !!! HQL bir öğrencinin kitaplarını öğrenci id ye göre getirme
        String hqlQuery2=
                "SELECT b.id, b.name FROM Student06 s INNER JOIN s.bookList b WHERE s.id=1001";
        List<Object[]> resultList1= session.createQuery(hqlQuery2).getResultList();
        resultList1.forEach(oa-> System.out.println(Arrays.toString(oa)));

        // !!! get() ile bir öğrencinin kitaplarını öğrenci id ye göre getirme
//        Student06 student = session.get(Student06.class,1001);
//        System.out.println(student.getBookList());


        tx.commit();
        session.close();
        sf.close();
    }
}
