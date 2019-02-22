package unit_2.throwExceptionNoLock;

/**
 * @author xiaogang
 * @date 2019/2/15 18:06
 */
public class MyThread extends Thread {

    Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
