
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ***** TABLA POR WHILE ***** ");
        System.out.print("    Ingrese un numero: ");
        int valor = teclado.nextInt();
        int i = 1;
        while(i<=10){
            int mul = valor * i;
            System.out.println(" "+valor+" x "+i+" = "+mul);
            i+=1;
        }
        
    }
    
}
