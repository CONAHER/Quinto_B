
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vector [] = {"elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento","elemento"};
        Mostrar(vector);
        System.out.println("\nIngrese indice: ");
        int dato = teclado.nextInt();
        Calculo(dato);
    }
    
    public static void Mostrar(String vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i+". "+vector[i]);
        }
    }
    
    public static void Calculo(int posicion){
        int valor = (posicion+1)*50;
        System.out.println("El valor del elemento elegido es: "+valor);
    }
}
