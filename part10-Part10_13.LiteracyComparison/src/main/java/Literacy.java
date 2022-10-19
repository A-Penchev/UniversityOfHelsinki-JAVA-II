
public class Literacy implements Comparable<Literacy>{
    private String country;
    private int year;
    private String gender;
    private double literacyPercentage;
    
    public Literacy(String country, int year, String gender, double literacyPercentage){
        this.country=country;
        this.year=year;
        this.gender=gender;
        this.literacyPercentage=literacyPercentage;
    }
    public String getCountry(){
        return this.country;
    }
    public int getYear(){
        return this.year;
    }
    public String getGender(){
        if(this.gender.contains("female")){
            return "female";
        }
        return "male";
    }
    public double getLiteracyPercentage(){
        return this.literacyPercentage;
    }
    @Override
    public int compareTo(Literacy literacy) {
        return Double.compare(this.literacyPercentage, literacy.getLiteracyPercentage());
    }
}
