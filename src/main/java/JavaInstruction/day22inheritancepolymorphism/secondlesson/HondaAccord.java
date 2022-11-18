package JavaSunctruction.day22inheritancepolymorphism.secondlesson;

public class HondaAccord extends Honda{




        //1) Siz Class oluşturduğunuz da Java otomatık olarak size görünmez bir constructor verir,
        // cunku java, Class'in bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve
        // object oluşturmak için construtor'in şart olduğunu bilir
        public int price;
        public int year;
        public String make;
        public String model;


        public HondaAccord(int price){
        this.price=price;
        }

        public HondaAccord(int price, int year){
            this.price=price;
            this.year = year;
            System.out.println("Honda Accord Constructor");
        }
        public HondaAccord(int price, int year, String make, String model){
            this.price = price;
            this.year = year;
            this.make = make;
            this.model = model;
        }

}
