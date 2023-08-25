package Singleton;
public class Main {
    public static void main(String[] args) {
        ShoppingCart c1 = ShoppingCart.getInstance();
        c1.addItem();
        System.out.println("item Added");
        System.out.println("No. of items in cart : "+c1.getNumberOfItems());
        c1.removeItem();
        System.out.println("item removed");
        System.out.println("No. of items in cart : "+c1.getNumberOfItems());
    }
}

