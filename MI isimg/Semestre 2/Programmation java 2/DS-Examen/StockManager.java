import java.util.*;

public class StockManager {
    public static void main(String[] args) {
        Map<String, Integer> stock = new LinkedHashMap<>();

        System.out.println(stock.putIfAbsent("Ordinateur", 10)); 
        stock.putIfAbsent("Clavier", 5);
        stock.putIfAbsent("Souris", 8);        
        System.out.println(stock.putIfAbsent("Clavier", 15));        
        System.out.println(stock.putIfAbsent(null, 0));

        System.out.println("Stock après putIfAbsent : " + stock);

        System.out.println(stock.computeIfAbsent("Casque", key -> 7)); 
        System.out.println(stock.computeIfAbsent("Clavier", key -> 20)); 
        System.out.println(stock.computeIfAbsent(null, key -> 10)); 
        System.out.println(stock.computeIfAbsent("Flash", key -> null)); 

        System.out.println("Stock après computeIfAbsent : " + stock);

        System.out.println(stock.computeIfPresent("Souris", (key, qty) -> qty + 5)); 
        System.out.println(stock.computeIfPresent("Imprimante", (key, qty) -> 3)); 
        System.out.println(stock.computeIfPresent("Ordinateur", (key, qty) -> qty = null)); 

        System.out.println("Stock après computeIfPresent : " + stock);
      
        System.out.println(stock.compute("Souris", (key, qty) -> qty + 5));        
        System.out.println(stock.compute("Imprimante", (key, qty) -> qty = 3)); 
        System.out.println(stock.compute("Casque", (key, qty) -> qty = null)); 
        
        System.out.println("Stock après compute : " + stock);

    }
}

