package unit_4.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 14:12
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  获得锁定");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
