package Task23_ATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Balance{

    public int outBalance() throws FileNotFoundException {
        int outBalance = 0;
        Scanner balance = new Scanner(new File("balance.txt"));
        while (balance.hasNext()) {
            outBalance = balance.nextInt();
            balance.close();
        }
        return outBalance;
    }

    public void addBalance(int sum) throws FileNotFoundException {
        Balance balanceAdd = new Balance();
        int balance = balanceAdd.outBalance();
        balance += sum;
    }

    public void minusBalance(int sum) throws FileNotFoundException {
        Balance balanceAdd = new Balance();
        int balance = balanceAdd.outBalance();
        balance -= sum;
    }

}
