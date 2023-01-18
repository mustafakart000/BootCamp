package AdvJavaPractice.serialization;

//Task:Book tipinde nesneler üretip bu nesneleri
//books.txt dosyasına kaydedin ve sonra bu dosyadan nesneleri okuyun.

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {

        //writeObject();
        readObject();

    }

    public static void writeObject(){

        Book book1=new Book("Sefiller","Victor Hugo",1945);
        Book book2=new Book("Suç ve Ceza","Dostoyevski",1955);
        Book book3=new Book("Savaş ve Barış","Tolstoy",1940);


        try {
            //nesneleri yazdıracağımız dosyayı yazdırmak için
            FileOutputStream fos=new FileOutputStream("books.txt");

            //nesneleri yazdırmak için
            ObjectOutputStream write=new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readObject(){

        try {
            //nesneleri okuyacağımız dosyayı okur
            FileInputStream fis=new FileInputStream("books.txt");
            //nesneleri okumak için
            ObjectInputStream read=new ObjectInputStream(fis);
            Book book1=(Book)read.readObject();
            Book book2=(Book)read.readObject();
            Book book3=(Book)read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            read.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }












}
