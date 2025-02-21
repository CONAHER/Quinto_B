
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite: ");
        int limite = teclado.nextInt(); //20
        int i = 1;
        do{
            System.out.println("Hola Usuario "+i);
            i++;
        }while(i<=limite);
        // i = 21
        System.out.println("\n\n impresion while");
        int k = 1;
        while(k<=limite){
            System.out.println("Hola Usuario "+i);
            i++;
            k++;
        }        
    }    
}
