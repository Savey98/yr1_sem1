package csci1010.textfileoutputdemo;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 */
public class TextFileOutputDemo {

    public static void main(String[] args) {
        String fileName = "out.txt";
        PrintWriter outputStream = null;
        try{
            outputStream = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file: " + fileName);
            System.exit(0);
        }
        //Get data to write to the file
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ENter three lines of text");
        for (int i =0; i < 3; i++){
            String line = keyboard.nextLine();
            outputStream.println(line);
        }
        outputStream.close();
        System.out.println("Lines written to: " + fileName);
    }
}
