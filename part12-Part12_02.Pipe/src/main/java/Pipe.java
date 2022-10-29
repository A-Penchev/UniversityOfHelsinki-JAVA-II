
import java.util.ArrayList;
import java.util.List;


public class Pipe<T> {
    private List<T> pipe=new ArrayList<>();
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    public T takeFromPipe(){
        T tempPipe=pipe.get(pipe.size()-1);
        pipe.remove(tempPipe);
        if(pipe.isEmpty()){
            return null;
        }
        return tempPipe;     
    }
    public boolean isInPipe(){
        return !pipe.isEmpty();
    }
    
}
