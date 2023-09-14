package polymorhism;

import polymorphism.BaseLogger;

public class DataBaseLogger extends BaseLogger {
    public void log(String message){
        System.out.println("default to database Logger " + message);
    }
}
