
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//done

public class ShoppingCart {
    private Map<String,Item> cart=new HashMap<>();
    
    public void add(String product, int price){
        if(cart.containsKey(product)){
           cart.get(product).increaseQuantity();;
        }else{
            Item newItem=new Item(product,1,price);
            cart.put(product,newItem);
        }
    }
    public int price(){
        int totalPrice=0;
        Collection<Item> values = cart.values();
        for(Item prices: values){
            totalPrice+=prices.price();
        }
        return totalPrice;
    }
    public void print(){
        Set<String> keys = cart.keySet();
        Collection<String> keyCollection = keys;
        for(String keyCycle: keyCollection){
            System.out.println(cart.toString());
        }
        
    }
}
