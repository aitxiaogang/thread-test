package unit_4.awaitUninterruptiblyTest_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 18:15
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void testMethod(){
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        }finally{
            lock.unlock();
        }
    }
}
