import java.util.Scanner;
public class customer {
    public static void main(String[] args) {

        System.out.println("--without facade--");
        ingredients i = new ingredients();
        food pasta = new pasta();
        String pastaitems = ingredients.getpastaitems();
        pasta.preparefood(pastaitems);
        System.out.println(pasta.deliverfood());

        Scanner in = new Scanner(System.in);

        System.out.println("---using facade ----");
        System.out.println("What would you like to have: (type pizza/pasta)");
        String order = in.nextLine();
        if (order.equals("pasta"))
        System.out.println(waiter.deliverfood(foodtype.pasta));
        if (order.equals("pizza"))
        System.out.println(waiter.deliverfood(foodtype.pizza));
        else
            System.out.println("Sorry sir we don't have " + order+ " in menu");
    }
}
