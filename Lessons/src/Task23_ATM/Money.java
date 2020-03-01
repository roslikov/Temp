package Task23_ATM;

import java.util.Scanner;

public class Money {

    private int banknotes100, banknotes50, banknotes20;
    private boolean possible;
    private boolean work = true;
    Scanner scan = new Scanner(System.in);


    public Money(int banknotes100, int banknotes50, int banknotes20) {
        this.banknotes100 = banknotes100;
        this.banknotes50 = banknotes50;
        this.banknotes20 = banknotes20;
    }


    public boolean isWork() {
        return this.work;
    }


    public void setWork(boolean work) {
        this.work = work;
    }


    public void cashIn(int banknotes100, int banknotes50, int banknotes20) {
        this.banknotes100 += banknotes100;
        this.banknotes50 += banknotes50;
        this.banknotes20 += banknotes20;
    }


    public boolean cashOut(int sum) {
        int outBankn100, outBankn50, outBankn20;
        outBankn20 = outBankn50 = outBankn100 = 0;
        long sumCashIn = banknotes20 * 20 + banknotes50 * 50 + banknotes100 * 100;
        if (sum <= sumCashIn) {
            if ((sum / 100) <= banknotes100) {
                outBankn100 = sum / 100;
            } else {
                outBankn100 = banknotes100;
            }
            sum -= (outBankn100 * 100);
            if (sum > 0) {
                if ((sum / 50) <= banknotes50) {
                    outBankn50 = sum / 50;
                } else {
                    outBankn50 = banknotes50;
                }
            }
            sum -= (outBankn50 * 50);
            if (sum > 0) {
                if ((sum / 20) <= banknotes20) {
                    outBankn20 = sum / 20;
                } else {
                    outBankn20 = 0;
                }
            }
            sum -= (outBankn20 * 20);
            if (sum == 0) {
                possible = true;
                System.out.printf("Выдано купюр: номиналом 100 руб. %s, номиналом 50 руб. %s, номиналом 20 руб. %s ",
                        outBankn100, outBankn50, outBankn20);
                System.out.println();
            } else {
                System.out.println("Введите сумму кратную 100, 50 или 20 руб.");
            }
        } else {
            System.out.println("Нет возможности выдать запрашиваемую сумму.");
        }
        banknotes100 -= outBankn100;
        banknotes50 -= outBankn50;
        banknotes20 -= outBankn20;
        return possible;
    }


}