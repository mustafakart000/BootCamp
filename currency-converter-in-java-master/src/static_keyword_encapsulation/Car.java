package static_keyword_encapsulation;

public class Car {
    private String make="honda";
    public String model ="Accord";
    public int price =20000;
    private double price2 =3.9;
    private int counter =0;
    public static int counter2 =0;
    public static int i =1;
    public Car() {
        counter++;
        price++;
    }
    public void setMake(String make) {
        this.make=make;
    }

    public String getMake() {
        return make;
    }
}
