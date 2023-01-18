package com.hb04.oneToOne.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch04P {

    public static void main(String[] args) {
        Configuration con= new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student04P.class).
                addAnnotatedClass(Diary04P.class);

        SessionFactory sf=  con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx =session.beginTransaction();
        // belli id' li student'u getirelim

        Student04P student1= session.get(Student04P.class, 1001);
        Student04P student2=session.get(Student04P.class, 101);

        //belli bir id ile diaryden getirelim

        Diary04P diary= session.get(Diary04P.class, 101);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("diary = " + diary);


        System.out.println("***********************************************************");


        Student04P diary2=diary.getStudent04();
        System.out.println(diary2);
        Diary04P student3= student1.getDiary();
        System.out.println("student3 = " + student3);


        System.out.println("************************************************************");
        //Kesişimlerini bulunuz.
        String hqlQuery ="SELECT s.name, d.name FROM Student04P s INNER JOIN FETCH Diary04P d  on d.student.id = s.id";
        List<Object[]> resultList=session.createQuery(hqlQuery).getResultList();
        for (Object[] object: resultList) {
            System.out.println(Arrays.toString(object));
        }
        System.out.println("************************************************************");
        //2.Yol LAMBDA İLE
        resultList.forEach(oa-> System.out.println(Arrays.toString(oa)));

        System.out.println("************************************************************");


        System.out.println("Kısaca bütün öğrenciler ve kitabı olan öğrencileri istiyorum.");

        String hqlQuery2=
                "SELECT s.name, d.name FROM Student04P s LEFT JOIN FETCH Diary04P d on s.id = d.student";
        List<Object[]> resultList2= session.createQuery(hqlQuery2).getResultList();
        resultList2.forEach(oa-> System.out.println(Arrays.toString(oa)));

        System.out.println("************************************************************");
        System.out.println("Bir onceki orneğin RIGHT olanı");

        //!!!HQL RIGHT JOIN
        //Kısaca: bütün günlükler ve günlüğü olan öğrenciler.

        String hqlQuery3=
                "SELECT s.name, d.name FROM Student04P s RIGHT JOIN FETCH Diary04P d on s.id=d.student";
        List<Object[]> resultList3= session.createQuery(hqlQuery3).getResultList();
        resultList3.forEach(oa-> System.out.println(Arrays.toString(oa)));
        System.out.println("***********************************************************");

        //!!!HQL FULL JOIN ----------------------------------------------------------
        String hqlQuery4=
                "SELECT s.name, d.name FROM Student04P s FULL JOIN FETCH Diary04P d on s.id=d.student.id";

        List<Object[]> resultList4= session.createQuery(hqlQuery4).getResultList();
        resultList4.forEach(oa-> System.out.println(Arrays.toString(oa)));



        tx.commit();
        session.close();
        sf.close();
    }
}
