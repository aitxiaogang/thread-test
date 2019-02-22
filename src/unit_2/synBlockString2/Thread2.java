package unit_2.synBlockString2;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread2 extends Thread {
    Service service;

    public Thread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
//        service.prin();
    }
}
