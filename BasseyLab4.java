package csci1011.basseylab4;

import java.util.Scanner;

/**
 *
 * @author Saviour
 */
public class BasseyLab4 {

    public static void main(String[] args) {
        //prompt for day and time
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String dayOfTheWeek = keyboard.nextLine();
        System.out.println("Enter the time (XX:XXam/pm): ");
        String time = keyboard.nextLine();

        //Manipulate the time string to get hour, minutes and am/pm
        int length = time.length();
        int colonIndex = time.indexOf(':');

        // get the hours from the string
        // int hour = Intiger.parseInt(time.substring(0, colonIndex);
        String hourString = time.substring(0, colonIndex);
        int hour = Integer.parseInt(hourString);

        // get the minutes
        String minutesString = time.substring(colonIndex + 1, length - 1);
        int minute = Integer.parseInt(minutesString);

        //get the suffix
        String timeSuffix = time.substring(length - 2);

        //determine if the professor is in
        //validate the hours and minutes
        if (hour < 1 || hour > 12) {
            System.out.println("Invalid time");
        } else if (dayOfTheWeek.equalsIgnoreCase("Mon") || dayOfTheWeek.equalsIgnoreCase("Monday")) {
            System.out.println("Day of the week: " + dayOfTheWeek);
        }else{
            System.out.println("Invalid day");
        }     
            //3:00pm - 5:00pm
            if (timeSuffix.equalsIgnoreCase("am")) {
                System.out.println("Not available");
            } else if ((hour >= 3 && hour <= 4) || (hour == 5 && minute == 0)) {
                System.out.println("Available");
            } else {
                System.out.println("Not available");
            }
            
            if (hour < 1 || hour >12){
                System.out.println("Invalid time");
            } else if (dayOfTheWeek.equalsIgnoreCase("Thu") || dayOfTheWeek.equalsIgnoreCase("Monday")){
                    System.out.println("Day of the week: " + dayOfTheWeek);
                    } else {
                System.out.println("Invalid day");
            }
                    //3:30 - 5:00pm
                    if (timeSuffix.equalsIgnoreCase("am")){
                        System.out.println("Not available");
                    } else if ((hour >= 3 && minute >= 30 ) || (hour <= 4) || (hour == 5 && minute == 0)){
                        System.out.println("Available");
                    } else {
                        System.out.println("Not available");
                    }
                    
                    if (hour < 1 || hour >12){
                        System.out.println("Invalid time");
                    } else if (dayOfTheWeek.equalsIgnoreCase("Fri") || dayOfTheWeek.equalsIgnoreCase("Friday")){
                        System.out.println("Day of the week: " + dayOfTheWeek);    
                    }else {
                                System.out.println("Invalid day");
                                }

                    //3:00 - 4:30pm
                    if (timeSuffix.equalsIgnoreCase("am")){
                        System.out.println("Not available");
                    } else if ((hour >= 3 && hour <= 4 ) || (hour == 4 && minute <= 30)){
                        System.out.println("Available");
                    }
         
        
    }
}
        
        
        
        
