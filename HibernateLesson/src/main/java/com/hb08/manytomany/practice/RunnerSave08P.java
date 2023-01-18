package com.hb08.manytomany.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class RunnerSave08P {
    public static void main(String[] args) {
        Student08P student1 = new Student08P();
        student1.setId(1001);
        student1.setName("Şeyman Özçam");
        student1.setGrade(95);


        Student08P student2 = new Student08P();
        student2.setId(1002);
        student2.setName("Recep Bey");
        student2.setGrade(95);

        Student08P student3 = new Student08P();
        student3.setId(1003);
        student3.setName("Emir Bey");
        student3.setGrade(95);

        Book08P book1 = new Book08P();
        book1.setId(101);
        book1.setName("Art Book");

        Book08P book2 = new Book08P();
        book2.setId(102);
        book2.setName("Math Book");

        List<Book08P> bookList1 = new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);
        student1.setBook08PList(bookList1);

        List<Book08P> bookList2 = new ArrayList<>();
        bookList2.add(book1);
        bookList2.add(book2);
        student2.setBook08PList(bookList2);

        List<Book08P> bookList3 = new ArrayList<>();
        bookList3.add(book1);
        student3.setBook08PList(bookList3);


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student08P.class).addAnnotatedClass(Book08P.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(student3);

        session.save(book1);
        session.save(book2);

        tx.commit();
        session.close();
        sf.close();
    }
}
