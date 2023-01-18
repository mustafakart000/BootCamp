package com.hb01.annotation.practice;

import com.hb01.annotation.Student01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//Bu class daki amacımız class'ın isminden anlaşılacağı gibi çağırmak almak anlamında olan fetch bize database kaydetmiş
//olduğumuz datayı geri çağırmamızı sağlar.
public class RunnerFetch02 {

    public static void main(String[] args) {
        Configuration con =new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();
        //DB'den bir datayı' fetch'lemek yani almak istiyorsanız 3 temel yol var
        //1) get() 2) SQL 3) HQL Best Practice 1>3>2

        //1. yol:get()-----------------------------------------------------------------------------
        Student02 student02=session.get(Student02.class, 101);
        Student02 student03=session.get(Student02.class, 102);
        Student02 student04=session.get(Student02.class, 103);

        System.out.println(student02);
        System.out.println(student03);
        System.out.println(student04);

        //2. yol:SQL-------------------------------------------------------------------------------

        String sqlQuery="SELECT * FROM t_student02";
        List<Object[]> resultList= session.createSQLQuery(sqlQuery).getResultList();
        for (Object[] w:resultList) {
            System.out.println(Arrays.toString(w));
        }

        //3. yol:HQL---------------------------------------------------------------------------------

        //Trick: SQL sorgusun da from dan sonra sınıf ismi kullanılmalı
        String hqlQuery ="FROM Student02";
        List<Student02> resultList2= session.createQuery(hqlQuery, Student02.class).getResultList();
        for (Student02 w:resultList2) {
            System.out.println(w);
        }
    //uniqueResult WİTH SQL
    //------------------------------------------------------------------------------------------------------------------

    //Tek bir data alacaksak yani uniqe (primary key) olduğundan eminseniz uniqueResult() methodu kullanabilirsiniz.
        String sqlQuery2 ="SELECT * FROM t_student02 WHERE student_name='Mustafa'";
        Object[] uniqueResult1=(Object[]) session.createSQLQuery(sqlQuery2).uniqueResult();
        System.out.println(Arrays.toString(uniqueResult1));
    //------------------------------------------------------------------------------------------------------------------

        //Yukarda 1 obje gelecek ama içinde kolonlar olduğu için array türünde obje geldi.
        System.out.println(uniqueResult1[0] +" : "+uniqueResult1[1]+" : "+uniqueResult1[2]+" : "+uniqueResult1[3]);

        //uniqueResult WİTH HQL


    //------------------------------------------------------------------------------------------------------------------

        String hqlQuery2= "FROM Student02 WHERE name ='Tarık'";
        Student02 uniqueResult2= session.createQuery(hqlQuery2,Student02.class).uniqueResult();
        System.out.println(uniqueResult2);
        //------------------------------------************************************--------------------------------------


        tx.commit();
        session.close();
        sf.close();
    }


}
