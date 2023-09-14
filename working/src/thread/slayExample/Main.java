package thread.slayExample;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunable myRunable = new MyRunable();
        myRunable.run();
    }
}
