package unit_2.StringAndSyn;

/**
 * @author xiaogang
 * @date 2019/2/18 16:41
 */
public class Thread1 extends Thread {
    private Service service;

    public Thread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
