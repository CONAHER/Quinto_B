
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ***** TABLA POR FOR ***** ");
        System.out.print("    Ingrese un numero: ");
        int valor = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = valor * i;
            System.out.println(" "+valor+" x "+i+" = "+mul);
            if (i >= 5) {
                break;
            }
        }
        
    }
    
}
