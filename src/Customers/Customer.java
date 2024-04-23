package Customers;

public class Customer {

    private final String costumerName;
    private final String accountType;
    private int balance;

    public Customer(String costumerName, String accountType) {
        this.costumerName = costumerName;
        this.accountType = accountType;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //metodo para obtener daotos financieros del cliente
    public void getUserData() {
        System.out.println("\n--- DATOS FINANCIEROS DEL CLIENTE ---");
        System.out.println("\nNombre del cliente: " + costumerName);
        System.out.println("Tipo de cuenta: " + accountType);
        System.out.println("Saldo disponible: " + balance + "$");
    }

    //menu de opciones
    public void opcionMenu() {
        System.out.println("""
                \n--- MENU DE OPCIONES ---
                1 - Consultar saldo
                2 - Retirar un monto
                3 - Depositar un monto
                9 - Salir""");
    }

    //metod para descontar cantidad retirada del saldo actual
    public void balanceWithdrawal(int amount) {
        this.balance -= amount;
    }

    //metodo para añadir monto al saldo actual
    public void addedAmounht(int amount) {
        this.balance += amount;
    }
}
