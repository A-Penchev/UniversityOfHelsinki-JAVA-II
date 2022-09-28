
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        double count=0;
        while(true){
            int inputNum=Integer.parseInt(scanner.nextLine());
            if(inputNum==0){
                if(count==0){
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if(inputNum>=0){
                sum+=inputNum;
                count++;
            }
        }
        System.out.println(sum/count);
        
    }
}
