package by.home.Lesson10.Task26;

/*Создать список оценок учеников с помощью ArrayList, заполнить
случайными оценками. Удалить неудовлетворительные оценки из списка.*/

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> grades = (ArrayList<Integer>) new Random()
                .ints(16,1,11)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(grades);

        ArrayList<Integer> goodGrades = (ArrayList<Integer>) grades.stream()
                .filter(s -> s >= 4)
                .collect(Collectors.toList());
        System.out.println(goodGrades);
    }
}
