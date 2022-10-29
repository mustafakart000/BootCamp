package İnheritanceTest.İnheritanceTest01;

public class Dog extends Mammal{
    private boolean golden =true;
    private float weightDog =21F;
    protected  boolean feed = true;
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog.golden);
        System.out.println(dog.weightDog);
        System.out.println(dog.feed);
        System.out.println("dog.callDogAndMammalExtendsAnimal: "+dog.mammalExtendsAnimal);
        System.out.println("Animal Weight: "+dog.weight);
        Mammal dog2= new Dog();
        System.out.println("dog2.wegihtDog: "+dog2.weightDog);
    }
}
