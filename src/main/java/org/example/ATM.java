package org.example;

public class ATM {
    private ATMState state;

    public ATM() {
        this.state = new ActiveState();
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void registerIncome(Client client, double amount) {
        state.registerIncome(client, amount);
    }

    public void registerExpense(Client client, double amount) {
        state.registerExpense(client, amount);
    }

    public void getBalance(Client client) {
        state.getBalance(client);
    }
}

