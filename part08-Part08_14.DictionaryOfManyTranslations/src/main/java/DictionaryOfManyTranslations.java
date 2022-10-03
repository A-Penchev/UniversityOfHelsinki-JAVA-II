import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> dictionary;
            
    public DictionaryOfManyTranslations(){
        this.dictionary=new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word,new ArrayList<>());
        
        ArrayList<String> translate=this.dictionary.get(word);
        translate.add(translation);
        // another way this.dictionary.get(word).add(translation);
        
    }
    public ArrayList<String> translate(String word){
        for(String cycleWords: dictionary.keySet()){
            if(cycleWords.equals(word)){
                return this.dictionary.get(cycleWords);
            }
        }
        return new ArrayList<>();
        // another way return dictionary.getOrDefault(word, new ArrayList<>());
    }
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
}
