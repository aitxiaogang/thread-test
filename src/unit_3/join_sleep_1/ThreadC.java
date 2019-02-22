package unit_3.join_sleep_1;

/**
 * @author xiaogang
 * @date 2019/2/21 16:28
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
