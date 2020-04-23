package by.home.Lesson3;

public class Task10 {
    public static void main(String[] args) {

        /*Имеется целое число. Следует посчитать сумму цифр данного числа.*/

        int number = 102;
        int sum = 0;
        int ostat = 0;

        while (number != 0){
            ostat = number % 10;
            sum += (ostat);
            number /= 10;
            if (number != 0) {
                System.out.print(ostat + " + ");
            } else {
                System.out.print(ostat + " = " + sum);
            }
        }
    }
}
