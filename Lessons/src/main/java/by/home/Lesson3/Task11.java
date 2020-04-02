package by.home.Lesson3;

public class Task11 {
    public static void main(String[] args) {

        /*Имеется целое число, определить является ли это число простым,
        т.е. делится без остатка только на 1 и себя. */

        int number = 0;
        boolean isComposite = false;

        if (number < 1) {
            System.out.println("Введите число больше 1");
        } else {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println(number + " - СОСТАВНОЕ число");
            } else {
                System.out.println(number + " - простое число");
            }
        }
    }
}
