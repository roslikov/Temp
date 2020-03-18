package Lesson6.Task23;

/**
 * The type Service.
 */
public class Service implements MoneyOperation {

    /**
     * Add money to card
     * @param addMoney
     * @param card
     */
    @Override
    public void addMoney(int addMoney, Card card) {
        card.setBalance(card.getBalance() + addMoney);
        System.out.println("Операция прошла успешно");
    }

    /**
     * Return balance card
     * @param card
     * @return
     */
    @Override
    public int giveBalance(Card card) {
        return card.getBalance();
    }

    /**
     * Take money for card
     * @param takeCash
     * @param card
     */
    @Override
    public void takeMoney(int takeCash, Card card) {
        if (takeCash > card.getBalance()) {
            System.out.println("Запрашиваемая сумма больше баланса!");
        } else if (takeCash % 20 == 0 || takeCash % 50 == 0) {
            card.setBalance(card.getBalance() - takeCash);
            System.out.println("Заберите деньги.");
        } else if (takeCash % 100 == 0) {
            card.setBalance(card.getBalance() - takeCash);
            System.out.println("Заберите деньги.");
        } else if (takeCash % 100 != 0 && takeCash % 100 > 50) {
            if ((takeCash % 100) % 20 == 0) {
                card.setBalance(card.getBalance() - takeCash);
                System.out.println("Заберите деньги.");
            } else if (takeCash % 100 != 0 && takeCash % 100 > 50 && takeCash > 50) {
                if ((takeCash - 50) % 20 == 0) {
                    card.setBalance(card.getBalance() - takeCash);
                    System.out.println("Заберите деньги.");
                } else {
                    System.out.println("Введите сумму кратную 20, 50, 100");
                }
            } else {
                System.out.println("Введите сумму кратную 20, 50, 100");
            }
        } else if (takeCash % 100 != 0 && takeCash % 100 < 50 && takeCash > 50) {
            if ((takeCash - 50) % 20 == 0) {
                card.setBalance(card.getBalance() - takeCash);
                System.out.println("Заберите деньги.");
            } else {
                System.out.println("Введите сумму кратную 20, 50, 100");
            }
        } else {
            System.out.println("Введите сумму кратную 20, 50, 100");
        }

    }

}
