package unit_3.test2;

/**
 * @author xiaogang
 * @date 2019/2/19 18:15
 */
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始  notify time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束  notify time=" + System.currentTimeMillis());            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
