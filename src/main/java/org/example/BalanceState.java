package org.example;

public class BalanceState implements ATMState {
    @Override
    public void registerIncome(Client client, double amount) {
        System.out.println("El cajero no puede realizar depósito de efectivo.");
    }

    @Override
    public void registerExpense(Client client, double amount) {
        System.out.println("El cajero no puede realizar egresos de efectivo.");
    }

    @Override
    public void getBalance(Client client) {
        System.out.println("Cliente: " + client.getName());
        System.out.println("Saldo: " + client.getBalance());
    }
}

