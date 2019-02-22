package unit_1.t13_stop_thread;

/**
 * @author xiaogang
 * @date 2019/2/12 12:12
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(10);
        thread.interrupt();
    }
}
