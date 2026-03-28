package csci1011.delimitersdemo;

import java.util.Scanner;
/**
 *
 * @author Saviour
 */
public class DelimitersDemo {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        
        keyboard2.useDelimiter("##");
        // .useDelimiter means that keyboard2 will use ## as whitespace(spaes, newline, tabs)
        // keyboard1 will still use whitespace
        
        String s1, s2;
        System.out.println("Enter a line of text with two words: ");
        s1 = keyboard1.next();
        s2 = keyboard1.next();
        System.out.println("The two words are \"" + s1 + "\" and \"" + s2 + "\"");
        System.out.println();
        
        System.out.println("Enter a line of text with two words");
        System.out.println("delimited by ##: ");
        s1 = keyboard2.next();
        s2 = keyboard2.next();
        System.out.println("The two words are \"" + s1 + "\" and \"" + s2 + "\"");
         
        
                                     
        
        
    }
}
