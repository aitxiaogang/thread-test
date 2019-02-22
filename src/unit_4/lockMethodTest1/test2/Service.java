package unit_4.lockMethodTest1.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 15:22
 */
public class Service {
    ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"  进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
