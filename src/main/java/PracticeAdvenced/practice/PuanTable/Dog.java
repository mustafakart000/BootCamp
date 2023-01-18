package PracticeAdvenced.practice.PuanTable;

public class Dog extends Mammal {
    public boolean bark = true;

    public static void main(String[] args) {
        Animal dog = new Dog();

        System.out.println(dog.weight);
    }
}
