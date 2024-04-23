package MainFiles;

import Customers.FisicalPerson;
import Customers.MoralPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //persona fisica
        FisicalPerson costumer1 = new FisicalPerson("Frank", "corriente");
        costumer1.setBalance(3400);
        costumer1.getUserData();

        //persona moral
        MoralPerson costumer2 = new MoralPerson("Bimbo", "corriente");
        costumer2.setBalance(500000);

        //se inicializa la opción del cliente para que simpre arranque el ciclo while
        int userOpcion = 0;

        while (userOpcion != 9) {
            //inicia el programa con el menu de opciones
            costumer1.opcionMenu();
            //se captura la opción del cliente en bluce hasta que la opción sea igual a 9
            System.out.print("Buen día " + costumer1.getCostumerName() + ", que acción quiere realizar: ");
            userOpcion = scanner.nextInt();

            //logica del programa bancario
            switch (userOpcion) {
                case 1:
                    System.out.println("\nSaldo disponible: " + costumer1.getBalance() + "$");
                    break;
                case 2:
                    //obtenemos la cantidad a retirar
                    System.out.print("\nCantidad a retirar: ");
                    int discountValue = scanner.nextInt();
                    //verificar si se puede descontar la cantidad ingresada
                    if (discountValue > costumer1.getBalance()) {
                        System.out.println("Saldo insuficiente, su saldo es de: " + costumer1.getBalance() + "$");
                    } else {
                        costumer1.balanceWithdrawal(discountValue);
                        System.out.println("Operación existosa. Su saldo actual es: " + costumer1.getBalance() + "$");
                    }
                    break;
                case 3:
                    //obtenemos la cantidad depositar
                    System.out.print("\nCantidad a depositar: ");
                    int valuetoAdd = scanner.nextInt();
                    //se añade la cantidad al saldo actual
                    costumer1.addedAmounht(valuetoAdd);
                    System.out.println("Operación exitosa. Su saldo actual es : " + costumer1.getBalance() + "$");
                    break;
                case 9:
                    System.out.println("\nGracias por usar nuestros servicios, saliendo del programa...");
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna opción");
                    break;
            }
        }


        scanner.close();
    }
}
