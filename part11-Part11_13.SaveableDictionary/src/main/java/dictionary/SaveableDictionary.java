
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveableDictionary {
    private Map<String,String> dictionary=new HashMap<>();
    private String file;
    
    public SaveableDictionary(){
        
    }
    
    public SaveableDictionary(String file){
        this.file=file;
    }
    public boolean load(){
        try{
            File myObj = new File(this.file);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String line=myReader.nextLine();
                String[] parts=line.split(":");
                String word=parts[0];
                String translation=parts[1];
                
                dictionary.put(word,translation);
            }
            
            return true;
        }catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
        }
        return false;
    }
    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(this.file);
            for(String cycle:dictionary.keySet()){
                writer.println(cycle+":"+dictionary.get(cycle));
            }
            writer.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void add(String words, String translation){
        dictionary.putIfAbsent(words, translation);
    }
    public String translate(String word){
        for(String cycle:dictionary.keySet()){
            if(cycle.equals(word)){
                return dictionary.get(cycle);
            }
        }
        for(String cycle: dictionary.keySet()){
            if(dictionary.get(cycle).contains(word)){
                return cycle;
            }
        }
        return null;
    }
    public void delete(String word){
        dictionary.entrySet()
            .removeIf(entry -> (word.equals(entry.getValue())));
        dictionary.remove(word);
    }
}

/***public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.words.put(parts[0], parts[1]);
                        this.words.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }***/