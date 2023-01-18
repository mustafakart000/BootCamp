package com.hb05T.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class RunnerFetch05 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student05.class).addAnnotatedClass(University.class);
        //SessionFactory büyük bir mimaridir bu yüzden yüksek ram alanı kaplar
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //!!! Get methodu

        Student05 student1= session.get(Student05.class, 1001);
        System.out.println(student1);




        System.out.println("********student1.getUniversity()***********");
        System.out.println(student1.getUniversity());


        System.out.println("************************************");
        //!!!HQL ile 1 id li universiteye giden bütün öğrencileri bulalım
        System.out.println("HQL ile 1 id li universiteye giden bütün öğrencileri bulalım");
        String hqlQuery= "From Student05 s where s.university.id=1";
        List<Student05>resultList= session.
                createQuery(hqlQuery,Student05.class).
                getResultList();
        resultList.forEach(s-> System.out.println(s));



        tx.commit();
        session.close();
        sf.close();
    }
}
