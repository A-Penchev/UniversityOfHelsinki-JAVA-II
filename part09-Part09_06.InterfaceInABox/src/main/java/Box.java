
import java.util.ArrayList;


public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> totalWeight;
    
    public Box(double maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.totalWeight=new ArrayList<>();
        
    }
    
    public void add(Packable item){
        double tempWeight=this.weight()+item.weight();
        if(tempWeight<maximumCapacity){
            totalWeight.add(item);
        } 
    }
    
    @Override
    public double weight() {
        double totalItemWeight=0.0;
        for(Packable cycleItems: totalWeight){
            totalItemWeight+=cycleItems.weight();          
        }
        if(totalItemWeight>maximumCapacity){
            return maximumCapacity;
        }
        return totalItemWeight;
    }
    

    @Override
    public String toString(){
        return "Box: "+this.totalWeight.size()+" items, total weight "+this.weight()+" kg";
    }
}
