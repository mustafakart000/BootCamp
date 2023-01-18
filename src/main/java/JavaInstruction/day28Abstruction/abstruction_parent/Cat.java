package JavaSunctruction.day28Abstruction.abstruction_parent;

public class Cat extends Mammal{
    @Override
    void eat() {
        System.out.println("cat eats");
    }

    @Override
    void drink() {
        System.out.println("Cat drinks");
    }

    @Override
    void move() {
        System.out.println("Cat moves");
    }
}
