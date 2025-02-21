
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese dato entero de 1 a 12: ");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3: 
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5: 
                System.out.println("El mes es mayo");
                break;
            case 6: 
                System.out.println("El mes es junio");
                break;
            case 7: 
                System.out.println("El mes es julio");
                break;
            case 8: 
                System.out.println("El mes es agosto");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11: 
                System.out.println("Nov");
                break;
            case 12: 
                System.out.println("Dic");
                break;
            default: 
                System.out.println("No existe el mes");
                break;
        }
    }
    
}
