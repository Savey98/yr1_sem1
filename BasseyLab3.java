package csci1011.basseylab3;
import java.util.Scanner;
/**
 *
 * @author Saviour
 */
public class BasseyLab3 {

    public static void main(String[] args) {
        
        //declare variables
       // String courseCode = "CSCI 1011";
       //String courseTitle =  "Introduction to Programming I Lab";
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the course code");
        String courseCode = keyboard.nextLine();
        
        System.out.println("Enter the course title");
        String courseTitle = keyboard.nextLine();
                
       
        //concat strings
        String welcomeMessage = "Welcome to " + courseCode + ": " + courseTitle + "!";
       
        //display welcomeMessage
        System.out.println("Testing + operator");
        System.out.println(welcomeMessage);
        System.out.println();
        
        //to Lowercase
        System.out.println("Testing toLowercase");
        System.out.println(welcomeMessage.toLowerCase());
        System.out.println();
        
        //to Uppercase
        System.out.println("Testing to Uppercase");
        System.out.println(welcomeMessage.toUpperCase());
        System.out.println();
        
        //length
        System.out.println("Testing length");
        System.out.println("The length of the string welcomeMessage is: " + welcomeMessage.length());
        System.out.println();
        
        //declare welcomeMessage2
        String welcomeMessage2 = welcomeMessage.toUpperCase();
        System.out.println("welcomeMessage2: " + welcomeMessage2);
        
        //equals
        System.out.println("Testing equals method");
        boolean msgEqual = welcomeMessage.equals(welcomeMessage2);
        System.out.println("Messages are equal: " + msgEqual);
        System.out.println();
        
        //equalIsIgnoreCase
        System.out.println("Testing equalsIsIgnoreCase method");
        System.out.println("Testing equalsisIgnoreCase method: " +  welcomeMessage.equalsIgnoreCase(welcomeMessage2));
        System.out.println();
        
        //replace
        System.out.println("Testing replace method");
        welcomeMessage = welcomeMessage.replace("1011", "1010");
        System.out.println(welcomeMessage);
        System.out.println();
        
        //indexof
        //substring
        //concat substring and display
        System.out.println("Testing indexof, substring, and concat method");
        int index = welcomeMessage.indexOf("Introduction");
        //System.out.println("What is my index??:);
        welcomeMessage = welcomeMessage.substring(0, index);
        System.out.println(welcomeMessage);
        System.out.println();
    }
}
