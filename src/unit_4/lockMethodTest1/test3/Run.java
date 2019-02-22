package unit_4.lockMethodTest1.test3;

/**
 * @author xiaogang
 * @date 2019/2/22 15:00
 */
public class Run {
    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  运行了");
                service.waitMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
