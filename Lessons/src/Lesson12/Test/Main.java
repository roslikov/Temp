package Lesson12.Test;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Ошибка!");
        } catch (Exception e){
            //e.printStackTrace(); //Так не делать!!!
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
        //throw new RuntimeException("Hello");
    }
}
