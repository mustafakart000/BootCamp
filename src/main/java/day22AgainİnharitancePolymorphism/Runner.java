package day22AgainİnharitancePolymorphism;

public class Runner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);
        Mamal cat2 = new Cat();
        System.out.println(cat2.a);
        Animal cat3 =new Cat();
        System.out.println(cat3.a);
        //Inheritance'da variable'lar seçilirkenjava Consturctor'a bakar
        //Öncelikle istediğiniz method'u Constructori kullanilan Class'dan alir
        //Bulundğu Class'da parent class'Lara bakar.
        //Hiçbir yerde o methd bulamazsa hata verir
        System.out.println("Cat cat4 = new Cat();");
        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();
        Mamal cat5 = new Cat();
        System.out.println("Mamal cat5 = new Cat();");
        cat5.eat();
        cat5.drink();
        System.out.println("Animal cat6 = new Mamal();");
        Animal cat6 = new Mamal();
        cat6.eat();
        System.out.println("Animal cat7 = new Animal();");
        Animal cat7 = new Animal();
        cat7.eat();


    }
}
