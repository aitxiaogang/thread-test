package unit_1.suspend_resume_test;

/**
 * @author xiaogang
 * @date 2019/2/12 15:13
 */
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
