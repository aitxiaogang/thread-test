package unit_4.awaitUntilTest;

/**
 * @author xiaogang
 * @date 2019/2/22 18:24
 */
public class MyThreadB extends Thread{
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
