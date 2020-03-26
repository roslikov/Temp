package Lesson12.Test2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            System.out.println(number);
        }
        numbers.forEach(System.out::print);
    }
}
