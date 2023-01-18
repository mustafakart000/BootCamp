package JavaSunctruction.practice_bootCamp;

public class Test01 extends Test02 implements I02{
    static int x = 3;
    char c = 'B';
    int k=4;


    public void myMethod() {
        System.out.println("No parameter: " + I02.c + x);//No parameter: A3
    }

    public void myMethod(char c, int k) {
        System.out.println("One parameter: "  +c+x);
    } //One parameter: Z2

    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.myMethod();
        obj.myMethod('Z', 7);
        Test02 test02a= new Test02();
        test02a.a();
        int v1 = I02.x;

        //
    }
}
