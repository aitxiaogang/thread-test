package unit_3.stack_1;

/**
 * @author xiaogang
 * @date 2019/2/20 16:50
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
