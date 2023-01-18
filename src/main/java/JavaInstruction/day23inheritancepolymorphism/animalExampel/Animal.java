package JavaSunctruction.day23inheritancepolymorphism.animalExampel;

public class Animal {
public void eat(){
    System.out.println("Animals eat");
}

public int add(int a, int b){
        return a+b;
        }

public Integer multiply(int a, int b){
        return a*b;
        }

//Asagidaki method "Overridden Method"
public Animal create(){
        return new Animal();
        }

//"final" method'lar Override edilemezler
public final double divide(int a, int b){
        return a/b;
        }
}