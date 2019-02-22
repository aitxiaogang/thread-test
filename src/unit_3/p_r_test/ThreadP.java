package unit_3.p_r_test;

/**
 * @author xiaogang
 * @date 2019/2/20 16:49
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}

