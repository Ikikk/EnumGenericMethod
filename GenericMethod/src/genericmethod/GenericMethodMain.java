/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GenericMethod;

/**
 *
 * @author ASUS
 */
public class GenericMethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericMethod tes = new GenericMethod();
        
        tes.<String>genericsMethod("Math");
        tes.<Integer>genericsMethod(95);
    }
    
}
