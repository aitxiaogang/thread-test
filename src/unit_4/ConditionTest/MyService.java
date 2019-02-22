package unit_4.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 11:04
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private boolean aturn = false;

    public void printA(){
        try {
            lock.lock();
            while (aturn) {
                System.out.println("*");
                aturn = false;
                conditionB.signal();
                conditionA.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    public void printB(){
        try {
            lock.lock();
            while (!aturn) {
                System.out.println("@");
                aturn = true;
                conditionA.signal();
                conditionB.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

    }
}
