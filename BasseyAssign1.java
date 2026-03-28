//Bassey, Saviour Aniefiok
//This is a program that calculate's the: area and perimeter of a square,
//                                        area and perimeter of a rectangle, and 
//                                        area of a triangle.
//Course: CSCI 1010-14
//Assignment name: Programming Assignment 1
package csci1011.basseyassign1;

import java.util.Scanner;


/**
 *
 * @author Saviour
 */
public class BasseyAssign1 {
    

    public static void main(String[] args) {
        System.out.println("Welcome to Saviour's geometry calculator");
        System.out.println("Enter the Square's side:");
        
        Scanner keyboard = new Scanner(System.in);
        
        int lengthOfSquare = keyboard.nextInt();
        
        int areaOfSquare = lengthOfSquare * lengthOfSquare;
        int perimeterOfSquare = lengthOfSquare * 4;
        
        System.out.println("Square Area: " + areaOfSquare);
        System.out.println("Square Perimeter: " + perimeterOfSquare);
        System.out.println("");
        
        System.out.println("Enter the rectangle's length:");
        int lengthOfRectangle = keyboard.nextInt();
        
        System.out.println("Enter rectangle's width:");
        int widthOfRectangle = keyboard.nextInt();
        
        int areaOfRectangle = lengthOfRectangle * widthOfRectangle;
        int perimeterOfRectangle = (lengthOfRectangle + widthOfRectangle) * 2;
        
        System.out.println("Rectangle Area: " + areaOfRectangle);
        System.out.println("Rectangle Perimeter: " + perimeterOfRectangle);
        System.out.println("");
        
        System.out.println("Enter triangle's base:");
        int triangleBase = keyboard.nextInt();
        
        System.out.println("Enter triangle's height:");
        int triangleHeight = keyboard.nextInt();
        
        int areaOfTriangle = (triangleBase * triangleHeight) / 2;
        
        System.out.println("Triangle Area:" + areaOfTriangle);
        
        
        
        
        
    }
}
