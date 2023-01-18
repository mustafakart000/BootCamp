package com.hb05.manytoone.practice2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave05P {
    public static void main(String[] args) {

        Student05P student1= new Student05P();
        student1.setId(1001);
        student1.setName("Atılgan şahin");
        student1.setGrade(90);


        Student05P student2= new Student05P();
        student2.setId(1002);
        student2.setName("Errayn");
        student2.setGrade(70);

        Student05P student3= new Student05P();
        student3.setId(1003);
        student3.setName("Emir");
        student3.setGrade(70);

        University05P university1= new University05P();
        university1.setId(1);
        university1.setName("TPE uni");

        student1.setUniversity(university1);
        student1.setUniversity(university1);
        student1.setUniversity(university1);

        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student05P.class).
                addAnnotatedClass(University05P.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx=session.beginTransaction();


        session.save(university1);
        session.save(student1);
        session.save(student2);
        session.save(student3);

        tx.commit();
        session.close();
        sf.close();
    }
}
