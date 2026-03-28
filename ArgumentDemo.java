package csci1010.argumentdemo;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 */
public class ArgumentDemo {

    public static void main(String[] args) {
        System.out.println("Argument Demo");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score on exam 1: ");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[3];
        
        for (int i = 0; i < nextScore.length; i++){
            nextScore[i] = firstScore + 5 * i;
        }
        //
        
        for (int i = 0; i < nextScore.length; i++){
            double possibleAverage = getAverage(firstScore, nextScore[i]);
            System.out.println("If your score on exam 2 is " + nextScore[i]);
            System.out.println("Your average will be " + possibleAverage);
        }
    }
    
    public static double getAverage(int n1, int n2){
        return (n1 + n2) / 2.0;
    }
}
