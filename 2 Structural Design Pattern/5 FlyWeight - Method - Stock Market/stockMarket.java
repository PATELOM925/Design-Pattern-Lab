import java.util.HashMap;

public class stockMarket {
   private static final HashMap stockMap = new HashMap();

   public static Market getStock(String name) {
      stock myStock = (stock)stockMap.get(name);

      if(myStock == null) {
         myStock = new stock(name);
         stockMap.put(name, myStock);
         System.out.println("Buying stock : " + name);
      }
      return myStock;
   }
}