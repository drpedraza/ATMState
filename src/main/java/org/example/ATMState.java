package org.example;

public interface ATMState {
    void registerIncome(Client client, double amount);
    void registerExpense(Client client, double amount);
    void getBalance(Client client);
}

