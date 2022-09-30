import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbr;
    public Abbreviations(){
        this.abbr=new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbr.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if(abbr.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation){
        return abbr.get(abbreviation);
    }
    
}
