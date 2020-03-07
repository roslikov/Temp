package Lesson7.ATM;

import java.io.Serializable;

public class Card implements Serializable {

    private int pin;
    private int balance;


    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Card(final int balance, final int pin) {
        this.balance = balance;
        this.pin = pin;
    }

}
