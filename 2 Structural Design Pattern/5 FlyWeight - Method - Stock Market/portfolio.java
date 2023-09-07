public class portfolio {
    private static final String stocks[] = {"ADANIGREEN","TATAMOTORS","TCS","INFOSYS","ITC" };
    public static void main(String[] args) {
 
       for(int i=0; i < 20; ++i) {
          stock stock = (stock)stockMarket.getStock(getRandomStock());
          stock.setQty(getRandomQty());
          stock.buyStock();
       }
    }
    private static String getRandomStock() {
       return stocks[(int)(Math.random()*stocks.length)];
    }
    private static int getRandomQty() {
       return (int)(Math.random()*100 );
    }
 }