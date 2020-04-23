package by.home.Lesson10;

/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.Collectors;

public class Task28 {
    public static int max = 0;
    public static void main(String[] args) {

        ArrayList<Integer> studentGrades = (ArrayList<Integer>) new Random()
                .ints(10, 1, 11)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(studentGrades);

        int maxGrade = 0;
        ListIterator iterator = studentGrades.listIterator();
        while (iterator.hasNext()) {
            if (maxGrade < (int) iterator.next()){
                maxGrade = (int) iterator.previous();
            }
        }
        System.out.println(maxGrade);
    }
}