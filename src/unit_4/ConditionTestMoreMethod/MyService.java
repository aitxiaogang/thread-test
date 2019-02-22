package unit_4.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 9:48
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"   MyService.methodA begin time:"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"   MyService.methodA end time:"+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"   MyService.methodB begin time:"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"   MyService.methodB end time:"+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
