package csci1011.countcontrolledloops;

/**
 *
 * @author Saviour
 */
public class CountControlledLoops {

    public static void main(String[] args) {
        System.out.println("Loops");
        int sum = 0;
        int maxCount = 50;
        // Count controlled loops
        for(int i = 0 ;i <= maxCount; i++){
            
            if (i%2==0){
                continue;
            }
            sum = sum + i;
            if (sum > 23){
                break;
            }
            System.out.println("Looping " + i);
        }
        System.out.println("Sum is : " + sum);
        
        //Count controlled with a while loop
        int whileSum = 0;
        int whileMaxCount = 10;
        int i = 0;
        while (i <= whileMaxCount){
            whileSum = whileSum + 1;
                    System.out.println("Looping: " + 1);
                    i++;
        }
    }
}
