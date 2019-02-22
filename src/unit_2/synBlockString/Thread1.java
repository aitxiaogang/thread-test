package unit_2.synBlockString;

import unit_2.t7.Task;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread1 extends Thread {
    Service service;

    public Thread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
