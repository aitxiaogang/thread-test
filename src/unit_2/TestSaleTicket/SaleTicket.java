package unit_2.TestSaleTicket;

/**
 * @author xiaogang
 * @date 2019/2/19 17:01
 */
public class SaleTicket implements Runnable {

    private int count = 50;
    Object object = new Object();

    @Override
    public void run() {
        synchronized (object) {
            while (count > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "     " + count--);
            }
        }
    }
}
