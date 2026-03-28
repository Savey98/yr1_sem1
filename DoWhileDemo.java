package csci1011.dowhiledemo;
import java.util.Scanner;

/**
 *
 * @author Saviour
 */
public class DoWhileDemo {

    public static void main(String[] args) {
        System.out.println("Do While Demo");
        int count, number;
        System.out.println("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        count = 1;
        
        do{
            System.out.println(count + ", ");
            count ++;
      
        } while(count <= number);
        System.out.println("Buckle my shoe");
       
    }
}
