package unit_1.t11;

/**
 * @author xiaogang
 * @date 2019/2/12 9:49
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
