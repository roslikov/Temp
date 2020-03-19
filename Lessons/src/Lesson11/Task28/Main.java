package Lesson11.Task28;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
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