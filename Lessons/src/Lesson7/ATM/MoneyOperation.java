package Lesson7.ATM;

/**
 *
 */
public interface MoneyOperation {

    void addMoney(int addMoney, Card card);
    int giveBalance (Card card);
    void takeMoney(int takeCash, Card card);

}
