package PracticeAdvenced.practice.Practice06.Math;

public class Q04Add_Library {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
    public static void main(String[] args) {

        Book kitap1 = new Book("Harry Potter", "j k rowling", 500);
        kitap1.kitapBilgileri();
        new Book("1984", "George Orwell", 352).kitapBilgileri();
    }
}
