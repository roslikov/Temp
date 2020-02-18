public class Task8 {
    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        int x = 10;
        while (i <= x) {
            sum *= i;
            i++;
        }
        System.out.println("Факториал числа " + x + " = " + sum);
    }

}
