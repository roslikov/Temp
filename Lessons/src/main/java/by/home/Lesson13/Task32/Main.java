package by.home.Lesson13.Task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.*/

public class Main {

    final static String file = "Task32.db";
    final static int sizeArray = 20;

    public static void main(String[] args) {
        writeFile();
        System.out.println(readFile());
        System.out.println(average(readFile()));
    }

    private static void writeFile() {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (int i = 0; i <= sizeArray; i++) {
                out.writeInt((int) (Math.random() * 100 + 1));
            }
        } catch (IOException e) {
            System.out.println("Error to read file!");
        }
    }

    private static List<Integer> readFile() {
        List<Integer> numbers = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int result = in.readInt();
            while (in.available() > 0) {
                numbers.add(result);
                result = in.readInt();
            }
        } catch (IOException e) {
            System.out.println("Error to read file!");
        }
        return numbers;
    }

    public static Double average(List<Integer> list) {
        return list.stream().
                mapToDouble(e -> e).
                filter(Objects::nonNull).
                average().
                orElse(Double.NaN);
    }
}
