package day22AgainÄ°nharitancePolymorphismVehicle;

public class Honda extends Car {
    public Honda() {
        super( "white",  54000 );
        System.out.println("Honda Consturctor");
    }
    public Honda(String color){
        this.color = color;
    }
}
