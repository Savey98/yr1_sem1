package csci1011.stringdemo;

/**
 *
 * @author Saviour
 */
public class StringDemo {

    public static void main(String[] args) {
       //System.out.println("Hello World!");
        String sentence = "Text processing is hard!"; 
        
        System.out.println(sentence);
       // System.out.println(sentence.length()); // .length is used to show the amount of characters in sentence.
        System.out.println("012345678901234567890123");
        
        int position = sentence.indexOf("hard"); // indexOf is used to show the number of letters in the phrase selected
        System.out.println("The word \"hard\" starts at index " + position);
        System.out.println();
        
        sentence = sentence.substring(0, position) + "easy!"; // .substring "0" (T) the start index is inclusive but "position" (hard) the end index is not added
        System.out.println(sentence);
        System.out.println();
        
        sentence = sentence.toUpperCase();
        System.out.println("The changed string is: ");
        System.out.println(sentence);
    }
}
