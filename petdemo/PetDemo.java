package csci1011.petdemo;

import java.util.Scanner;

/**
 *
 * @author Saviour Bassey
 */
public class PetDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pet Demo");
        /*Pet p1 = new Pet();
        System.out.println("Pet()");
        p1.writeOutput();*/
        Pet p2 = new Pet();
        p2.writeOutput();
        
        
        //String name = keyboard.nextLine();
        //p2.writeOutput();/*
        
        //Pet p3 = new Pet("Tom", 2, 9);
        //p3.writeOutput();*/
        
    }
}
