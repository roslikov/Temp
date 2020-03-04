package Lesson7.ATM;

import java.io.Serializable;

public class Card extends Account implements Serializable {

    int pin;

    public Card(int balance, int pin) {
        super(balance);
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

}
