package csci1010.arrayoftemperatures;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 */
public class ArrayOfTemperatures {

    public static void main(String[] args) {
        double sum = 0;
        
        //read temps into the array
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many temperatures?");
        int size = keyboard.nextInt();
        System.out.println();
        System.out.println("Enter " + size + " temps");
        double[] temps = new double[size];
        //temps[0] = keyboard.nextDouble();
        
        //loop
        for (int i = 0; i < temps.length; i++){
            temps[i] = keyboard.nextDouble();
            sum += temps[i];
        }
        double average = sum / temps.length;
        
        System.out.println();
        //display each temperature and its relation to the average
        System.out.println("The average temp is: " + average);
        System.out.println("The temperatures are:");
        for (int i = 0; i < temps.length; i++){
            if (temps[i] < average){
                System.out.println(temps[i] + " below the average");
            }
            else if (temps[i] > average){
                System.out.println(temps[i] + " above average");
            }
            else{
                System.out.println(temps[i] + " the average");
            }
        }
        
        //display the temps
        //for (int i = 0; i < temps.length; i++){
          //  System.out.println("Temp at index " + i + " = " + temps[i]);
        //}
    }
}
