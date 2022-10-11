
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    private List<Movable> herd=new ArrayList<>();
    
    @Override
    public void move(int dx, int dy) {
        for(Movable cycle: herd){
            cycle.move(dx, dy);
            }
        }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(Movable cycle: herd){
            sb.append(cycle).append("\n");
        }
        return sb.toString();
    }  
}
