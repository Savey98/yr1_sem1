package csci1010.basseyassign3;

import java.util.Scanner;

/**
 *This program is designed to help calculate the a dog's age equivalent 
 *to human years
 * @author Saviour Bassey
 */
public class BasseyAssign3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //display welcome message
        System.out.println("Welcome to Bassey Saviour's dog age calculator!");
        System.out.println();

        // do-while loop to calculate dog age
         
        String repeat;
        do {

            //Prompt user for dog name
            System.out.print("Please enter name of your dog: ");
            String dogName = keyboard.next();

            //prompt user for actual age of dog
            System.out.print("Please enter the actual age of your dog (1-16): ");
            int dogAge = keyboard.nextInt();

            //while loop to confirm dog's age
             
            while (!(dogAge >= 1 && dogAge <= 16)) {
                System.out.println("Error: age is out of range");
                System.out.print("Please enter the actual age of your dog (1-16): ");
                dogAge = keyboard.nextInt();
            }

            //prompt user for weight of dog
            System.out.print("Please enter your dog weight in pounds: ");
            int dogWeight = keyboard.nextInt();

            //while loop to confirm dog's weight
             
            while (dogWeight <= 0) {
                //prompt for age of dog
                System.out.println("Error: weight must be greater than zero");
                System.out.print("Please enter your dog weight in pounds: ");
                dogWeight = keyboard.nextInt();
            }

            //display dog's age using human age and dog's weight
            double equivalentHumanAge;
            if (dogAge == 1) {
                equivalentHumanAge = 15;
            } else if (dogAge >= 2 && dogAge <= 5) {
                equivalentHumanAge = (4 * dogAge) + 16;
            } else {

                if (dogWeight <= 20) {
                    equivalentHumanAge = (4 * dogAge) + 16;
                } else if (dogWeight >= 21 && dogWeight <= 50) {
                    equivalentHumanAge = (4.5 * dogAge) + 15;
                } else {
                    equivalentHumanAge = (7.5 * dogAge);
                }
            }
            System.out.println();
            System.out.println(dogName + "\'s age in human years is " + equivalentHumanAge);
            System.out.println();

            //confirm user will like to calculate another dog's age
            System.out.print("Would you like to calculate the age of another dog?(Y/N) ");
            repeat = keyboard.next();
            while (!(repeat.equalsIgnoreCase("Y") || repeat.equalsIgnoreCase("N"))) {
                System.out.println("Error: invalid choice");
                System.out.print("Would you like to calculate the age of another dog? (Y/N) ");
                repeat = keyboard.next();
            }
        } while (repeat.equalsIgnoreCase("Y"));

        //display thank you message
        System.out.println("Thank you for using the dog age calculator!");
    }
}
