package Lesson7.ATM;

import java.io.IOException;

public class Service implements MoneyOperation{

    @Override
    public void addMoney(int addMoney, Card card) throws IOException, ClassNotFoundException {

        System.out.println("Операция прошла успешно");

    }

    @Override
    public int giveBalance(Card card) throws IOException, ClassNotFoundException {

        return card.getBalance();
    }

    @Override
    public void takeMoney(int takeCash, Card card) throws IOException {

    }

}
