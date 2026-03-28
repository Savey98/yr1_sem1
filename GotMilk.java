package csci1010.gotmilk;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 */
public class GotMilk {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);   
        System.out.println("Enter the number of donuts");
        int donutCount = keyboard.nextInt();
        System.out.println("Enter the glasses of milk: ");
        int milkCount = keyboard.nextInt();
        if (milkCount < 1){
            System.out.println("No milk!");
            System.out.println("Go buy some milk!");
        }else{
            System.out.println(donutCount/(double)milkCount + " donuts for each glass of milk");
        }
        
    }
}
