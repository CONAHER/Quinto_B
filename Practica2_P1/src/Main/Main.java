package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese opcion: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese un limite: ");
                int limite = teclado.nextInt();
                int sum = 0;
                for (int i = 1; i <= limite; i++) {
                    sum = sum + i;
                }
                System.out.println("Suma total: " + sum);
                break;
            case 2:
                System.out.print("Ingrese un limite: ");
                int limi = teclado.nextInt();
                int mul = 1;
                int i = 1;
                while (i <= limi) {
                    mul = mul * i;
                    i += 1;
                }
                System.out.println("Multi total: " + mul);
                break;
            case 3:
                System.out.print("Ingrese un limite: ");
                int l = teclado.nextInt();
                int j = 1;
                int m = 1;
                while (true) {
                    m = m *j;
                    j+=1;
                    if (j> l) {
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opcion no existe");
                break;
        }
    }

}
