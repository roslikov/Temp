package by.home.Lesson2;

public class Task3 {

    /* Создать число. Определить является ли последняя цифра числа семеркой. */

    public static void main(String[] args) {
        int XInt = 9747;                                        //Создание числа
        if (XInt % 10 == 7) {                                   //Проверка остатка от деления на 10 (последней цифры числа)
            System.out.println("Последняя цифра в числе 7");    //Вывод на экран если 7
        }
        else {
            System.out.println("Не 7!");                        //Вывод на экран если не 7
        }
    }
}
