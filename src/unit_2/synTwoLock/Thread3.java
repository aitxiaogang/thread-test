package unit_2.synTwoLock;

/**
 * @author xiaogang
 * @date 2019/2/18 16:41
 */
public class Thread3 extends Thread {
    private Service service;

    public Thread3(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
