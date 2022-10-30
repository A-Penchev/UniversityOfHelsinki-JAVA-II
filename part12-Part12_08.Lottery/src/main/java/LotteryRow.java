
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random r=new Random();
        while(numbers.size()<7){
            int ranNum=r.nextInt(40)+1;
            if(!containsNumber(ranNum)){
                numbers.add(ranNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

