package com.hb03.uni_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {
    public static void main(String[] args) {
        Student03 student01=new Student03();
        student01.setId(1001);
        student01.setName("Atılgan Ulaşan");
        student01.setGrade(90);

        Student03 student02=new Student03();
        student02.setId(1002);
        student02.setName("Atılgan Ulaşan");
        student02.setGrade(56);


        Student03 student03=new Student03();
        student03.setId(1003);
        student03.setName("Errayn");
        student03.setGrade(90);

        Diary diary1= new Diary();
        diary1.setId(101);
        diary1.setName("Atılgan beyin günlüğü");
        diary1.setStudent(student01);

        Diary diary2= new Diary();
        diary2.setId(102);
        diary2.setName("Rıdvan beyin günlüğü");
        diary2.setStudent(student01);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student03.class).
                addAnnotatedClass(Diary.class);
        SessionFactory sf =con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx= session.beginTransaction();


        session.save(student01);
        session.save(student02);
        session.save(student03);
        session.save(diary1);
        session.save(diary2);




        tx.commit();
        session.close();
        sf.close();

    }
}
