package unit_4.z3_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 10:13
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void awaitMethod(){
        try {
            lock.lock();
            System.out.println("wait before");
            //await之前，必须获取对象锁才能调用await方法
            condition.await();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
