package unit_2.synTwoLock;

import unit_2.t9.MyOneList;
import unit_2.t9.MyService;

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
        service.printB();
    }
}
