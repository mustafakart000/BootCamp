package JavaSunctruction.day32maps;

public class StaticBlocks01 {
    public static double pi ;

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static{
        pi=3.14;
        System.out.println(pi);
    }
}
