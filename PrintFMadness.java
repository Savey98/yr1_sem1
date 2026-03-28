package me.printfmadness;

/**
 *
 * @author Saviour
 */
public class PrintFMadness {

    public static void main(String[] args) {
        System.out.println("Printf madness");
        // strings
        /* 
        String lang = "java";
        System.out.printf("I love %s", lang);
        System.out.printf("I love %20s! \n", lang);
        System.out.printf("I love %15s! \n", lang);
        System.out.printf("I love %S! %n", lang);
        System.out.printf("Original Value " + lang);
        */
        
        // numbers
        int wholeNumber = 1234567890;
        System.out.printf("Big money %d %n", wholeNumber);
        System.out.printf("Big money $%015d !%n", wholeNumber);
          
        double precisionNumber = 3.1456;
        System.out.printf("Pie %f %n", precisionNumber);
        System.out.printf("Pie %015.8f %n", precisionNumber);
        System.out.printf("1234567890 in base 8 is %o", wholeNumber);
        System.out.printf("123456789 in base 16 is %x %n", wholeNumber);
        System.out.println("Thank you");
        
              
        
               
    }
}
