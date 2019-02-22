package unit_3.joinException;

/**
 * @author xiaogang
 * @date 2019/2/21 16:06
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
