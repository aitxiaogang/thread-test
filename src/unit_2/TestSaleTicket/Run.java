package unit_2.TestSaleTicket;

/**
 * @author xiaogang
 * @date 2019/2/19 17:03
 */
public class Run {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        Thread t1 = new Thread(saleTicket,"A");
        Thread t2 = new Thread(saleTicket,"B");
        t1.start();
        t2.start();
    }
}
