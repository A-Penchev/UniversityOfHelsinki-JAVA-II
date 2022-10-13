
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> inputs=new ArrayList<>();
            while(true){
                int input=Integer.valueOf(scanner.nextLine());
                if(input<0){
                    break;
                }
                inputs.add(input);
            }
        
        inputs.stream()
                .filter(number->number<=5&&number>=1)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(number->System.out.println(number));
    
    }
}
