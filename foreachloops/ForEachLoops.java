package csci1011.foreachloops;


/**
 *
 * @author Saviour
 */
public class ForEachLoops {

    public static void main(String[] args) {
        System.out.println("Foreach loops");
        
        enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES, JOKERS}
                
        for (Suit nextSuit : Suit.values()){
            System.out.println(nextSuit + " ");
        }
    }    
}
