
import java.util.ArrayList;


public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changes;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changes = new ChangeHistory();
        this.changes.add(initialBalance);
    }
    
    public String history(){
        return changes.toString();
    }
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changes.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount){
        double finalAmount=super.takeFromWarehouse(amount);
        this.changes.add(super.getBalance());
        return finalAmount;
    }
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
