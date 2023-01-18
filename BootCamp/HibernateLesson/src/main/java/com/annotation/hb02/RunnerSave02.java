package com.annotation.hb02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {
    public static void main(String[] args) {





        Address address01= new Address();
        address01.setStreet("Apple Street");
        address01.setCity("NewYork");
        address01.setZipCode("06852");
        address01.setCountry("US");

        Address address02= new Address();
        address02.setStreet("Orange Street");
        address02.setCity("London");
        address02.setZipCode("03452");
        address02.setCountry("England");

        Student02 student01= new Student02();
        student01.setId(1001);
        student01.setName("Daffy Kabukcu");
        student01.setGrade(90);
        student01.setAddress(address01);

        Student02 student02= new Student02();
        student02.setId(1002);
        student02.setName("Beyza Keser");
        student02.setGrade(90);
        student02.setAddress(address02);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
        SessionFactory sf =con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx= session.beginTransaction();


        session.save(student01);
        session.save(student02);




        tx.commit();
        session.close();
        sf.close();


    }



}
