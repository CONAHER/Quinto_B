
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/*/ PROGRAMA VECTOR /*/*/*/*/*/");
        int [] vector = new int [15];
         
        for (int i = 0; i < vector.length; i++) { // for de llenado
            System.out.print(">. Ingrese dato vector["+i+"] = ");
            int dato = teclado.nextInt();
            vector[i] = dato;
        }
        
        System.out.println("\n Impresion del Vector");
        for (int i = 0; i < vector.length; i++) { // for de impresion
            System.out.println("   Numero "+(i+1)+" = "+vector[i]);
            // Numero 1 = xx
           // numero 2 = xx
        }
    }
    
}
