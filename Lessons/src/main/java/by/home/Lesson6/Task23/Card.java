package by.home.Lesson6.Task23;

import java.io.Serializable;

/**
 * The type Card.
 */
public class Card implements Serializable {

    private int pin;
    private int balance;

    /**
     * Sets pin.
     * @param pin the pin
     */
    public void setPin(final int pin) {
        this.pin = pin;
    }

    /**
     * Gets pin.
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * Gets balance.
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     * @param balance the balance
     */
    public void setBalance(final int balance) {
        this.balance = balance;
    }

    /**
     * Instantiates a new Card.
     * @param balance the balance
     * @param pin     the pin
     */
    public Card(final int balance, final int pin) {
        this.balance = balance;
        this.pin = pin;
    }

}
