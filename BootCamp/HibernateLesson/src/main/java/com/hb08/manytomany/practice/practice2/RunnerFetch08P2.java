package com.hb08.manytomany.practice.practice2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08P2 {


    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student08P2.class).addAnnotatedClass(Book08P2.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Student08P2 s1001= session.get(Student08P2.class, 1001);

        System.out.println(s1001);








        tx.commit();
        session.close();
        sf.close();

    }
}

