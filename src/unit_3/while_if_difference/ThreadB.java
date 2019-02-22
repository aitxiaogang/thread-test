package unit_3.while_if_difference;

/**
 * @author xiaogang
 * @date 2019/2/21 10:11
 */
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("唤醒一个lock的一个等待状态的线程  start");
            lock.notify();
            System.out.println("唤醒一个lock的一个等待状态的线程  end");
        }
    }
}
