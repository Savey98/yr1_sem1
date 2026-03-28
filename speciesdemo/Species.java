package csci1011.speciesdemo;
import java.util.Scanner;
/**
 *
 * @author Saviour Bassey
 */
public class Species {
    public String name;
    public int population;
    public double growthRate;
    
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the species name: ");
        name = keyboard.nextLine();
        System.out.println("What is the population of the species: ");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate % per year: ");
        growthRate = keyboard.nextDouble();
    }
    
    public void writeOutput(){
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth Rate = " + growthRate);
    }
    
    /**
     * 
     * @return 
     */
    public int getPopulationIn10(){
        int result = 0;
        // do math
        double populationAmount = population;
        int count = 10;
        while ((count > 0) && (populationAmount > 0)){
            populationAmount = populationAmount + (growthRate/100) * 
                    populationAmount;
            count --;
        }
        if (populationAmount > 0){
            result = (int)populationAmount;
        }
        return result;
    }
    
    public int predictPopulation(int years){
      int result = 0;
        // do math
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)){
            populationAmount = populationAmount + (growthRate/100) * 
                    populationAmount;
            count --;
        }
        if (populationAmount > 0){
            result = (int)populationAmount;
        }
        else{
            population = 0;
        }
        return result;
    }
    
    /**
     * 
     * @param other
     * @return 
     */
    public boolean equals(Species other){
        return ((this.name.equalsIgnoreCase(other.name)) && 
                (this.population == other.population) && 
                (this.growthRate == other.growthRate));
    }
    
    public void setSpecies(String name, int population, double growthRate){
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public String getName() {
        return name;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public int getPopulation() {
        return population;
    }
    /*
    *
    *@return
    */
    
    public boolean isPopulationLargerThan(Species other){
        return this.population > other.population;
    }
    
    public boolean isExtinct(){
        return population == 0;
    }
}
