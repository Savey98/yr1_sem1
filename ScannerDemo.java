package csci1011.scannerdemo;
import java.util.Scanner;

/**
 *
 * @author Saviour
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter two whole numbers");
        System.out.println("seperated by one or more spaces:");
        
        int n1, n2;
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        System.out.println("You entered " + n1 + " and " + n2);
        System.out.println();
        
        System.out.println("Next enter two numbers");
        System.out.println("A decimal point is Ok:");
        
        double d1, d2;
        d1 = keyboard.nextDouble();
        d2 = keyboard.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);
        
        System.out.println("Next enter two words:");
        String s1, s2;
        s1 = keyboard.next();
        s2 = keyboard.next();
        
        System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
        /* Quotations: \"" is used to end one and also begin a new one,
        "\" is used to close s1 and write and, \"" is used to close and
        "\" is used to begin s1 and \"" ends it
        */ 
        s1 = keyboard.nextLine();
        System.out.println("Next enter a line of text");
        s1 = keyboard.nextLine();
        System.out.println("You entered: \"" + s1 + "\"");
               
    }
}
