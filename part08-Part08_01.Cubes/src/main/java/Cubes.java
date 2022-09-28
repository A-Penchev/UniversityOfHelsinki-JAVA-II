
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Give number");
        String numberGiven=scanner.nextLine();
        if(numberGiven.equals("end")){
            break;
        }
        int numberGivenInt=Integer.parseInt(numberGiven);
        System.out.println(numberGivenInt*numberGivenInt*numberGivenInt);
        }
    }
}
