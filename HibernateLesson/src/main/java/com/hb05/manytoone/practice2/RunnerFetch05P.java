package com.hb05.manytoone.practice2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class RunnerFetch05P {


    public static void main(String[] args) {
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student05P.class).
                addAnnotatedClass(University05P.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx=session.beginTransaction();

        //!!! get() methodu
        System.out.println("*****************1001***************");
       Student05P student=  session.get(Student05P.class,1001);
        System.out.println(student);
        System.out.println("*****************1002***************");
        System.out.println(student);
       Student05P student2= session.get(Student05P.class,1002);
        //HQL ile 1 id li üniversiteye giden bütün öğrencileri bulunuz

        String hqlQuewy=
                " FROM Student05P s Where s.university.id=1";

        System.out.println("hqlQuewy: "+hqlQuewy);

        List<Student05P> resultList=
                session.createQuery(hqlQuewy, Student05P.class).getResultList();
        resultList.forEach(s-> System.out.println(s));




        tx.commit();
        session.close();
        sf.close();
    }


}
