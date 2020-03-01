package Lesson6.Task23_ATM;


public class Money {

    private int banknotes100, banknotes50, banknotes20;
    private boolean possible;
    private boolean work = true;

    /**
     * Instantiates a new Money.
     *
     * @param banknotes100 the banknotes 100
     * @param banknotes50  the banknotes 50
     * @param banknotes20  the banknotes 20
     */
    public Money(int banknotes100, int banknotes50, int banknotes20) {
        this.banknotes100 = banknotes100;
        this.banknotes50 = banknotes50;
        this.banknotes20 = banknotes20;
    }


    /**
     * Is work boolean.
     *
     * @return the boolean
     */
    public boolean isWork() {
        return this.work;
    }


    /**
     * Sets work ATM.
     *
     * @param work the work
     */
    public void setWork(boolean work) {
        this.work = work;
    }


    /**
     * Cash out boolean.
     *
     * @param sum the sum
     * @return the boolean
     */
    public boolean cashOut(int sum) {
        int outBankn100, outBankn50, outBankn20;
        outBankn20 = outBankn50 = outBankn100 = 0;
        long sumCashIn = banknotes20 * 20 + banknotes50 * 50 + banknotes100 * 100;
        if (sum <= sumCashIn) {
            outBankn100 = Math.min((sum / 100), banknotes100);
            sum -= (outBankn100 * 100);
            if (sum > 0) {
                outBankn50 = Math.min((sum / 50), banknotes50);
            }
            sum -= (outBankn50 * 50);
            if (sum > 0) {
                if ((sum / 20) <= banknotes20) {
                    outBankn20 = sum / 20;
                }
            }
            sum -= (outBankn20 * 20);
            if (sum == 0) {
                possible = true;
                System.out.printf("Выдано купюр: номиналом 100 $ %s, номиналом 50 $ %s, номиналом 20 $ %s ",
                        outBankn100, outBankn50, outBankn20);
                System.out.println();
            } else {
                System.out.println("Введите сумму кратную 100, 50 или 20 $");
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