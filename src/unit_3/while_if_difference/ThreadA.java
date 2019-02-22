package unit_3.while_if_difference;

/**
 * @author xiaogang
 * @date 2019/2/20 18:47
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object b) {
        this.lock = b;
    }

    @Override
    public void run() {
        System.out.println("ThreadA.run");
        synchronized (lock) {
            try {
                System.out.println("if before");
                /*if*/while (ValueObject.b) {
                    System.out.println("wait before");
                    lock.wait();
                    System.out.println("wait end");
                }
                System.out.println("if after");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
