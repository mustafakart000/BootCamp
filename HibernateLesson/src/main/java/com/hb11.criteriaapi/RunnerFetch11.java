package com.hb11.criteriaapi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;


public class RunnerFetch11 {

    public static void main(String[] args) {

        /*
        *   CRUD ( Create, Read, Update, Delete)
        *   C --> session.save
        *   R --> session.get  ,HQL , SQL
        *   U --> session.update , updateQuery
        *   D --> session.delete , HQL , SQL
        *
        *
        *
        * */

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student11.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//        Student11 student = session.get(Student11.class,1L);
//        student.setName("Güncellenmiş" + student.getName());
//        session.update(student);


        // Değişken Tanımla
//        int sMathGrade = 80;
//        int lMathGrade = 75;  // FRONTED DEN GELEN BİLGİ GİBİ YAZDIK
//
//        String hqlQuery = "UPDATE Student11 s SET s.mathGrade=:sMath WHERE s.mathGrade<:lMath";
//        Query query = session.createQuery(hqlQuery);
//
//        query.setParameter("sMath", sMathGrade);
//        query.setParameter("lMath",lMathGrade);
//        int numbOfRecords = query.executeUpdate();
//        System.out.println("Değiştirilen kayıt sayısı : " + numbOfRecords);

        // CriteriaAPI
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student11> criteriaQuery = cb.createQuery(Student11.class);
        Root<Student11> root = criteriaQuery.from(Student11.class);

        // 1.Örnek
//        criteriaQuery.select(root);
//        Query<Student11> query1 = session.createQuery(criteriaQuery);
//        List<Student11> resultList = query1.getResultList();
//        resultList.forEach(s->System.out.println(s));

        // 2.Örnek , Student ismi "Student Name 6" olan öğrenci bilgilerini getirelim
//        criteriaQuery.select(root). // SElECT * FROM student11
//                where(cb.equal(root.get("name"),"Student Name 6"));
//        Query<Student11> query2 = session.createQuery(criteriaQuery);
//        List<Student11> resultList2 = query2.getResultList();
//        resultList2.forEach(System.out::println);

        // 3.Örnek mathGrade değeri 80 den büyük olan dataları getirelim
//        criteriaQuery.select(root).where(cb.greaterThan(root.get("mathGrade"),80));
//        Query<Student11> query3 = session.createQuery(criteriaQuery);
//        List<Student11> resultList3 = query3.getResultList();
//        resultList3.forEach(System.out::println);

        // 4.Örnek mathGrade 95 'den küçük olan datalar
        criteriaQuery.select(root).where(cb.lessThan(root.get("mathGrade"),95));
        Query<Student11> query4 = session.createQuery(criteriaQuery);
        List<Student11> resultList4 = query4.getResultList();
        resultList4.forEach(System.out::println);

        //!!! 5.ornek ıd 'si 1 veya mathGrade'i 75 den büyük olan recordu bulalım.
        Long id=1L;
        Long id2=75L;

        Predicate predicateForId = cb.equal(root.get("id"),id);
        Predicate predicateForMatGrade = cb.greaterThan(root.get("mathGrade"),75);
        Predicate predicateQuery = cb.or(predicateForId, predicateForMatGrade);

        criteriaQuery.where(predicateQuery);

        Query<Student11> query5= session.createQuery(criteriaQuery);

        List<Student11> resultList6 =query5.getResultList();
        resultList6.forEach(System.out::println);
        tx.commit();
        session.close();
        sf.close();

    }

}
