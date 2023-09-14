package polymorphism;

public class DataBaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        super.log(message);
        System.out.println("loged to database: "+ message);
    }
}
