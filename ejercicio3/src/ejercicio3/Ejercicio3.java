/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio3 {
 
    /**
     * @param args the command line arguments
     */
    //a base / b exponente
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String base;
        base = scan.nextLine();
        double based = Double.parseDouble(base);
       double radio = Math.pow(based , 2);
       double rana = Math.PI *radio;
       System.out.println(rana);
    }
    
}
