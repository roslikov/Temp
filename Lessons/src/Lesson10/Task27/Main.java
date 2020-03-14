package Lesson10.Task27;

/*Создать коллекцию, наполнить ее случайными числами.
удалить повторяющиеся числа.*/

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = (ArrayList<Integer>) new Random()
                .ints(20,1,9)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomNumbers);

        ArrayList<Integer> nonRepetitionNumbers = (ArrayList<Integer>) randomNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nonRepetitionNumbers);
    }
}
