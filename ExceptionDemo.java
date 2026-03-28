package csci1010.exceptiondemo;

import java.util.Scanner;

/**
 *
 * @author Saviour Bassey
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Try-Catch Block
        try {
            System.out.println("Enter the number of donuts");
            int donutCount = keyboard.nextInt();
            System.out.println("Enter the glasses of milk: ");
            int milkCount = keyboard.nextInt();

            //Could be dangerous
            if (milkCount < 1) {
                throw new Exception("Exception: No milk!");
            }
            double donutsPerGlass = donutCount / (double) milkCount;
            System.out.println(donutCount + " donuts");
            System.out.println(milkCount + " glasses of milk");
            System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Go buy milk!");
            
        }
        System.out.println("End of program");
    }
}
