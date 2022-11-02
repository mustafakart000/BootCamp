package İnheritanceTest.İnheratancePolymorphismTest03;

public class Cat extends Mammal{

    public void meow() {
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
