package com.tpe.annotations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
    public static void main(String[] args) {

        Developer01 dev1= new Developer01(1,"HarryPotter",  "hp@gmail.com",     "backEnd");
        Developer01 dev2= new Developer01(2,"Shrek",        "shrek@gmail.com",  "frontEnd");
        Developer01 dev3= new Developer01(3,"JackSparrow",  "jack@gmail.com",   "mobile");

        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer01.class);

       SessionFactory sf= con.buildSessionFactory();
       Session session= sf.openSession();

       Transaction tx= session.beginTransaction();

       session.save(dev1);
       session.save(dev2);
       session.save(dev3);

       tx.commit();
       sf.close();
       session.close();

    }
}
