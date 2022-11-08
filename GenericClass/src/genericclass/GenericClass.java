/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericclass;

/**
 *
 * @author ASUS
 * @param <T>
 */
public class GenericClass<T> {
    
    /**
     * @param args the command line arguments
     */
    
    private T data1;
    
    public void set(T data1) {
        this.data1 = data1;
    }
    public T get(){
        return data1;
    }
    
    public static void main(String[] args) {
        GenericClass<Integer> numbers = new GenericClass<>();
        GenericClass<Integer> grades = new GenericClass<>();
        
        numbers.set(4);
        grades.set(90);
        System.out.println(numbers.get());
        System.out.println(grades.get());
    } 
}
