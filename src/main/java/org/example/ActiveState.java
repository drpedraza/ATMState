package org.example;

public class ActiveState implements ATMState {
    @Override
    public void registerIncome(Client client, double amount) {
        client.deposit(amount);
        System.out.println("Ingreso registrado.");
    }

    @Override
    public void registerExpense(Client client, double amount) {
        if (client.withdraw(amount)) {
            System.out.println("Egreso registrado.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    @Override
    public void getBalance(Client client) {
        System.out.println("Cliente: " + client.getName());
        System.out.println("Saldo: " + client.getBalance());
    }
}

