package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite: ");
        int limite = teclado.nextInt(); //20
        int i = 1;
        
        while(true){
            System.out.println("Hola Usuario "+i);
            i++;
            if (i>limite) {
                break;
            }
        }
    }

}
