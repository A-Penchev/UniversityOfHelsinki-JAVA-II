
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> productHistory;
    
    public ChangeHistory(){
       this.productHistory=new ArrayList<>();
    }
    public void add(double status){
       this.productHistory.add(status);
    }
    public void clear(){
       this.productHistory.clear();
    }
    public double maxValue(){
        if(productHistory.isEmpty()){
            return 0;
        }
        double tempMax=productHistory.get(0);
        for(Double cycleProduct: productHistory){
            if(cycleProduct>tempMax){
                tempMax=cycleProduct;
            }
        }
        return tempMax;
    }
    public double minValue(){
        if(productHistory.isEmpty()){
            return 0;
        }
        double tempMin=productHistory.get(0);
        for(Double cycleProduct: productHistory){
            if(cycleProduct<tempMin){
                tempMin=cycleProduct;
            }
        }
        return tempMin;
    }
    public double average(){
        if(productHistory.isEmpty()){
            return 0;
        }
        double sum=0.0;
        double count=0.0;
        for(Double cycleProduct: productHistory){
            count++;
            sum+=cycleProduct;
        }
        return sum/count;
    }
    public String toString(){
        return productHistory.toString();
    }
}
