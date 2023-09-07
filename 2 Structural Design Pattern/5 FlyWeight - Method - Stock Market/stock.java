public class stock implements Market {
    private String stockName;
    private int qty = 0;
    public stock(String name){
        this.stockName = name;
    }
    public void setQty(int qty){
        this.qty+= qty;
    }
    public void buyStock(){
        System.out.println("Stock:"+stockName+" Quantity:"+qty);
    }
}