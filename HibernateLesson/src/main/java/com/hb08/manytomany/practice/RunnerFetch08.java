package com.hb08.manytomany.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;



public class RunnerFetch08 {


    public static void main(String[] args) {

        Configuration con= new Configuration();
        SessionFactory sf=con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();


        String hqlQuery=
                " SELECT s.grade, s.name FROM Student08 s WHERE s.id=1001";

      List<Student08P> resultList =  session.createQuery(hqlQuery).getResultList();

        resultList.forEach(System.out::println);


        tx.commit();
        sf.close();
        session.close();




    }
}
