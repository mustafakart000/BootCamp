package javainstruction.day22inheritancepolymorphism.secondlesson;

public class Honda extends Car{
    public String color;
    public Honda() {
        super("white", 54000);
        System.out.println("honda Constructor");

    }
    public Honda(String color){
        this.color = color;
    }
}
