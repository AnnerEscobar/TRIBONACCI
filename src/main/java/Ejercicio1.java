
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Anner
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       int cantidad;
       int a = 0;
       int b = 0;
       int c = 1;
       int d;
       
        System.out.println("INGRESE EL TAMA;O DE LA SUSECION");
        cantidad = teclado.nextInt();
        
        System.out.println("***********************************");
       for(int i =0; i<cantidad; i++){
           System.out.println(a +" ");
           d = a + b + c;
           a = b;
           b = c;
           c = d;
       }
        System.out.println("*************************************");
        
    }
    
}
