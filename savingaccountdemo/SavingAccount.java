package csci1011.savingaccountdemo;

//import java.util.Scanner
/**
 *- sign is private while + sign is public
 * @author Saviour Bassey
 */
public class SavingAccount {
    
    //There's three kinds of variables
    //Local, Static and Instance
    private double balance;
    private static double interestRate = 0;
    private static int numberOfAccounts = 0;
    
    /*
    *What kind of method is this? - Constructor
    *Note that is method is not static
    *A new balance variable will be created for the new account
    *numberOfAccounts belongs to the class and is shared by all the members
    */
    public SavingAccount(){
        balance = 0;
        numberOfAccounts++;
    }
    
    /*
    //Attempting to duplicate the variable numberOfAccounts
    *public void setNumAccounts(int numberOfAccounts 
    *this.numberofAccounts = this.numberOfAccounts + numberOfAccounts;
    */
    
    //
    //
    public double getBalance(){
        return balance;
    }
    
    //
    //
    public void deposit(double amount){
        
    }
    /*
    //
    //
    
    
    */
    
    //
    //
    public double withdraw(){
        return balance;
    }
    
}
