package day22AgainİnharitancePolymorphism;

public class Runner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        Mamal cat2 = new Cat();
        System.out.println(cat2.a);
        Animal cat3 =new Cat();
        System.out.println(cat3.a);

    }
}
