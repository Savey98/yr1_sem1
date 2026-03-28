package csci1011.nestedloops;

/**
 *
 * @author Saviour
 */
public class NestedLoops {

    public static void main(String[] args) {
        System.out.println("Nested Loops");

        for (int i = 0; i < 5; i++) {
            System.out.println("outer loop iteration " + i);
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                

                    System.out.println("Inner loop iteration: " + j);
                    break;

                }
            }
        }
    }
