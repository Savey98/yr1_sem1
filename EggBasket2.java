package csci1011.eggbasket2;

import java.util.Scanner; // gets Scanner class from java.util package
/**
 *
 * @author Saviour
 */
public class EggBasket2 {

    public static void main(String[] args) {
        int numberOfBaskets, eggsPerBasket, totalEggs;
        Scanner keyboard = new Scanner(System.in); // sets up scanner to read input
        System.out.println("Enter the number of eggs in each basket:");
        eggsPerBasket = keyboard.nextInt();        // reads an int from the console
        System.out.println("Enter the number of baskets:");
        numberOfBaskets = keyboard.nextInt();      // reads another int from the console
        
        totalEggs = numberOfBaskets * eggsPerBasket;
        
        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and"); // displays value and text
        System.out.println(numberOfBaskets +  " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);
        
        eggsPerBasket = eggsPerBasket - 2;// Changes the value of eggsPerBasket to -2 the original
        
        totalEggs = eggsPerBasket * numberOfBaskets;
        
        System.out.println("You now have");
        System.out.println(eggsPerBasket + " eggs per basket and"); // displays value and text
        System.out.println(numberOfBaskets +  " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);

    }
}
