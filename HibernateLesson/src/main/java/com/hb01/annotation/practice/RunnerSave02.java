package com.hb01.annotation.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

    public static void main(String[] args) {

        //Database'e yüklemek istediğimiz dataları Object oluşturarak yükleyelim bunun için daha önce oluşturduğumuz
        // Student02 class'ında ki table oluşturma yapımızı burada object oluşturarak kullanalım
        //1.row
        Student02 student02= new Student02();
        student02.setId(101);
        student02.setName("Mustafa");
        student02.setGrade(60);

        //2.row
        Student02 student03= new Student02();
        student03.setId(102);
        student03.setName("ismail");
        student03.setGrade(65);

        //3.row
        Student02 student04= new Student02();
        student04.setId(103);
        student04.setName("ali");
        student04.setGrade(80);




        //dataBase ile olan iletişimimizi sağlayalım
        Configuration con= new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
        //HiberNate'e konfigrasyon dosyamı ve Entity Class'ı bildirdim.
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();
        //yukarda oluşturdupumuz Student02'i object'inden dataları database'e göderelim
        //göndereceğimiz dataları her zaman bu aralığa yazmalıyız bilgilerin DB'ye gitmesi içinde commit ile bitiririz.
        //1.row
//        session.save(student02);
        //2.row Burada ikinici row'u ekleyebilmek için ya 1.row pasif yapmamız gerekiyor yada src/main/resources packag'ın dan
        // hibernate.cfg.xml dosyasında update kısmı create-drop olarak değişmemiz gerekecek aksi takdirde bir den
        // fazla unique oluşacağından table oluşumunda hata meydana gelecektir
//        session.save(student03);

        //3.row Yukardaki açıklama bu row'un oluşumu içinde geçerlidir. bu sefer ilk 2 row'uda pasif hale yani okunur
        // hale getirmemiz gerekiyor Eklenmiş  bir primary key'i tekrar ekleyemeyiz.
        session.save(student04);

        tx.commit();// commit yazmazsak bilgiler DB'ye gitmez
        session.close();
        sf.close();
        //YUkardaki kodlar test edildi ve Sorunsuz bir şekilde Çalıştı.




        Student02 stn2= new Student02().a().b();
    }

}
