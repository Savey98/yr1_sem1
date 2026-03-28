package csci1010.basseyassign6;
import java.util.Scanner;

/**
 *CSCI 1010 Assignment 6
 * @author Saviour Bassey
 * This is a program designed to display an album and its details
 */
public class BasseyAssign6 {

    public static void main(String[] args) {
        //Welcome message and user prompt
        System.out.println("Welcome to Bassey Saviour's Album Length "
                + "caculator");
        System.out.println("Please enter all 12 track lengths in minutes and "
                + "seconds separated by a space");
        
        // Store length of tracks in an array
        Scanner keyboard = new Scanner(System.in);
        int numberOfTracks = 12;
        int[] trackLengths = new int[numberOfTracks];
        for (int i =0; i < numberOfTracks; i++ ){
            System.out.print("Track " + (i + 1) + " ");
            int minutes = keyboard.nextInt();
            int seconds = keyboard.nextInt();
            trackLengths[i] = (minutes * 60) + seconds;
        }
        
        //declare variables for specified tracks and their lengths
        int shortestTrack = trackLengths[0];
        int longestTrack = trackLengths[0];
        int shortestIndex = 0;
        int totalLength = 0;
        int longestIndex = 0;
        
        //Determine the lengths of tracks 
        for (int i=0; i < trackLengths.length; i++){
            totalLength += trackLengths[i];
            if (trackLengths[i] < shortestTrack){
                shortestTrack = trackLengths[i];
                shortestIndex = i;
            }
            if (trackLengths[i] > longestTrack){
                longestTrack = trackLengths[i];
                longestIndex = i;
            }
        }
            
            //Calculate average length f trackon the album
            double averageLength = (double) totalLength / numberOfTracks;
            
            //Display various info to the user
            System.out.println();
            System.out.print("The shortest track is Track " + (shortestIndex + 
                    1) + " at " );
            displayTime(shortestTrack);
            System.out.print("The longest track is Track " + (longestIndex + 1)
                    + " at ");
            displayTime(longestTrack);
            System.out.print("The total length of the album is: ");
            displayTime(totalLength);
            System.out.print("The average length of a track is: ");
            displayTime((int)averageLength);
    }
    
    //displayTime method to format the length of tracks
    private static void displayTime(int totalSeconds){
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        if (seconds < 10){
            System.out.print(minutes + ":0" + seconds);
        }
        else{
            System.out.print(minutes + ":" +seconds);
        }
        System.out.println();
    } 
}
