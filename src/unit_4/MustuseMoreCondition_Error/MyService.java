package unit_4.MustuseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 10:42
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  await a begin time   "+System.currentTimeMillis());
            condition.await();
            System.out.println(Thread.currentThread().getName()+"  await a end   time   "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  await b begin time   "+System.currentTimeMillis());
            condition.await();
            System.out.println(Thread.currentThread().getName()+"  await b end   time   "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  singal all  time   "+System.currentTimeMillis());
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
