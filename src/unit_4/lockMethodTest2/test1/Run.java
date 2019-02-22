package unit_4.lockMethodTest2.test1;

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
        Thread a = new Thread(runnable);
        Thread b = new Thread(runnable);
        a.start();
        Thread.sleep(500);
        b.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(a));
        System.out.println(service.lock.hasQueuedThread(b));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
