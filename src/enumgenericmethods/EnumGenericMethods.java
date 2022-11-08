/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgenericmethods;

/**
 *
 * @author ASUS
 */
public class EnumGenericMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnumShapes myShape = EnumShapes.ROUND;
        
        switch(myShape) {
            case RECTANGLE -> System.out.println("The shape is Rectangle");
            case ROUND -> System.out.println("The shape is Round");
            case TRIANGLE -> System.out.println("The shape is Triangle");
            case POLYGON -> System.out.println("The shape is Polygon");
        }
    }
}
