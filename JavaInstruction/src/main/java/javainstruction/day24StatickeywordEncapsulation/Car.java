package javainstruction.day24StatickeywordEncapsulation;

public class Car {

    public static String make = "Honda";
    public String model = "Accord";
    public int price = 20000;
    public static int counter = 0;

    public Car(){
        counter++;
        price++;
    }
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);
        //static variable'lara class ismi kullanarak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);


        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }

}
