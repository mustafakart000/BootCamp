package com.hb01.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch01 {


    public static void main(String[] args) {
        Configuration con =new Configuration().configure("hibernate.cfg.xml").
                                                addAnnotatedClass(Student01.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        // DB'den bir datayı fetch'lemek yani almak istiyorsanız temelde 3 yol var
            //1) get() 2) SQL 3) HQL   Best PRactice 1>3>2
        //1.yol:---------------------------------------------------------------------
//        Student01 student01= session.get(Student01.class, 1001);
//        Student01 student02= session.get(Student01.class, 1002);
//        Student01 student03= session.get(Student01.class, 1003);

//        System.out.println(student01);
//        System.out.println(student02);
//        System.out.println(student03);

        //2.yol: SQL---------------------------------------------------------------------
        //SQL bilginize güveniyorsanız ben hata yapmam diyorsanız bu yöntemi SQL bilginizden dolayı kullanabilirsiniz
        // Bu yöntem eski ilk yöntemdir. ancak Burada Arrays.toString ile sürekli Array'E döndürdüğümüz için daha fazla
        // işlem yapıyor bu yüzden HQL olan 3 . yöntem daha çok tercih edilir
        //Bu yöntemin bir diğer dezavantajı ise object kullanımıdır HQL de ise Oluşturmuş olduğumuz class'ı kullanarak
        // işlemciye daha az işlem yaptırırız.

//            String sqlQuery="SELECT * FROM t_student01";
//            List<Objects[]> resultList= session.createSQLQuery(sqlQuey).getResultList();
//        for (Object[] w:resultList) {
//            System.out.println(Arrays.toString(w));
        //
//        }

        //3.yol: HQL---------------------------------------------------------------------
                //Trick : SQL sorgusun da from dan sonra sınıf ismi  kullanılmalı

//        String hqlQuery="FROM Student01";
//      List<Student01> resultList2 =  session.createQuery(hqlQuery, Student01.class).getResultList();
//        for (Student01 w:resultList2
//             ) {
//            System.out.println(w);
//
//        }

        //uniqueResult WİTH SQL---------------------------------------------------------------------
        //Tek bir data alacaksak yani uniqe (primary key) olduğundan eminseniz uniqueResult() methodu kullanılabilir.

//        String sqlQuery2="SELECT * FROM t_student01 WHERE student_name='Tarık'";
//        Object[] uniqueResult1=(Object[]) session.createSQLQuery(sqlQuery2).uniqueResult();
//        System.out.println(Arrays.toString(uniqueResult1));
//        //yukarda 1 obje gelecek ama içinde kolanlar olduğu için array türünde obje geldi.
//        System.out.println(uniqueResult1[0] + " : "+ uniqueResult1[1]+ " : "+ uniqueResult1[2]);

        //uniqueResult WİTH HQL---------------------------------------------------------------------
//        String hqlQuery2= "FROM Student01 WHERE name='Tarık'";
//        Student01 uniqueResult2 = session.createQuery(hqlQuery2,Student01.class).uniqueResult();
//        System.out.println(uniqueResult2);
        //----------------------------*******************************------------------------------

//        String hqlQuery3="FROM student01 std where std.name='Miraç'";
//        Student01 uniqResult3= session.createQuery(hqlQuery3, Student01.class).uniqueResult();
//        System.out.println(uniqResult3);
        //---------------------------------------------------------------------------------------------

        //Grade değeri 90 olan öğrenciyi çağıralım.

        String hqlQuery4="Select s.id, s.name FROM Student01 s where s.grade=90";
        List<Object[]> listResult4= (List<Object[]>) session.createQuery(hqlQuery4).getResultList();
        //createQuery metoduna tek paremetre girdiğimiz için Student01 class'ı ile map'leme yapılmadı
        // bu yüzden object olarak aldık
        for (Object[] w:listResult4) {

            System.out.println(Arrays.toString(w));
        }



        tx.commit();
        session.close();
        sf.close();

    }
}
