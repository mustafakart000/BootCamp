package polymorhism;

import polymorphism.BaseLogger;

public class EmailLogger extends BaseLogger {

    public void log(String message){
        System.out.println("default to " + message);
    }

}
