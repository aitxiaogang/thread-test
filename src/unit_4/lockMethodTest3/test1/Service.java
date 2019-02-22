package unit_4.lockMethodTest3.test1;

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
            lock.lock();
            System.out.println("公平锁情况"+lock.isFair());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
