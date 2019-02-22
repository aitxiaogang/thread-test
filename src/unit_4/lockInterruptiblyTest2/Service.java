package unit_4.lockInterruptiblyTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 17:10
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin "+Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end  "+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
