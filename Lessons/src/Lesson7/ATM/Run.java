package Lesson7.ATM;

import java.io.IOException;
import java.util.Scanner;

public class Run {

    public static void startApplication() throws IOException, ClassNotFoundException {

        Storage db = new Storage();
        Card card = new Card(5000, 5864);
        db.create(card);
        MoneyOperation money = new Service();
        Scanner scan = new Scanner(System.in);
        boolean atmSession = true;
        UI.menu();

        while (atmSession) {
            int operation = scan.nextInt();
            int balance = money.giveBalance(card);
            switch (operation) {
                case 0:
                    System.out.println("Выход из системы");
                    atmSession = false;
                    break;
                case 1:
                    System.out.printf("На вашем счету %s $\n", balance);
                    UI.menu();
                    break;
                case 2:
                    System.out.println("Введите сумму:");
                    int addMoney = scan.nextInt();
                    money.addMoney(addMoney, card);
                    System.out.printf("На вашем счету %s $\n", balance);
                    UI.menu();
                    break;
                case 3:
                    System.out.println("Введите сумму:");
                    int cash = scan.nextInt();
                    if (cash > card.getBalance()) {
                        System.out.println("У Вас недостаточно средств.");
                    } else {
                        money.takeMoney(cash, card);
                        System.out.println("Заберите деньги.");
                    }
                    System.out.printf("На вашем счету %s $\n", balance);
                    UI.menu();
                    break;
                default:
                    System.out.println("Такой операции не существует");
                    UI.menu();
                    break;
            }
        }
    }
}
