package Lesson6.Task23;

/**
 * The interface Money operation.
 */
public interface MoneyOperation {

    /**
     * Add money.
     * @param addMoney the add money
     * @param card     the card
     */
    void addMoney(int addMoney, Card card);

    /**
     * Give balance int.
     * @param card the card
     * @return the int
     */
    int giveBalance (Card card);

    /**
     * Take money.
     * @param takeCash the take cash
     * @param card     the card
     */
    void takeMoney(int takeCash, Card card);

}
