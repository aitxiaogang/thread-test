package unit_2.twoStop;

/**
 * @author xiaogang
 * @date 2019/2/18 16:41
 */
public class Thread2 extends Thread {
    private Service service;

    public Thread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
