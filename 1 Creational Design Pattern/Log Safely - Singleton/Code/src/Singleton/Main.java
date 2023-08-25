package Singleton;

public class Main {
    public static void main(String[] args) {
        LogIn l1 = LogIn.getInstance();
        LogIn l2 = LogIn.getInstance();
        l1.setID(141241234);
        System.out.println("User's IP ID :" + l1.getID());
        l2.setID(224343345);
        System.out.println("User's IP ID(after signIn from different device) : " + l1.getID());
        System.out.println("User's IP ID(NOW) : " + l1.getID());

    }
}

