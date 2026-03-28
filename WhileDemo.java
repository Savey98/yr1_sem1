package csci1011.whiledemo;
import java.util.Scanner;
/**
 *
 * @author Saviour
 */
public class WhileDemo {

    public static void main(String[] args) {
        System.out.println("While Demo!");
        int count, number;
        System.out.println("Enter a number:");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        //loop
        count = 1;
        while (count <= number){
            System.out.print(count + ", ");
            count++;
            
            
        }
        
        System.out.println();
        System.out.println("Buckle my shoe.");
             
    }
}
