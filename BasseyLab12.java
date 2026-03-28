package csci1010.basseylab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *CSCI 1011 Lab 12
 * @author Saviour Bassey
 * This is a program designed to allow for easy reading & writing to a file
 */
public class BasseyLab12 {

    public static void main(String[] args) {
        //declare variables
        String fileName = "testfile.txt";
        PrintWriter outputFile;
        int linesWritten, linesRead;
        Scanner inputFile = null;

        //Create an empty file and write to it
        outputFile = openFileForWriting(fileName);
        linesWritten = writeLinesToFile(outputFile);
        System.out.println("Wrote " + linesWritten + " lines to " + fileName);
        System.out.println();
        outputFile.close();
        
        //Display the file
        inputFile = openFileForReading(fileName);
        System.out.println("Opened file " + fileName + " for reading");
        linesRead = readLinesFromFile(inputFile);
        System.out.println("Read " + linesRead + " from the file " + fileName);
        System.out.println();
        inputFile.close();
        
        //Append lines to the file
        outputFile = openFileForAppending(fileName);
        System.out.println("Opened file " + fileName + " for appending");
        linesWritten = writeLinesToFile(outputFile);
        System.out.println("Wrote " + linesWritten + " lines to " + fileName);
        System.out.println();
        outputFile.close();
        
        //Display the file
        inputFile = openFileForReading(fileName);
        System.out.println("Opened file " + fileName + " for reading");
        linesRead = readLinesFromFile(inputFile);
        System.out.println("Read " + linesRead + " from the file " + fileName);
        System.out.println();
        inputFile.close();
    }

    //Method to activate PrintWriter
    public static PrintWriter openFileForWriting(String fileName) {
        PrintWriter outFile = null;
        try {
            outFile = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file " + fileName + " for writing");
            System.exit(0);
        }
        return outFile;
    }

    //Method to allow for writing to file
    public static int writeLinesToFile(PrintWriter outputFile) {
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        int linesWritten = 0;
        System.out.println("Enter the text you want to write to the file.");
        System.out.println("Enter a blank line when you are done");
        do {
            line = keyboard.nextLine();
            if (line.length() > 0) {
                outputFile.println(line);
                linesWritten++;
            }
        } while (line.length() > 0);

        return linesWritten;
    }
    
    //Method to allow appending to same file
    public static PrintWriter openFileForAppending(String fileName){
        PrintWriter outFile = null;
        try{
            outFile = new PrintWriter(new FileOutputStream(fileName, true));
        }
        catch (FileNotFoundException e){
            System.out.println("Could not open file " + fileName + " for appending");
            System.exit(0);
        }
        return outFile;
    }
    
    //Method to display written texts to user
    public static Scanner openFileForReading(String fileName){
        Scanner inputFile = null;
        try{
            inputFile = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e){
            System.out.println("Could not open the file " + fileName + " for reading");
            System.exit(0);
        }
        return inputFile;
    }
    
    //Method to determine the number of lines
    public static int readLinesFromFile(Scanner inputFile){
        int linesRead = 0;
        while (inputFile.hasNextLine()){
            String line = inputFile.nextLine();
            linesRead ++;
            System.out.println(line);
        }
        return linesRead;
    }
}
