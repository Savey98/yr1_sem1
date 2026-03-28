package csci1011.multiplebirths;

import java.util.Scanner;
        
/**
 *
 * @author Saviour
 */
public class MultipleBirths {

    public static void main(String[] args) {
        System.out.println("Switch");
        int numberOfBabies;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of babies ");
        numberOfBabies = keyboard.nextInt();
        
        switch (numberOfBabies)
        {
            case 1:
                System.out.println("Congrats! ");
                //break;
            case 2:
                System.out.println("Wow, Twins. ");
                //break;
            case 3:
                System.out.println("Triplets? ");
                //break
            case 4:
            case 5:
                System.out.println(numberOfBabies + " babies? Wow!");
                //break;
            default:
                System.out.println("Good luck with that");
                //break;
        }
                
        
    }
}
