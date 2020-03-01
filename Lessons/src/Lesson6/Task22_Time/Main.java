package Lesson6.Task22_Time;

public class Main {
    public static void main(String[] args) {

        TimeInterval timeFirst = new TimeInterval(7000);
        TimeInterval timeSecond = new TimeInterval(4, 5, 6);
        System.out.println(timeSecond.returnSecond());
        TimeInterval.Time.Comparison(timeFirst, timeSecond);
        System.out.println(timeSecond.toString());
    }
}
