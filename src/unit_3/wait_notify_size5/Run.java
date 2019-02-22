package unit_3.wait_notify_size5;

/**
 * @author xiaogang
 * @date 2019/2/19 17:28
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA t1 = new ThreadA(lock);
        t1.start();
        Thread.sleep(50);
        ThreadB t2 = new ThreadB(lock);
        t2.start();
    }
}
