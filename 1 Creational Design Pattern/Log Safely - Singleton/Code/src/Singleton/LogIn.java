package Singleton;

public class LogIn {
    private static LogIn logger = new LogIn();
    public static int id;

    private LogIn() {
        System.out.println("LogIn..");
    }

    public static LogIn getInstance() {
        return logger;
    }

    public static int getID() {
        return id;
    }

    public static void setLogger(LogIn logger) {
        LogIn.logger = logger;
    }
    public void setID(int id){
        this.id = id;
    }
}
