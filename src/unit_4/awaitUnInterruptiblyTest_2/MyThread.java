package unit_4.awaitUnInterruptiblyTest_2;

/**
 * @author xiaogang
 * @date 2019/2/22 18:17
 */
public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
