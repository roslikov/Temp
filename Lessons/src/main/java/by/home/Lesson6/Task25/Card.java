package by.home.Lesson6.Task25;

public abstract class Card {
    private String name;
    private int balance;

    public Card(final String name, final int balance) {
        this.name = name;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
