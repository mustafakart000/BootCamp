package com.hb08.manytomany.practice.practice2;

import com.hb08.manytomany.Book08;
import com.hb08.manytomany.Student08;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave08P2 {






    public static void main(String[] args) {


        Student08P2 student1=new Student08P2();
        student1.setId(1001);
        student1.setName("Mustafa kart");
        student1.setGrade(95);

        Student08P2 student2= new Student08P2();
        student2.setId(1002);
        student2.setName("Ismail Kart");
        student2.setGrade(45);

        Student08P2 student3 = new Student08P2();
        student3.setId(1003);
        student3.setName("Ahmet Kart");
        student3.setGrade(23);

        Student08P2 student4 =new Student08P2();
        student4.setName("Muhammet kart");
        student4.setGrade(98);
        student4.setId(1004);

        Book08P2 book1= new Book08P2();
        book1.setId(1);
        book1.setName("A Book");


        Book08P2 book2= new Book08P2();
        book2.setId(2);
        book2.setName("B Book");

        Book08P2 book3= new Book08P2();
        book3.setId(3);
        book3.setName("C Book");

        Book08P2 book4= new Book08P2();
        book4.setId(4);
        book4.setName("D Book");

        student1.getBook08P2List().add(book1);
        student2.getBook08P2List().add(book2);
        student3.getBook08P2List().add(book3);
        book1.getStudent08P2List().add(student1);
        book4.getStudent08P2List().add(student4);



        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student08P2.class).addAnnotatedClass(Book08P2.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);

        tx.commit();
        session.close();
        sf.close();
    }
}
