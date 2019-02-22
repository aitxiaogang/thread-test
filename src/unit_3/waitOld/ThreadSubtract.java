package unit_3.waitOld;

/**
 * @author xiaogang
 * @date 2019/2/20 16:24
 */
public class ThreadSubtract extends Thread {

    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
