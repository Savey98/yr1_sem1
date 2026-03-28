package csci1011.examaverager;

import java.util.Scanner;

/**
 *
 * @author SaviourCompute the average of (non negative) exam scores
 * Repeats computation until the user quits
 */
public class ExamAverager {

    public static void main(String[] args) {
        System.out.println("Exam Averager");
        System.out.println("This program computes the average of a list of ");
        System.out.println("(non-negative) exam scores.");
        
        double sum;
        int numberOfStudents;
        double next;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println();
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after you have");
            System.out.println("entered all the scores");
            sum =  0;
            numberOfStudents = 0;
            next = keyboard.nextDouble();
            //do the maths
            while(next >= 0){
                sum += next;
                numberOfStudents++;
                next = keyboard.nextDouble();
            }
            if (numberOfStudents > 0){
                System.out.println("The average is " + (sum/numberOfStudents));
            }
            else{
                System.out.println("No scores to average");
            }
            // do again
            System.out.println("Want to average another exam");
            System.out.println("Enter yes or no.");
            answer = keyboard.next();
            }
        while(answer.equalsIgnoreCase("yes"));
    }
}
