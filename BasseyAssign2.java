package csci1011.basseyassign2;

import java.util.Scanner;

/**
 *
 * @author Saviour CSCI 1010
 * This is a workout calculator to derive the amount of calories that a person
 * burns after a workout session of badminton, running, walking and weight training.
 * 
 */

public class BasseyAssign2 {

    public static void main(String[] args) {
     

        // Welcome message
        System.out.println("Welcome to Bassey Saviour's Workout Calculator!");
        
        Scanner keyboard = new Scanner(System.in);
        final double badmintonBurn = 0.044;
        final double runningBurn = 0.087;
        final double walkingBurn = 0.036;
        final double weightTrainingBurn = 0.042;
        
        // Input weight
        System.out.print("Please enter your weight: ");
        int weight = keyboard.nextInt();

        // Input minutes for each activity
        System.out.print("Please enter the minutes spent playing badminton: ");
        int badmintonMinutes = keyboard.nextInt();

        System.out.print("Please enter the minutes spent running: ");
        int runningMinutes = keyboard.nextInt();

        System.out.print("Please enter the minutes spent walking: ");
        int walkingMinutes = keyboard.nextInt();

        System.out.print("Please enter the minutes spent lifting weights: ");
        int weightTrainingMinutes = keyboard.nextInt();

        // Calculating calories burned for each activity
        double badmintonCalories = badmintonBurn * weight * badmintonMinutes;
        double runningCalories = runningBurn * weight * runningMinutes;
        double walkingCalories = walkingBurn * weight * walkingMinutes;
        double weightTrainingCalories = weightTrainingBurn * weight * weightTrainingMinutes;

        // Total time and calories
        int totalMinutes = badmintonMinutes + runningMinutes + walkingMinutes + weightTrainingMinutes;
        int totalHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        double totalCalories = badmintonCalories + runningCalories + walkingCalories + weightTrainingCalories;
        
        System.out.println();
        // Output for each activity
        if (badmintonMinutes > 0) {
            System.out.printf("You spent %d minutes playing badminton and burned %.1f calories.\n", badmintonMinutes, badmintonCalories);
        }
        if (runningMinutes > 0) {
            System.out.printf("You spent %d minutes running and burned %.1f calories.\n", runningMinutes, runningCalories);
        }
        if (walkingMinutes > 0) {
            System.out.printf("You spent %d minutes walking and burned %.1f calories.\n", walkingMinutes, walkingCalories);
        }
        if (weightTrainingMinutes > 0) {
            System.out.printf("You spent %d minutes lifting weights and burned %.1f calories.\n", weightTrainingMinutes, weightTrainingCalories);
        }
        System.out.println();
        // Output total workout time and total calories
        System.out.printf("You spent %d hours and %d minutes working out and burned %.1f calories.\n", totalHours, remainingMinutes, totalCalories);
    }
}

      
      
    

