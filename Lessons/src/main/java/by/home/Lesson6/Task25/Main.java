package by.home.Lesson6.Task25;

public class Main {

    public static void main(String[] args) {
        Visa visaAlex = new Visa("Alex", 345);
        Mastercard cardOne = new Mastercard("One", 555, 0.1f);
        Electron electronVika = new Electron("Vika", 100);
        System.out.println(bonusToCard(visaAlex));
        System.out.println(bonusToCard(cardOne));
        System.out.println(electronVika);
    }

    public static <T extends Card> T bonusToCard(Card card){
        int bonus = 500;
        card.setBalance(card.getBalance() + bonus);
        return (T) card;
    }
}
