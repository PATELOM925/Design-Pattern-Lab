public class waiter {
    public static String deliverfood(foodtype foodtype)
    {
        ingredients i = new ingredients();
        switch (foodtype) {
            case pasta -> { food pasta = new pasta();
                String pastaitems = ingredients.getpastaitems();
                pasta.preparefood(pastaitems);
                System.out.println(pasta.deliverfood());
            }
            case pizza -> {
                food pizza = new pizza();
                String pizzaitems = ingredients.getpastaitems();
                pizza.preparefood(pizzaitems);
                System.out.println(pizza.deliverfood());
            }
        }
        return "You order will be sent soon! :)";

    }
}
