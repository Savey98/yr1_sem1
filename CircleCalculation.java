/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.circlecalculation;
import java.util.Scanner;

/**
 *
 * @author Saviour
 */
public class CircleCalculation { // class - outer structure

    public static void main(String[] args) { // method - nested structure
        
        double radius; // in inches
        double area; // in square inches
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of a circle in inches");
        radius = keyboard.nextDouble(); // reads rational number from the console
        area = 3.14159 * radius * radius;
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of" + area + " square inches");
    }
}
