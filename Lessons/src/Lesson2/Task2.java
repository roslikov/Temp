package Lesson2;

public class Task2 {
        /*Перевести секунды в недели, сутки, часы, минуты, секунды.*/
    public static void main(String[] args) {
        int SecIn = 4018385;
        int sec = SecIn % 60;
        int m = (SecIn - sec) / 60;
        int min = m % 60;
        int h = (m - min) /  60;
        int hour = h % 60;
        int d = (h - hour) / 24;
        int day = d % 30;
        int week = (d - day) /7;
        System.out.println(week + " недель " + day + " дней " + hour +
                " часов " + min + " минут " + sec + " секунд.");
    }
}
