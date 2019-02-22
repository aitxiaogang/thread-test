package unit_4.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 10:10
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
