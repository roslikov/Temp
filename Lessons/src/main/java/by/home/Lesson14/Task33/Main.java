package by.home.Lesson14.Task33;

import java.io.File;
import java.util.Objects;

/*Вывести список файлов и каталогов выбранного каталога на диске. Файлы
и каталоги должны быть распечатаны отдельно.*/

public class Main {

    final static String selectCatalog = "C:\\TEST";

    public static void main(String[] args) {
        System.out.println("\nКаталоги находящиеся по пути: " + selectCatalog);
        printListCatalogs(selectCatalog);
        System.out.println("\nФайлы находящиеся по пути: " + selectCatalog);
        printListFiles(selectCatalog);
    }

    public static void printListCatalogs(String path) {
        File[] listFiles = new File(path).listFiles();
        assert listFiles != null;

        for (File fileTemp : listFiles) {
            if (fileTemp.isDirectory()) {
                System.out.println("[" + fileTemp.getAbsolutePath() + "] ");
                printListCatalogs(String.valueOf(fileTemp));
            }
        }
    }

    public static void printListFiles(String path) {
        File[] listFiles = new File(path).listFiles();
        assert listFiles != null;

        for (File file : listFiles) {
            if (file.isFile()) {
                System.out.print("[" + file.getName() + "] ");
            }
        }

        for (File fileDirectory : listFiles) {
            if (fileDirectory.isDirectory()){
                System.out.println("\nФайлы находящиеся в подкаталоге: " + fileDirectory.getAbsolutePath());
                printListFiles(fileDirectory.getAbsolutePath());
            }
        }
    }
}
