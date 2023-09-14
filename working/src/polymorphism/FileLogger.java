package polymorphism;

public class FileLogger extends BaseLogger{

    @Override
    public void log(String message) {
        super.log(message);
        System.out.println("loged to FileLogger: "+ message);
    }

}
