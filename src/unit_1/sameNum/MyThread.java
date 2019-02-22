package unit_1.sameNum;

/**
 * @author xiaogang
 * @date 2019/2/11 15:36
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    public synchronized void run() {
        System.out.println("i="+(i--)+" threadName=" + Thread.currentThread().getName());
    }
}
