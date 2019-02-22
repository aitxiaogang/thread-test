package unit_2.synLockIn_1;

/**
 * @author xiaogang
 * @date 2019/2/15 17:37
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
