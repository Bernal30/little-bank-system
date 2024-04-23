package MainFiles;

import java.util.Scanner;

public class MainTestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eliga una opción del 1 al 7: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El día 1 es lunes!");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miercoles");
                break;
            case 4:
                System.out.println("El día 4 es jueves");
                break;
            case 5:
                System.out.println("El día 5 es viernes");
                break;
            case 6:
                System.out.println("El día 6 es sabado");
                break;
            case 7:
                System.out.println("El día 7 es domingo");
                break;
            default:
                System.out.println("El número no coincide con ninguna opción");
                break;
        }

        scanner.close();
    }
}
