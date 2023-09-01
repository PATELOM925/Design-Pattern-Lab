public class pasta implements food {
    public String prepareditems;
        @Override
        public void preparefood (String itemsrequired){
            prepareditems = "Red sauce pasta" + itemsrequired;
        }
        @Override
        public String deliverfood () {
            return prepareditems;
        }
}
