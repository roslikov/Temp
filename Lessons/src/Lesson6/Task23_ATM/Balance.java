package Lesson6.Task23_ATM;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * The type Balance.
 */
public class Balance{

    /**
     * The Path balances file .
     */
    String pathFile = "/home/alex/IdeaProjects/Lessons_HTP/Lessons/src/Lesson6/Task23_ATM/balance.txt";

    /**
     * Out balance int.
     *
     * @return the int
     * @throws IOException the io exception
     */
    public int outBalance() throws IOException {
        List<String> balance =
                Files.readAllLines(Paths.get(pathFile), Charset.defaultCharset());
        return Integer.parseInt(balance.get(0));
    }

    /**
     * Add balance.
     *
     * @param sum the sum
     * @throws IOException the io exception
     */
    public void addBalance(int sum) throws IOException {
        Balance balanceAdd = new Balance();
        int balance = balanceAdd.outBalance() + sum;
        String text = Integer.toString(balance);
        PrintWriter addBalanceToFile = new PrintWriter(pathFile);
        addBalanceToFile.print(text);
        addBalanceToFile.close();
    }

    /**
     * Minus balance.
     *
     * @param sum the sum
     * @throws IOException the io exception
     */
    public void minusBalance(int sum) throws IOException {
        Balance minusBalance = new Balance();
        int balance = minusBalance.outBalance() - sum;
        String text = Integer.toString(balance);
        PrintWriter addBalanceToFile = new PrintWriter(pathFile);
        addBalanceToFile.print(text);
        addBalanceToFile.close();
    }

}
