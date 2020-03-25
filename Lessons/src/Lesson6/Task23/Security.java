package Lesson6.Task23;

import java.io.IOException;
import java.util.Scanner;

/**
 * Check PIN code your card
 */
public class Security {
    /**
     * Check pin.
     * @param card the card
     */
    public static void checkPin(Card card) {
        Scanner scan = new Scanner(System.in);
        int outCheckPin = 3;

            for (int i = 0; 3 > i; i++){
                System.out.println("У вас " + outCheckPin + " попытки");
                System.out.println("Введите PIN: ");
                int pin = scan.nextInt();
                if (card.getPin() == pin){
                    Main.setAtmSession(true);
                    break;
                } else {
                    outCheckPin -= 1;
                    System.out.println("Неправильный PIN!");
                }
                if (outCheckPin == 0){
                    System.out.println("Ваша карта заблокирована!");
                    Main.setAtmSession(false);
                }
            }

        }
    }
