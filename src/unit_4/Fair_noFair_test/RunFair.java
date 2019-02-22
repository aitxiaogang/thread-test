package unit_4.Fair_noFair_test;

/**
 * @author xiaogang
 * @date 2019/2/22 15:00
 */
public class RunFair {
    public static void main(String[] args) throws Exception {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
