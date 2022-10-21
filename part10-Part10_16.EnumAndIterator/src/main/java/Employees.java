
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private List<Person> people=new ArrayList<>();;
    
    public void add(Person personToAdd){
        this.people.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator=peopleToAdd.iterator();
        
        while(iterator.hasNext()){
            people.add(iterator.next());
        }
    }
    public void print(){
        Iterator<Person> iterator=people.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
        Iterator<Person> iterator=people.iterator();
        
        while(iterator.hasNext()){
            Person nextPerson=iterator.next();
            if(nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator=people.iterator();
        
        while(iterator.hasNext()){
            Person nextPerson=iterator.next();
            if(nextPerson.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
