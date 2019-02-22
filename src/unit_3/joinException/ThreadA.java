package unit_3.joinException;

/**
 * @author xiaogang
 * @date 2019/2/21 16:04
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String s = new String();
            Math.random();
        }
    }
}
