package csci1010.testequalsarray;

/**
 *
 * @author Saviour Bassey
 */
public class TestEqualsArray {

    public static void main(String[] args) {
        System.out.println("Test Equals Array");
        int[] a = new int[3];
        int[] b = new int[3];
        setArray(a);
        setArray(b);
        
        //Test changing an element for the equals method
        b[2] = 20;
        a = b;
        
        System.out.println("First array");
        displayContents(a);
        System.out.println("Second array");
        displayContents(b);
        
        //Test for equality
        System.out.println();
        if (b == a){
            System.out.println("Equal by ==");
        }
        else{
            System.out.println("Not equal by ==");
        }
        if (equals(a,b)){
            System.out.println("Equal by the equals method");
        }
        else{
            System.out.println("Not equal by the equals mehod");
        }
    }
    
    public static void setArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
    }
    
    public static void displayContents(int[] array){
        for (int i =0; i < array.length; i++){
            System.out.println("In the value at index " + i + " is:" + array[i]);
        }
    }
    
    public static boolean equals(int[] a, int[] b){
        boolean elementsMatch = true;
        if (a.length != b.length){
            elementsMatch = false;
        }
        else{
            int i = 0;
            while (elementsMatch && (i < a.length)){
                //if (a[i] == b[i])
            }
        }
    }
}
