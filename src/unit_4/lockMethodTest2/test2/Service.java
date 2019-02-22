package unit_4.lockMethodTest2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 16:20
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
        }finally{
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有没有线程正在等待condition?"+lock.hasWaiters(condition)
            +"  有多少"+lock.getWaitQueueLength(condition));
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
