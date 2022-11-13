package JavaSunctruction;

public class Test03 implements I03, I04 {
    int x=9;

    public void cal(int item) {
        x = item * item;
    }

    public static void main(String args[]) {
        Test03 obj = new Test03();
        obj.cal(I04.x);
        System.out.println(obj.x);
        obj.cal(I03.x);
        System.out.println(obj.x);
    }
}
