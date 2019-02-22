package unit_3.notifyOne;

/**
 * @author xiaogang
 * @date 2019/2/20 12:19
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Object lock = new Object();
        ThreadA a = new ThreadA(service,lock);
        ThreadB b = new ThreadB(service,lock);
        ThreadC c = new ThreadC(service,lock);
        a.start();
        b.start();
        c.start();
        Thread.sleep(10);
        synchronized (lock){
//            lock.notify();
            lock.notifyAll();
        }
    }
}
