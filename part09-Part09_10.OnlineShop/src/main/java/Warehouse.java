
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> prices=new HashMap<>();;
    private Map<String, Integer> stocks=new HashMap<>();;
    
    public void addProduct(String product, int price, int stock){
        prices.put(product,price);
        stocks.put(product,stock);
    }
    
    public int price(String product){
        Set<String> keys = prices.keySet();
        Collection<String> keyCollection = keys;
        for(String key: keyCollection){
            if(key.equals(product)){
                return this.prices.get(product);
            }
        }
        return -99;
        
        //return this.prices.getOrDefault(product, -99);
    }
    public int stock(String product){
        Set<String> keys = stocks.keySet();
        Collection<String> keyCollection = keys;
        for(String key: keyCollection){
            if(key.equals(product)){
                return this.stocks.get(product);
            }
        }
        return 0;
        // return this.quantities.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if(stocks.containsKey(product)){
            int productStock=stocks.get(product);
            if(productStock==0){
                productStock++;
            }
            stocks.put(product,productStock-1);
            if(stocks.get(product)>0){
                return true;
            }
        }
        return false;
    }
    public Set<String> products(){
        Set<String> keys = stocks.keySet();
        return keys;
    }
    
}
