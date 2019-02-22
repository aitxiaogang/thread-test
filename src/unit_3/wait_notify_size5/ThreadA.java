package unit_3.wait_notify_size5;

/**
 * @author xiaogang
 * @date 2019/2/19 17:23
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size1() != 5) {
                    System.out.println(Thread.currentThread().getName() + ":wait begin");
                    lock.wait();
                    System.out.println(Thread.currentThread().getName() + ":wait end");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
