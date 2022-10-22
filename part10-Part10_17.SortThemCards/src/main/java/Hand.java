
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Hand implements Comparable<Hand> {
    private List<Card> cards=new ArrayList<>();
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        cards.stream()
                .forEach(card->System.out.println(card));
    }
    public void sort(){
        Collections.sort(cards);
    }
    public void sortBySuit(){
        Comparator<Card> cardsSort=Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(cards, cardsSort);
    }

    @Override
    public int compareTo(Hand hand) {
        int sumCards=0;
        int sumHands=0;
        Iterator<Card> iteratorCards=cards.iterator();
        Iterator<Card> iteratorHand=hand.cards.iterator();

        while(iteratorCards.hasNext()){
            int cardValue=iteratorCards.next().getValue();
            sumCards+=cardValue;
        }
        
        while(iteratorHand.hasNext()){
            int cardValue=iteratorHand.next().getValue();
            sumHands+=cardValue;
        }
        
        return sumCards-sumHands;
    }
}
