package csci1011.basseylab6;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 * CSCI1011 Lab 6 
 * The code is used to build an arithmetic quiz
 * program for various tasks like addition and multiplication.
 */
public class BasseyLab6 {
    public static final int MAX_VALUE = 12;

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to Saviour's arithmetic quiz program");

        //do-while main loop
        boolean keepGoing = true;
        Scanner keyboard = new Scanner(System.in);
        do {

            //display menu and read input from user
            System.out.println("Please choose from the following options:");
            System.out.println("1. Addition Quiz");
            System.out.println("2. Multiplication Quiz");
            System.out.println("3. Addition Table");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Exit The Program");
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    int number = 0;
                    do {
                        System.out.println("Enter a number between 1 and " + MAX_VALUE);
                        number = keyboard.nextInt();
                    } while (number < 1 || number > MAX_VALUE);
                    int numCorrect = 0;
                    for (int count = 1; count <= MAX_VALUE; count++) {
                        if (choice == 1) {
                            System.out.println(number + " + " + count + " = ");
                        } else {
                            System.out.println(number + " * " + count + " = ");
                        }
                        int result = keyboard.nextInt();
                        if (choice == 1 && result == number + count || choice == 2 && result == number * count) {
                            numCorrect++;
                        }
                    } //end loop
                    System.out.println("You got " + numCorrect + " right out of " + MAX_VALUE);
                    break;
                case 3://ADDITION TABLE
                case 4:// Multiplication table
                    // display column headings'
                    System.out.print("    |");
                    for (int col = 1; col <= MAX_VALUE; col++) {
                        System.out.printf("%4d", col);
                    }
                    System.out.println();
                    
                    //display a horizontal line
                    System.out.print("----+");
                    for (int col = 1; col <= MAX_VALUE; col++) {
                        System.out.print("----");
                    }
                    System.out.println();
                    
                    //display row headings and rows
                    for (int row = 1; row <= MAX_VALUE; row++) {
                        //display the row heading
                        System.out.printf("%4d|", row);
                        //display the row
                        for (int col = 1; col <= MAX_VALUE; col++) {
                            if (choice == 3) {
                                System.out.printf("%4d", row + col);
                            } else {
                                System.out.printf("%4d", row * col);
                            }
                        }
                        System.out.println();
                    }

                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
            // exit if option 5
        } while (keepGoing);
        // display a thank you message
        System.out.println();
        System.out.println("Thank you for using Saviour Bassey's arithmetic quiz program");

    }
}
