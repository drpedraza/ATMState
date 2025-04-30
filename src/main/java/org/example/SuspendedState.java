package org.example;

public class SuspendedState implements ATMState {
    @Override
    public void registerIncome(Client client, double amount) {
        System.out.println("Cajero inactivo.");
    }

    @Override
    public void registerExpense(Client client, double amount) {
        System.out.println("Cajero inactivo.");
    }

    @Override
    public void getBalance(Client client) {
        System.out.println("Cajero inactivo.");
    }
}

