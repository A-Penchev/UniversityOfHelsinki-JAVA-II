
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box box = new BoxWithMaxWeight(5);
        
        System.out.println("add item");
        String name=scan.nextLine();
        int weight=Integer.valueOf(scan.nextLine());
        box.add(new Item(name,weight));
        box.isInBox(new Item(name));
        
    }
}
