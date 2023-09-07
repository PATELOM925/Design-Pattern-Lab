public class pizza implements food {
    public String prepareditems;
    @Override
    public void preparefood(String itemsrequired) {
        prepareditems = "Thin Crust Pizza With Ingredients: " +  itemsrequired;
    }

    @Override
    public String deliverfood() {
        return prepareditems;
    }
}