import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> owe;
    
    public IOU(){
        this.owe=new HashMap<>();
    
    }
    public void setSum(String toWhom, double amount){
        this.owe.put(toWhom,amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.owe.getOrDefault(toWhom, 0.0);
    }
    
}
