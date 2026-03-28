package csci1011.petdemo;

import java.util.Scanner;

/**
 *
 * @author Saviour Bassey
 */
public class Pet {
    private String name;
    private int age;
    private double weight;
    
    //constructors
    /*public Pet(){
        name = "no name";
        age = 0;
        weight = 0;
    }*/
    
    
    public Pet(String name, int age, double weight){
        this.name = name;
        setAge(age);
        setWeight(weight);
    }
    
    /*public Pet(int age){
        name = "no name";
        setAge(age);
        weight = 0;
    }*/
    
    /*public Pet(double weight){
        name = "no name";
        age = 0;
        setWeight(weight);
        this.weight = weight;
    }*/

    
    
    
    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
       this.name = name;
        
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Error: negative age");
            System.exit(0);
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        if (weight < 0){
            System.out.println("Error: negative weight");
            System.exit(0);
        }
        this.weight = weight;
    }
    
    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight " + weight);
    }
    
    
    
}

