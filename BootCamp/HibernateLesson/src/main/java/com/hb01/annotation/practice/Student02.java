package com.hb01.annotation.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "t_student02")
public class Student02 {
    @Id //@Id, primary key oluşmasını sağlar. Eğer Id isminideğiştirmek istersek dibnot: @Column(name= "student_id")
    //Başka bir dipnot @Entity annotation'nı ekledikten sonra class ismi kızarır çünkü @Entity annotation'ı Data base de
    //Bir tabloya karşılık gelmesi için eklenir Bu durumda bizim bir Primary key'e yani unique olan bir column'a
    //ihtiyacımız olacak bu yüzden @Id annotation'ı koyarak class isminin compile time error vermesini engellemiş oluruz

    private int id;

    //@Column zorunlu değil ancak customize yani özelleştirmek için gereklidir. Örneğin;
    @Column(name="student_name",length = 100,nullable = false,unique = false)
    private String name;
    //dibnot: @Transient DB deki tabloda "grade" adında bir değişken kolonun oluşmasını engeller.
    private int grade;
    //dibnot: @Lob--> büyük boyutlu dataları tutulabilir.
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
    public Student02 a(){
        return this;
    }
    public Student02 b(){
        return this;
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
        return "Student02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
