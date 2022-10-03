import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> items;
    
    public StorageFacility(){
        this.items=new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return items.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        for(String cycleUnits: items.keySet()){
            if(cycleUnits.equals(storageUnit)){
                items.get(cycleUnits).remove(item);     
            }
        }
        if(items.get(storageUnit).isEmpty()){
            items.remove(storageUnit);
            }
    }
    /***  public void remove(String storageUnit, String item) {
        if (!this.unitsAndContents.containsKey(storageUnit)) {
            return;
        }
 
        this.unitsAndContents.get(storageUnit).remove(item);
 
        if (this.unitsAndContents.get(storageUnit).isEmpty()) {
            this.unitsAndContents.remove(storageUnit);
        }
    }
    ***/
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> itemsList=new ArrayList<>();
        for(String cycleUnits: items.keySet()){
            if(!items.get(cycleUnits).isEmpty()){
                itemsList.add(cycleUnits);
            }
        }
        return itemsList;
    }
    
}
