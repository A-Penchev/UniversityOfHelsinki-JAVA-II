import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list=new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        int index=1;
        for(String cycle: list){
            System.out.println(index+": "+cycle);
            index++;
        }   
    }
    public void remove(int number){
        number-=1;
        this.list.remove(number);
    }
}
