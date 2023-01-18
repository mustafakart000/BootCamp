package com.hb01.annotation;

import javax.persistence.*;
import java.util.Arrays;
//Entity annotation 1 koyduğumuzda DB de bir tablaoya karşılık getirir.

@Entity

@Table(name="t_student01")// DB'de Tablo ismim "t_student01" olarak değiştirildi
public class Student01 {//DB'de "Student01" isminde tablo oluşturur.

    @Id // @Id, Primary key oluşmasını sağlar.
    // Eğer Id ismini değiştirmek istersek
    //dibnot: @Column(name = "student_id")

    private  int id ;

    //@Column zorunlu değil ancak customize edebilmek için gerekli

    @Column(name="student_name", length = 100, nullable = false, unique = false)
    private String name;


  //dibnot:  @Transient//DB deki tabloda "grade" adında bir kolon oluşmasını engeller
    private int grade;

    //dibnot: @Lob  //--> büyük boyutlu datalar tutulabilir
    private byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
