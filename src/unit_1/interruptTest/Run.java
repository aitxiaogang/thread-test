package unit_1.interruptTest;

/**
 * @author xiaogang
 * @date 2019/2/12 10:59
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start");
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
        System.out.println("main thread stop");
    }
}
