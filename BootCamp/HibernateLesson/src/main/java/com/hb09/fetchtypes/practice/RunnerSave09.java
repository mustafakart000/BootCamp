package com.hb09.fetchtypes.practice;

import com.hb09.fetchtypes.Book09;

public class RunnerSave09 {
    public static void main(String[] args) {

        Student09P student1 =new Student09P();
        student1.setId(1001);
        student1.setName("emin");
        student1.setGrade(212);

        Student09P student2 =new Student09P();
        student2.setId(1002);
        student2.setName("Beyza keser");
        student2.setGrade(5454);

        Student09P student3 =new Student09P();
        student3.setId(1003);
        student3.setName("hakan yılmaz");
        student3.setGrade(233);

        Student09P student4 =new Student09P();
        student4.setId(1004);
        student4.setName("fatma");
        student4.setGrade(232);

        Book09P book1 = new Book09P();
        book1.setId(101);
        book1.setName("A Book");

        Book09P book2 = new Book09P();
        book2.setId(102);
        book2.setName("B Book");

        Book09P book3 = new Book09P();
        book3.setId(103);
        book3.setName("C Book");

        Book09P book4 = new Book09P();
        book4.setId(104);
        book4.setName("D Book");

        Book09P book5 = new Book09P();
        book5.setId(105);
        book5.setName("E Book");
        //student tarafından setledik
        //CascadeType dan dolayı@oneTOmany ilişkinin kurulabilmesi için iki taraftan objeleri setlememiz gerekiyor.
        student1.getBook09PList().add(book1);
        student1.getBook09PList().add(book2);
        student1.getBook09PList().add(book3);
        student2.getBook09PList().add(book4);
        student2.getBook09PList().add(book5);
        student3.getBook09PList().add(book1);
        student3.getBook09PList().add(book4);
        student4.getBook09PList().add(book3);

        //Book tarafından setliyoruz.








    }
}
