package org.example;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Client client = new Client("Diego Rueda", 1000);
//        Client client2 = new Client("Pepito Perez", 600);

        atm.getBalance(client);

        atm.registerIncome(client, 500);
        atm.getBalance(client);

        atm.registerExpense(client, 200);
        atm.getBalance(client);

        atm.setState(new BalanceState());
        atm.registerIncome(client, 200);
        atm.getBalance(client);

        atm.setState(new BalanceState());
        atm.registerExpense(client, 200);
        atm.getBalance(client);

        atm.setState(new SuspendedState());
        atm.registerIncome(client, 100);

        atm.setState(new SuspendedState());
        atm.registerExpense(client, 100);

        atm.setState(new SuspendedState());
        atm.getBalance(client);
    }
}
