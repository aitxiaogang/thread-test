package unit_2.throwExceptionNoLock;

/**
 * @author xiaogang
 * @date 2019/2/15 18:06
 */
public class MyThread2 extends Thread {

    Service service;

    public MyThread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
