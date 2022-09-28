
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;

        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");

            String input = scan.nextLine();
            if (input.contains("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount<0){
                amount=0;
            } //makes it so that negative amounts are obsolete
            
            if(command.equals("add")){
                first+=amount;
                if(first>100){
                    first=100;
                }
            }
            
            if(command.equals("move")){
                if(first>=amount){
                    first-=amount;
                    second+=amount;
                }else{
                    second=first;
                    first=0;
                }
                if(first<0){
                    first=0;
                }
                if(second>100){
                    second=100;
                }
            }
            
            if(command.equals("remove")){
                second-=amount;
                if(second<0){
                    second=0;
                }
            }

        }
    }

}
