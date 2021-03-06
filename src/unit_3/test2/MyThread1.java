package unit_3.test2;

/**
 * @author xiaogang
 * @date 2019/2/19 18:15
 */
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始  wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束  wait time=" + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
