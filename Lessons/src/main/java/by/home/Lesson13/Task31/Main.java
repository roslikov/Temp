package by.home.Lesson13.Task31;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Имеется файл с текстом в котором присутсвуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.*/

public class Main {

    public static void main(String[] args) {
        File file = new File("Lessons/src/main/java/by/home/Lesson13/Task31/Task31.db");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String res = bufferedReader.readLine();

            while (res != null) {
                System.out.println(res);
                getNumbers(res);
                getSum(res);
                getPrintRemoveRepetitions(res);
                res = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error to read file!");
        }
    }

    private static void getNumbers(final String res) {
        System.out.print("\nВсе числа из файла: ");
        Arrays.asList(res
                .replaceAll("[^0-9]+", " ")
                .trim()
                .split(" "))
                .forEach(w -> System.out.print(w + " "));
    }

    private static void getSum(final String res) {
        System.out.print("\nСумма всех чисел: ");
        int[] arrayNumbers = Arrays.stream(res
                .replaceAll("[^0-9]+", " ")
                .trim()
                .split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = Arrays.stream(arrayNumbers).sum();
        System.out.print(sum);
    }

    private static void getPrintRemoveRepetitions(final String res) {
        System.out.print("\nМассив без повторяющися чисел: ");
        Set<Integer> set = new HashSet<>();
        Arrays.stream(res
                .replaceAll("[^0-9]+", " ")
                .trim()
                .split("\\s"))
                .mapToInt(Integer::parseInt)
                .forEach(set::add);
        System.out.print(set);
    }
}
