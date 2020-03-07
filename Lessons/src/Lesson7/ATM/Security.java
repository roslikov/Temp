package Lesson7.ATM;

import java.io.IOException;
import java.util.Scanner;

/**
 * Check PIN code your card
 */
public class Security {
    public static void checkPin(Card card) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        int outCheckPin = 3;

            for (int i = 0; 3 > i; i++){
                System.out.println("У вас " + outCheckPin + " попытки");
                System.out.println("Введите PIN: ");
                int pin = scan.nextInt();
                if (card.getPin() == pin){
                    Run.startApplication(card);
                    break;
                } else {
                    outCheckPin -= 1;
                    System.out.println("Неправильный PIN!");
                }
                if (outCheckPin == 0){
                    System.out.println("Ваша карта заблокирована!");
                }
            }

        }
    }
