package Lesson6.Task23;

import java.io.IOException;
import java.util.Scanner;

/**
 * The type Run.
 */
public class Run {


    /**
     * Start application.
     * @param card the card
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    public static void startApplication(Card card) throws IOException, ClassNotFoundException {

        StorageOperation db = new Storage();
        db.createBalance(card);
        MoneyOperation money = new Service();
        Scanner scan = new Scanner(System.in);
        boolean atmSession = Main.isAtmSession();


        while (atmSession) {
            UI.menu();
            int operation = scan.nextInt();
            switch (operation) {
                case 0:
                    System.out.println("Выход из системы");
                    atmSession = false;
                    break;
                case 1:
                    System.out.printf("На вашем счету %s $\n", money.giveBalance(card));
                    db.read(card);
                    break;
                case 2:
                    System.out.println("Введите сумму:");
                    int addMoney = scan.nextInt();
                    money.addMoney(addMoney, card);
                    db.write(card);
                    System.out.printf("На вашем счету %s $\n", money.giveBalance(card));
                    break;
                case 3:
                    System.out.println("Введите сумму:");
                    int cash = scan.nextInt();
                    money.takeMoney(cash, card);
                    db.write(card);
                    System.out.printf("На вашем счету %s $\n", money.giveBalance(card));
                    break;
                default:
                    System.out.println("Такой операции не существует");
                    break;
            }
        }
    }

}

