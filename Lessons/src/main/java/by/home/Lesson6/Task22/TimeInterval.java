package by.home.Lesson6.Task22;

public class TimeInterval {

    private int second;
    private int minute;
    private int hour;

    public TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeInterval(int second) {
        this.second = second;
    }

    public int returnSecond(){
        return hour * 3600 + minute * 60 + second;
    }

    public static class Time {
        public static void Comparison(TimeInterval timeFirst, TimeInterval timeSecond) {
            if (timeFirst.returnSecond() == timeSecond.returnSecond()){
                System.out.println("Промежутки времени одинаковы");
            }
            if (timeFirst.returnSecond() >= timeSecond.returnSecond()) {
                System.out.println("Первый проежуток времени больше вторго");
            } else {
                System.out.println("Второй промежуток времени больше первого");
            }
        }
    }



    @Override
    public String toString() {
        return "TimeInterval{" +
                "second=" + returnSecond() +
                '}';
    }
}
