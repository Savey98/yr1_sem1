
package csci1011.rectangledemo;

/**
 *
 * @author Saviour Bassey
 */
public class Rectangle {
    private int length;
    private int width;
    private int area;
    
    public void setDimensions(int length, int width){
        //set the dimensions of the rectangle
        this.length = length;
        this.width = width;
        area = this.width * this.length;
    }
    
    public int getArea(){
        return area;
    }
    
}
