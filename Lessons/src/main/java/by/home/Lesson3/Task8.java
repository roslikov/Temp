package by.home.Lesson3;

public class Task8 {

    /*Посчитать факториал числа X*/

    public static void main(String[] args) {

        int number = 11;
        int sum = 1;
        int i = 1;

        if (number >= 17 || number <= 0) {
                //Больше 16 - нужно использовать тип Long
            System.out.println("Введите целое положительное число X до 16 включительно.");
        } else {
                //Умножаем цифры в цикле while
            while (i <= number) {
                sum *= i;
                i++;
            }
            System.out.println("Факториал числа " + number + " = " + sum);
        }

    }

}
