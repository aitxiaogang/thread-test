package unit_4.lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 15:22
 */
public class Service {
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(condition)+"个线程正在等待 condition");
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
