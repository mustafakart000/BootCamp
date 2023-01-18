package com.hb13.get_load;


/*
   get() ---> gerçek nesneyi döndürür ,
               nesne yoksa null döner
               nesnenin olduğundan emin değilseniz get() kullanın
               dönen nesneye hemen kullanacaksam get() kullanılmalı
   load() -->  proxy nesne döndürür, gerçek nesnenin gölgesi ,
               nesne yoksa exception fırlatır
               dönen nesne üzerinde delete yapılacaksa kullanılabilir

               not: proxy nedir ??? -> bir firmada offer aldğınız odanız ve sektereteriniz var işlemleri yaptrıyorsunuz
               bilgisayar ile ajadanıza yazıyor. 2. senaryo dışarda bir görüsmede sekterenize tüm işlemleri iptal edecekseniz
               ve sekreter deftere yazar bunu dıgıal ortama o anda aktaramaz.
               NOT:
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch13 {


    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student13.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


        System.out.println("Get methodunun başlangıç yeri..");


        Student13 student1 = session.get(Student13.class,1L);
        System.out.println("Get methodun bittiği yer");
        System.out.println("Student ID: "+ student1.getId());
        System.out.println("Student getName: "+ student1.getName());

        Student13 student2 = session.get(Student13.class,1L);

        System.out.println("Student getName: "+ student2.getName());

        System.out.println("************************LOAD*************************");
        //Yuakrdaki senaryonun aynısını load() başlangıç yer:
        System.out.println("Load methodunun başlangıç yeri.");

        Student13 student3 =session.load(Student13.class,2L);
        System.out.println(student3); //Eğer student3 kullanırsak yazdırmakta dahil o zaman ikinci select'i çalıştırır
        //Yani database gider.
        System.out.println("Load methodunun bittiği satır.");

        System.out.println("************************DB DE OLMAYAN ID*************************");


        Student13 student4= session.get(Student13.class,5L);

        System.out.println("get() methodu bitti");

        if (student4!=null){
            System.out.println("Student ID: " + student4.getId());
            System.out.println("Student name: "+ student4.getName());

        }
        System.out.println("*********************END**************************");

        System.out.println("***************************************************");

        System.out.println("Load() methodu çalışmaya başladı.");
        Student13 student5= session.load(Student13.class,5L);
        //Load obje yoksa null döndürmez
        if (student5!=null){//TRUE
            System.out.println("Student ID: "+ student5.getId());//ObjectNotFoundException.
            System.out.println("Student Get Name: "+ student5.getName());

        }

        //!!!peki load() methodunu niye kullanayım.???
        //Load methodu ile obje referansı alınır. ve sonra delete çağrılır
        //get methodu çağrılmayarak DB ye hit engellemiş olur.
       Student13 student6 = session.get(Student13.class, 1L);
        session.delete(student5);

        Student13 student7= session.load(Student13.class,1L);
        session.delete(student6);




        tx.commit();
        session.close();
        sf.close();
    }
    }
