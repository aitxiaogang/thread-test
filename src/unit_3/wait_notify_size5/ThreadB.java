package unit_3.wait_notify_size5;

/**
 * @author xiaogang
 * @date 2019/2/19 17:24
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                MyList.add();
                if (MyList.size1() == 5) {
                    lock.notify();
                    System.out.println("已经发出通知了");
                }
                System.out.println("添加了"+(i+1)+"个元素");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
