package JavaSunctruction.day22inheritancepolymorphism;

public class Cat extends Mammal{
    public void a() {
        System.out.println("eat");

    }
    public void meow (){
        System.out.println("miyav");
    }

    @Override
    public void eat() {
        System.out.println("kediler yer");
    }
}
