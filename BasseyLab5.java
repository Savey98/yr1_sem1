package csci1011.basseylab5;
import java.util.Scanner;
/**
 *
 * @author Saviour
 * Lab 5 CSCI 1011
 * Program to use a menu based approach and switches to do Math
 */
public class BasseyLab5 {

    public static void main(String[] args) {
        // Main loop
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do{
            // Display menu
            System.out.println("Choose one of the following options:  ");
            System.out.println("1. Perform an arithmetic function");
            System.out.println("2. Apply a function");
            System.out.println("3. Calculate a factorial");
            System.out.println("4. Exit the program");
            
            System.out.println();
            // Read input from the user
            choice = keyboard.nextInt();
            System.out.println();
            
            // Use a switch to determine the case
            switch(choice){
                
                case 1: // Perform an arithmetic function
                    System.out.println("Enter an expression of the form NUM OP NUM: ");
                    
                    // Get the user input
                    int num1 = keyboard.nextInt();
                    String opString = keyboard.next();
                    int num2 = keyboard.nextInt();
                    
                    // Convert the OP to char
                    char opChar = opString.charAt(0);
                    
                    // Use a switch with the char for the operation
                    switch(opChar){
                        case '+':
                            System.out.printf("Result: " +  (num1+num2));
                            break;
                        case '-':
                            System.out.println("Result: " + (num1-num2));
                            break;
                        case '/':
                            System.out.println("Result: " + (num1/num2));
                            break;
                        case '*':
                            System.out.println("Result: " + (num1*num2));
                            break;
                        case '%':
                            System.out.println("Result: " + (num1%num2));
                            break;
                        default:
                            System.out.printf("Unknown operator: " + opString);
                            
                        
                            
                    }
                    // Invalid entry - display a message
                    break;
                case 2: // Apply a function
                    System.out.println("Enter an expression of the form FUNC ARG:");
                    String function = keyboard.next();
                    double arg = keyboard.nextDouble();
                    switch(function){
                        case "sqrt":
                            System.out.println("Result: " + Math.sqrt(arg));
                            break;
                        case "log":
                            System.out.println("Result: " + Math.log10(arg));
                            break;
                        case "ln":
                            System.out.println("Result: " + Math.log(arg));
                            break;
                        default:
                            System.out.println("Unknown function: " + function);
                    }
                    break;
                case 3: // Calculate a factorial
                    System.out.println("Enter a number");
                    int factNum = keyboard.nextInt();
                    int fact = 1;
                    while(factNum > 0){
                        fact *= factNum;
                        factNum --;
                    }
                    System.out.println("Result: " + fact);
                    break;
                case 4: // Exit the program
                    System.out.println("Thanks for using Saviour's calculator");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        // Exit loop if choice = 4
        }while (choice != 4);
        
        
        
    }
}
