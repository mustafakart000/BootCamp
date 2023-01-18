package com.hb10.idgeneration;

import javax.persistence.*;

@Entity
public class Student10 {
/*
   Oracle DB - PostgreSQL ---> Sequence ( kontrolü developera bırakır, Id üretilirken başlangıç değeri veya kaç tane id cachelenecek bu gibi bilgileri developer setliyebilir)
   MySQL - Microsoft SQL   ---> IDENTITY ( kontrol DB de , kendi yapısına göre ıd oluşturur, içlerindeki en basitidir)

   GenerationType.AUTO ---> Hibernate otomatik olarak stratejiyi belirler
   GenerationType.TABLE ---> En yavaşı , oyüzden çok kullanılmıyor, çünkü id
    üretmek için ekstra tablo oluşturuyor
 */
    @GeneratedValue(generator = "sequence",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="sequence", // @GeneratedValue nun generator parametresi ile aynı isimde olması lazım
                        sequenceName = "student_seq",//DB de oluşacak sequance ismi
                        initialValue = 1000, // id lerim 1000 ile başlasın
                        allocationSize = 10) // cache leme mekanizmasında 10 adet id hazırda beklesin
    @Id
    private int id;

    @Column(name = "student_name", nullable = false)
    private String name;

    private int grade;


    // Getter -Setter


    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // toSting()

    @Override
    public String toString() {
        return "Student10{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
