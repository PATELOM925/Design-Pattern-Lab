package Singleton;

public class ShoppingCart {
    private static ShoppingCart sc = new ShoppingCart();
    public static int items;

    private ShoppingCart() {
        this.items = 0;
        System.out.println("Current items: ..");
    }

    public static ShoppingCart getInstance() {
        return sc;
    }

    public static void setShoppingCart(ShoppingCart logger)
    {
        ShoppingCart.sc = sc;
    }

    public int addItem() {
        this.items++;
        return items;
    }

    public void removeItem() {
        this.items--;
        if (items == 0){
            System.out.println("cart is empty");
        }
        return;

    }

    public int getNumberOfItems() {
        return this.items ;
    }
}
