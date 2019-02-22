package unit_4.UseConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 10:17
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("wait time:" + System.currentTimeMillis());
            condition.await();
            System.out.println("wait end:" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("singal time:"+System.currentTimeMillis());
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
