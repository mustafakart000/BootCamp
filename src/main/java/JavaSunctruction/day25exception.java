package JavaSunctruction;

public class day25exception {
    public static void main(String[] args) {
        divide(6,2);
        divide(0,2);
        divide(3,0);

    }
    public static void divide (int a, int b){
    try {
        System.out.println(a/b);
    }catch (ArithmeticException e) {
        System.out.println("Bolme isleminde bir problem olustu.");
    }


    }
}
