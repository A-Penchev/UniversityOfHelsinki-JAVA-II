import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> registry;
    
    public VehicleRegistry(){
        this.registry=new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(registry.get(licensePlate)!=null){
            return false;
        }
        registry.put(licensePlate,owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
       if(registry.containsKey(licensePlate)){
           return registry.get(licensePlate);
       }
       return null;
    }
    public boolean remove(LicensePlate licensePlate){
        if(!registry.containsKey(licensePlate)){
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }
    public void printLicensePlates(){
        for(LicensePlate cycleKey: registry.keySet()){
            System.out.println(cycleKey);
        }  
    }
    public void printOwners(){
        ArrayList<String> owners=new ArrayList<>();
        for(LicensePlate cycleKey: registry.keySet()){
            if(!owners.contains(registry.get(cycleKey))){
                owners.add(registry.get(cycleKey));
            }  
        }
        for(String cycleOwners: owners){
            System.out.println(cycleOwners);
        }
    }   
}
