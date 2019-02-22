package unit_1.useReturnInterrupt;

/**
 * @author xiaogang
 * @date 2019/2/12 14:57
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1);
        myThread.interrupt();
    }
}
