package csci1011.rectangledemo;

/**
 *
 * @author Saviour Bassey
 */
public class RectangleDemo {

    public static void main(String[] args) {
        System.out.println("Rectangle Demo");
        Rectangle box = new Rectangle();
        box.setDimensions(10, 5);
        System.out.println("The area of the rectangle is: " + box.getArea());
    }
}
