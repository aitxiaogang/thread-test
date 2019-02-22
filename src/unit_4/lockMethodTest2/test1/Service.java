package unit_4.lockMethodTest2.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
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
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }



}
