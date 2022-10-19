
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> countries = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(rows->rows.split(","))
                    .map(parts->new Literacy(parts[3],Integer.valueOf(parts[4]),parts[2],Double.valueOf(parts[5])))
                    .forEach(country->countries.add(country));
                    
    }   catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(countries);
        countries.stream()
                .forEach(country->System.out.println(country.getCountry()+" ("+country.getYear()+"), "+country.getGender()+", "+country.getLiteracyPercentage()));
    }
}
