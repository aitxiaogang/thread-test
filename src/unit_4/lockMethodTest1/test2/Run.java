package unit_4.lockMethodTest1.test2;

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
                service.serviceMethod1();
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
        System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁");
    }
}
