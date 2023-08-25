package Singleton;

public class SingletonDP {
    private static SingletonDP soleinstance = new SingletonDP();
    public static int i;

    private SingletonDP() {
        System.out.println("Object Created..");
    }

    public static SingletonDP getInstance() {
        return soleinstance;
    }

    public static int getI() {
        return i;
    }

    public static void setSoleinstance(SingletonDP soleinstance) {
        SingletonDP.soleinstance = soleinstance;
    }
    public void setI(int i){
        this.i = i;
    }
}
