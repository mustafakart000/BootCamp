package com.hb06.oneTomany.practice2;

import com.hb06.oneTomany.Book06;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave05 {
    public static void main(String[] args) {


        Student06P student1= new Student06P();
        Student06P student2= new Student06P();
        Student06P student3= new Student06P();

        student1.setId(1001);
        student1.setName("Betül Şener");
        student1.setId(1001);
        student1.setName("Betul Şener");
        student1.setGrade(75);

        student2.setId(1002);
        student2.setName("Tarik bey");
        student2.setGrade(75);

        student3.setId(1003);
        student3.setName("Ömer çelebi");
        student3.setGrade(75);

        Book06P book1= new Book06P();
        book1.setId(101);
        book1.setName("Art Book");

        Book06P book2= new Book06P();
        book2.setId(102);
        book2.setName("Math Book");

        Book06P book3= new Book06P();
        book3.setId(103);
        book3.setName("Java Book");

        student1.getBookList().add(book1);
        student1.getBookList().add(book2);
        student2.getBookList().add(book3);


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student06P.class).addAnnotatedClass(Book06P.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(book1);
        session.save(book2);
        session.save(book3);

        session.save(student1);
        session.save(student2);
        session.save(student3);

        tx.commit();
        session.close();
        sf.close();

    }
}
