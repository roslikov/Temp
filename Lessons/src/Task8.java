public class Task8 {

    /*Посчитать факториал числа X*/

    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        int x = 11;
        if (x >= 17 || x <= 0) {
            System.out.println("Введите целое положительное число X до 16 включительно.");
        } else {
            while (i <= x) {
                sum *= i;
                i++;
            }
            System.out.println("Факториал числа " + x + " = " + sum);
        }

    }

}
