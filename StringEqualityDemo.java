package csci1011.stringequalitydemo;

import java.util.Scanner;

/**
 *
 * @author Saviour
 */
public class StringEqualityDemo {

    public static void main(String[] args) {
        System.out.println("Compare Strings!");
        String s1, s2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two lines of text");
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        
        // compare the strings
        if (s1.equals(s2)){
            System.out.println("The two lines are equal");
        }
        else {
            System.out.println("The two lines are not equal");
        }
        
        // comparing ignoring case
        if (s2.equalsIgnoreCase(s1)){
            System.out.println("(Ignore Case) The two lines are equal");
        }
        }
}
