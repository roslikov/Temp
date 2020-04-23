package by.home.Lesson16;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The type Cash desk.
 */
class CashDesk {
    private final String cashDeskName;
    private final ReentrantLock lock;

    /**
     * Instantiates a new Cash desk.
     *
     * @param cashDeskName the cash desk name
     */
    CashDesk(String cashDeskName) {
        this.cashDeskName = cashDeskName;
        lock = new ReentrantLock();
    }

    private String getCashDeskName() {
        return this.cashDeskName;
    }

    /**
     * Gets goods.
     *
     * @param buyer the buyer
     * @return the goods
     */
    String getGoods(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        int item = rand.nextInt(buyer.getGoods().length);

        lock.lock();

        try {

            for (; item < buyer.getGoods().length; item++) {

                if (item != buyer.getGoods().length - 1) {
                    result.append(buyer.getGoods()[item]).append(", ");
                } else {
                    result.append(buyer.getGoods()[item]);
                }
            }

            Thread.sleep((int) (Math.random() * 100));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return this.getCashDeskName() + " обслужила покупателя " + buyer.getName() + " который купил: " + result;
    }

    /**
     * Gets lock.
     *
     * @return the lock
     */
    ReentrantLock getLock() {
        return lock;
    }
}