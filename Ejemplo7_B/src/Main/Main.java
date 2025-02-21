
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ***** TABLA POR WHILE ***** ");
        System.out.print("    Ingrese un numero: ");
        int valor = teclado.nextInt();
        int i = 1;
        while(true){
            int mul = valor * i;
            System.out.println(" "+valor+" x "+i+" = "+mul);
            i++;
            
            if (i>10) {
                break;
            }
        }
        
    }
    
}
