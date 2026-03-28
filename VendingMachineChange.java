package csci1011.vendingmachinechange;
import java.util.Scanner;
/**
 *
 * @author Saviour
 */
public class VendingMachineChange {
    // If either the dividend or the divisor are floating point type, then the output will be floating type

    public static void main(String[] args) {
        System.out.println("Enter a whole number");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change");
        
        Scanner keyboard = new Scanner(System.in);
        
        int amount = keyboard.nextInt();
        int originalAmount = amount;
        
        int quarters = amount / 25; // maximum number of quarters in amount
        amount = amount % 25;       // change left over after giving out quarters
        
        int dimes = amount / 10;
        amount = amount % 10;
        
        int nickels = amount /5;
        amount = amount % 5;       // Note that if the amount is smaller than its divisor it will skip
        
        int pennies = amount;
        // % is the remainder operator or modulus
        
        System.out.println(originalAmount + " cents in coins can be given as");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");
    }
}
