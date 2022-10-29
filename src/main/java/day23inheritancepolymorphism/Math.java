package day23inheritancepolymorphism;

public class Math extends Courses{
    public void practice(){
        System.out.println("Math is in method");
    }
    public Math() {
        super();
        System.out.println("Math is in Constructor1");
    }
    public Math(int a){
        this();
        System.out.println("Math is in Constructor2");
    }

}
