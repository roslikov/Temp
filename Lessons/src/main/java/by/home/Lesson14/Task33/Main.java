package by.home.Lesson14.Task33;

import java.io.File;

/*Вывести список файлов и каталогов выбранного каталога на диске. Файлы
и каталоги должны быть распечатаны отдельно.*/

public class Main {

    final static String selectCatalog = "C:\\Total Commander";

    public static void main(String[] args) {
        printListCatalogs(selectCatalog);
        printListFiles(selectCatalog);
    }

    public static void printListCatalogs(String path) {
        File[] listFiles = new File(path).listFiles();
        System.out.println("\nКаталоги находящиеся по пути: " + path);
        assert listFiles != null;
        for (File file : listFiles) {
            if (file.isDirectory()) {
                System.out.print("[" + file.getName() + "] ");
            }
        }
    }

    public static void printListFiles(String path) {
        File[] listFiles = new File(path).listFiles();
        System.out.println("\nФайлы находящиеся в каталоге: " + path);
        assert listFiles != null;
        for (File file : listFiles) {
            if (file.isFile()) {
                System.out.print("[" + file.getName() + "] ");
            }
        }
    }
}
