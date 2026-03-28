package csci1011.forloopdemo;

import java.util.Scanner;
/**
 *
 * @author Saviour
 */
public class ForLoopDemo {

    public static void main(String[] args) {
        System.out.println("For Loop Demo");
        double next, average, sum;
        int numberOfStudents;
        sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of students to grade: ");
        numberOfStudents = keyboard.nextInt();
        System.out.println("Enter the exam scores");
        for (int count = 1;count <= numberOfStudents; count++){ // for(value;, then evaluate; then increment)
            next = keyboard.nextInt();
            sum = sum + next;
        }
        average = sum/numberOfStudents;
        System.out.println("Average score is " + (sum/numberOfStudents));
    }
}
