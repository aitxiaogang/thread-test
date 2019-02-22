package unit_4.lockMethodTest3.test3;

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
            System.out.println("查询此锁是否由任意线程保持："+lock.isLocked());
            lock.lock();
            System.out.println("查询此锁是否由任意线程保持："+lock.isLocked());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
