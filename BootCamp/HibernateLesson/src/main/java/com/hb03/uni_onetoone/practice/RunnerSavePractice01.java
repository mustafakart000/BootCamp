package com.hb03.uni_onetoone.practice;

import com.hb03.uni_onetoone.Student03;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSavePractice01 {


    public static void main(String[] args) {

        DiaryPractice diaryPractice01= new DiaryPractice();
        diaryPractice01.setAge(12);
        diaryPractice01.setId(12121);
        diaryPractice01.setCountry("Germany");
        diaryPractice01.setName("Mustafa");
        diaryPractice01.setGander('M');


        TeacherPractice01 teacher01=new TeacherPractice01();
        teacher01.setTc(3232322);
        diaryPractice01.setTeacher(teacher01);


        Configuration con =new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(TeacherPractice01.class).addAnnotatedClass(DiaryPractice.class);

       SessionFactory sf=con.buildSessionFactory();
       Session session= sf.openSession();
       Transaction tx= session.beginTransaction();


        session.save(diaryPractice01);
        session.save(teacher01);


       tx.commit();
       session.close();
       sf.close();

    }


}
