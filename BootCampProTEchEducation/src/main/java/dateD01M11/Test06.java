package dateD01M11;


    public class Test06 {
        public void go() {
            System.out.println("Good");
        }

    public static class Test extends Test06 {
        @Override
        public void go() {

        }
    }

    public static void main(String[] args) {
        Test06 obj = new Test06();
        obj.go();

    }

}
