package polymorphism;

public class Main {

    public static void main(String[] args) {
        EmailLogger logger =new EmailLogger();

        logger.log("email Logger Object.");

        BaseLogger[] loggers =new BaseLogger[]{new FileLogger(), new DataBaseLogger(), new EmailLogger()};

        for (BaseLogger w: loggers) {
            w.log("2323");

        }


    }
}
