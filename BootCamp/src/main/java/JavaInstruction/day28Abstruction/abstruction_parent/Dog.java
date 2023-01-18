package JavaSunctruction.day28Abstruction.abstruction_parent;

public class Dog extends Mammal {
    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    void move() {
        System.out.println("Dog moves");
    }
}
