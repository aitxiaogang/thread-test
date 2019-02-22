package unit_4.awaitUninterruptiblyTest_1;

/**
 * @author xiaogang
 * @date 2019/2/22 18:17
 */
public class Run {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThread myThread = new MyThread(service);
        myThread.start();
        Thread.sleep(3000);
        myThread.interrupt();
    }
}
