
import java.util.ArrayList;
import java.util.List;


public class Hideout{
    private T obj;
    
    public Hideout(){
        
    } 
    public void putIntoHideout(T toHide){
        obj=toHide;
    }
    public T takeFromHideout(){
        if(obj==null){
            return null;
        }
        return null;
    }
    public boolean isInHideout(){
        return obj!=null;
    }

    private static class T {

        public T() {
        }
    }
}
