package unit_4.lockMethodTest3.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 16:54
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean fair) {
        this.lock = new ReentrantLock(fair);
    }

    public void serviceMethod(){
        try {
            boolean heldByCurrentThread = lock.isHeldByCurrentThread();
            System.out.println("当前线程是否保持了此锁定"+heldByCurrentThread);
            lock.lock();
            heldByCurrentThread = lock.isHeldByCurrentThread();
            System.out.println("当前线程是否保持了此锁定"+heldByCurrentThread);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
