package day22AgainİnharitancePolymorphism;

public class Mamal extends Animal{
    public int a=13;
    public int b = 34;


    public void eat() {
        System.out.println("mamal eat");
    }
    public void drink() {
        System.out.println("mamal Drink");

    }
    public Mamal(){
        System.out.println("Mamal Constructor");
    }
}
