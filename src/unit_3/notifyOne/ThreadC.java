package unit_3.notifyOne;

/**
 * @author xiaogang
 * @date 2019/2/20 12:17
 */
public class ThreadC extends Thread {

    private Service service;

    private Object lock;

    public ThreadC(Service service, Object lock) {
        this.service = service;
        this.lock = lock;
    }

    @Override
    public void run() {
        service.testMethod(lock);
    }
}
