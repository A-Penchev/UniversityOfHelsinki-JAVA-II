
import java.util.ArrayList;


public class OneItemBox extends Box {
    private ArrayList<Item> items;
    
    public OneItemBox(){
        this.items=new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(items.isEmpty()){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(!items.isEmpty()&&items.get(0).getName().equals(item.getName())){
            return true;
        }
        return false;
    }
    
}
