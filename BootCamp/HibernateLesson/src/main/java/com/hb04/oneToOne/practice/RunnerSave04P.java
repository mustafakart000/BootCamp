package com.hb04.oneToOne.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04P {


    public static void main(String[] args) {



        Student04P student1= new Student04P();
        student1.setId(1001);
        student1.setName("Emir bey");
        student1.setGrade(85);



        Student04P student2= new Student04P();
        student2.setId(1002);
        student2.setName("Rıdvan A");
        student2.setGrade(85);

        Student04P student3= new Student04P();
        student3.setId(1003);
        student3.setName("Fatih arzu");
        student3.setGrade(85);

        Diary04P diary1= new Diary04P();
        diary1.setId(101);
        diary1.setName("A diary");
        diary1.setStudent04(student2);

        Diary04P diary2= new Diary04P();
        diary2.setId(102);
        diary2.setName("Hasan");
        diary2.setStudent04(student1);

        Diary04P diary3 =new Diary04P();
        diary3.setId(103);
        diary3.setName("Öğrencisi olmayan günlük");


        Configuration con= new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student04P.class).
                addAnnotatedClass(Diary04P.class);

        SessionFactory sf=  con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx =session.beginTransaction();

//              session.save(student1);
//              session.save(student2);
//              session.save(student3);
//
//              session.save(diary1);
//              session.save(diary2);
//                session.save(diary3);

        tx.commit();
        session.close();
        sf.close();
    }

}
