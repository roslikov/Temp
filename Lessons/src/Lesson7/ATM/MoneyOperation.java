package Lesson7.ATM;

import java.io.IOException;

public interface MoneyOperation {

    void addMoney(int addMoney, Card card) throws IOException, ClassNotFoundException;
    int giveBalance (Card card) throws IOException, ClassNotFoundException;
    void takeMoney(int takeCash, Card card) throws IOException;

}
