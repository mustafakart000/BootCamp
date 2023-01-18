package JavaSunctruction.day23inheritancepolymorphism.polymorhism;

public class Conctructor01 {

    String name= "emily";
    int age= 21;
    int a=1;
    int b=7;


    Conctructor01(int a, int b){
        System.out.println("emty concturctor");
        b -= a;
        System.out.println("-a: " +a);



    }



    public static void main(String[] args) {

        Conctructor01 c1= new Conctructor01(11, 5);
    System.out.println(c1.a);
    System.out.println(c1.age);
        }

    }

