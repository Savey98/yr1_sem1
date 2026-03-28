package csci1010.textfileinputdemo;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author Saviour Bassey
 */
public class TextFileInputDemo {

    public static void main(String[] args) {
        String fileName = "out.txt";
        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\n contains the following lines:\n");
        try{
            inputStream = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the: " + fileName + " file");
            System.exit(0);
        }
        while (inputStream.hasNextLine()){
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("Done reading from the " + fileName + " file");
        inputStream.close();
    }
}
