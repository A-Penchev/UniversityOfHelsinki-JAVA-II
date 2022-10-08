
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> boxContents;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
        this.boxContents=new ArrayList<>();
    }
    
    @Override
    public void add(Item items){
        int totalContentsWeight=0;
        for(Item cycleItems: boxContents){
            totalContentsWeight+=cycleItems.getWeight();
        }
        if(totalContentsWeight<this.capacity||items.getWeight()==0){
            boxContents.add(items);
        }    
    }
    public boolean isInBox(Item item){
        for(Item cycleItems: boxContents){
            if(cycleItems.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
    
        
}
