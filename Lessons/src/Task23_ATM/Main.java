package Task23_ATM;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        Money atm = new Money(50, 100, 150);
        Interface menu = new Interface();
        Balance balance = new Balance();



        while (atm.isWork()) {
            menu.menu();
            int choise = scan.nextInt();
            if (choise == 0) {
                System.out.println("Выход из системы");
                atm.setWork(false);
            } else if (choise == 1) {
                System.out.printf("На вашем счету %s руб.", balance.outBalance());
                System.out.println();
            } else if (choise == 2) {
                System.out.println("Введите сумму:");
                int money = scan.nextInt();
                balance.addBalance(money);
                System.out.println("Операция прошла успешно");
            } else if (choise == 3) {
                System.out.println("Введите сумму:");
                int cash = scan.nextInt();
                if (cash > balance.outBalance()) {
                    System.out.println("У Вас недостаточно средств.");
                } else if (atm.cashOut(cash)) {
                    balance.minusBalance(cash);
                    System.out.println("Заберите деньги.");
                }
            }
        }
    }
}
