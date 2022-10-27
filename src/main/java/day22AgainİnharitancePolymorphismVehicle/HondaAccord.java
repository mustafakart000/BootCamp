package day22AgainİnharitancePolymorphismVehicle;

public class HondaAccord extends Honda{

    int year;
    int price;
    public String make;
    public String model;

    public HondaAccord() {

    }

    public HondaAccord(int price){
        this.year = price;

    }
    public HondaAccord(int price, int year){

        this.year = year;
        this.price = price;
        System.out.println("Honda Accord Constructor");
    }
    public HondaAccord(int year, int price,String make, String model){
            this.year = year;
            this.price = price;
            this.model = model;
            this.make =make;
    }

}
