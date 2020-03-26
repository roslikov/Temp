package Lesson12.Test1;

public class Main {

    public static void main(String[] args) {
        try {
            throw new CatException("");
        } catch (CatExtraException e) {
            System.out.println("catch1");
        } catch (Exception e) {
            System.out.println("catch2");
        } finally {
            System.out.println("finally");
        }
        throw new CatException("Wrong cat!");
    }
}
