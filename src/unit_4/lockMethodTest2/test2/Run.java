package unit_4.lockMethodTest2.test2;

/**
 * @author xiaogang
 * @date 2019/2/22 16:30
 */
public class Run {
    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "  运行了");
            service.waitMethod();
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        Thread.sleep(500);
        service.notifyMethod();
    }
}
