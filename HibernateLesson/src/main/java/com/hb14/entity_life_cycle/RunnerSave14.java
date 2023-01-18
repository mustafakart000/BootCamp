package com.hb14.entity_life_cycle;

import com.hb13.get_load.Student13;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave14 {

    public static void main(String[] args) {

        Student14 student1 = new Student14();//transient State. life cycle daki ilk aşama
        student1.setName("İsmail Bey");
        student1.setMathGrade(100);

        Student14 student2 = new Student14();//transient State.
        student1.setName("Mustafa Bey");
        student1.setMathGrade(100);

        Student14 student3 = new Student14();//transient State.
        student1.setName("Miraç Bey");
        student1.setMathGrade(100);
        //hibernate buraya kadar bişey takip etmiyor çunku data base bağlanmadık
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student13.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //Burada hibernate çalışmaya başlar çunku database bağlanır.
        session.save(student1);//persisted State

        student1.setName("Güncellenmiş Recep Bey");

        session.evict(student1); // !!! Detached state e geçti

        session.update(student1); // detached olmuş student1 objesini persisted State e alır
        session.merge(student1);// detached olmuş student1 objesini persisted State e alır



        tx.commit();
        session.close();
        sf.close();
    }

}
