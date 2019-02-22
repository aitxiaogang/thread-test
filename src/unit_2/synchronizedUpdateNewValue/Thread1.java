package unit_2.synchronizedUpdateNewValue;


/**
 * @author xiaogang
 * @date 2019/2/18 16:41
 */
public class Thread1 extends Thread {
    private Service service;

    public Thread1(Service list) {
        this.service = list;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
